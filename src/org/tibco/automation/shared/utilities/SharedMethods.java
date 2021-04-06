package org.tibco.automation.shared.utilities;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.codec.binary.Base64;
import org.tibco.automation.shared.utilities.InitBrowser;


public class SharedMethods {
	
	Actions actions;
	public Logger log = Logger.getLogger("rootLogger");
	public WebDriver driver;
	
	public static String parentwindow;
	public static String child;
	public WebElement btn_gnh_menu(WebDriver driver){
		return driver.findElement(By.xpath("//button[@id='gnh-menu-btn-products']"));
	}
	
	public WebElement emailaddr_tbox(WebDriver driver){
		return driver.findElement(By.xpath("//input[@id='email']"));
	}
	
	public WebElement emailaddrnext_btn(WebDriver driver){
		return driver.findElement(By.id("next"));
	}
	
	public WebElement password_tbox(WebDriver driver){
		return driver.findElement(By.id("password"));
	}
	
	public WebElement login_btn(WebDriver driver){
		return driver.findElement(By.xpath("//button[text()='TIBCO LOGIN']"));
	}
	
	public void enter_uname(String uname){
		try{
			sendKeys(driver, emailaddr_tbox(driver), uname);
		} catch(Exception e){
			log.error(e);
		}
	}
	
	public void enter_password(String password){
		try{
			sendKeys(driver,password_tbox(driver),password);
		} catch(Exception e){
			log.error(e);
		}
	}
	
	public void perform_login(String uname, String password){
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		actions = new Actions(driver);
		try{
			Thread.sleep(2000);
			enter_uname(uname);
			actions.moveToElement(emailaddrnext_btn(driver)).click().build().perform();
			enter_password(password);
			click(driver,login_btn(driver));
			Thread.sleep(3000);
		} catch (Exception e){
			log.error(e);
		}
	}
	
	
	public void perform_login_withBaseURL(String uname, String password, String BaseURL){
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to(BaseURL);
		actions = new Actions(driver);
		try{
			Thread.sleep(2000);
			enter_uname(uname);
			actions.moveToElement(emailaddrnext_btn(driver)).click().build().perform();
			enter_password(password);
			click(driver,login_btn(driver));
			Thread.sleep(3000);
		} catch (Exception e){
			log.error(e);
		}
	}
	
	public String getPropValue(String file, String key) throws IOException{
		File f = new File(file);
		FileInputStream fis = new FileInputStream(f);
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(key);
	}
	
	public void getScreenshot(WebDriver driver, String filename) throws IOException{
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File(System.getProperty("user.dir") + "/src/org/tibco/automation/liveapps/data/screenshots/"+filename+dateName));
	}
	
	public String captureScreen(WebDriver driver, String screenName) throws IOException{		
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot screen = (TakesScreenshot) driver;
		File src = screen.getScreenshotAs(OutputType.FILE);		
		String dest = System.getProperty("user.dir")+"/src/org/tibco/automation/shared/data/screenshots/"+screenName+dateName+".png";		
		File target = new File(dest);
		FileUtils.copyFile(src, target);		
		return dest;
	}
	
	public String captureScreenXSS(WebDriver driver, String screenName) throws IOException, HeadlessException, AWTException{		
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		String dest = System.getProperty("user.dir")+"/src/org/tibco/automation/shared/data/screenshots/"+screenName+dateName+".png";		
		File target = new File(dest);
		BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
	    ImageIO.write(image, "png", target);
		//FileUtils.copyFile(src, target);		
		return dest;
	}
		
	public void click(WebDriver driver, WebElement element){
		Actions action = new Actions(driver);
		try{
			action.moveToElement(element).click().build().perform();
		} catch (Exception e){
			log.error(e);
		}
	}
	
	public void sendKeys(WebDriver driver, WebElement element, String txt) throws Exception{
		Actions action = new Actions(driver);
		try{
			action.moveToElement(element).click();
			element.clear();
			element.sendKeys(txt);
		} catch(Exception e){
			log.error(e);
			throw e;
		}
	}
	
	public void explicitWait(WebDriver driver,  String xpath){
		WebElement element;
		WebDriverWait wait=new WebDriverWait(driver,20);
		element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		click(driver, element);
	}
	
	public void explicitWait_Click(WebDriver driver,  By ele){
		WebElement element;
		WebDriverWait wait=new WebDriverWait(driver,70);
		element=wait.until(ExpectedConditions.visibilityOfElementLocated(ele));		
		click(driver, element);
	}
	
	public void waitForAlert(WebDriver driver){
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.alertIsPresent());	
	}
	
	public void waitForElement(WebDriver driver, By ele){
		WebDriverWait wait=new WebDriverWait(driver,300);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ele));	
	}
	
	public void enterKeypress(String filepath) throws AWTException, InterruptedException{
		StringSelection stringSelection = new StringSelection(filepath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public void uploadFile(String filepath) throws AWTException, InterruptedException{
		StringSelection stringSelection = new StringSelection(filepath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public void switchToParentWin() throws InterruptedException{
		Set<String> tabs = driver.getWindowHandles();
		Thread.sleep(1000);
		driver.close();
		Thread.sleep(1000);
		driver.switchTo().window((String) tabs.toArray()[0]);
		Thread.sleep(1000);		
	}
	
	public void clickShadowDOMElement(String query_selector) throws InterruptedException {
		Actions action = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement ele = (WebElement) js.executeScript("return "+query_selector+"\"");
		Thread.sleep(1000);
		System.out.println(ele);
		action.moveToElement(ele).click().build().perform();
		Thread.sleep(2000);
	}
	

	public void refresh_page() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().refresh();
		Thread.sleep(3000);
	}
	
	public void GoTOChild_window()
	{
		parentwindow = driver.getWindowHandle(); 
		for(String winHandle : driver.getWindowHandles()){
			if(!winHandle.equalsIgnoreCase(parentwindow)) {
		    driver.switchTo().window(winHandle);
		    child=driver.getTitle();
			System.out.print("child: "+driver.getTitle());
		    }
		}
	}
	
	public void backTOParent_window() throws InterruptedException
	{
		for(String winHandle : driver.getWindowHandles()){
			driver.close();
			driver.switchTo().window(parentwindow);
			System.out.println("Parent" + parentwindow);
//			if(child.equalsIgnoreCase(driver.getTitle()))
//			{
//				Thread.sleep(2000);
//				driver.close();
//				Thread.sleep(1000);
//				driver.switchTo().window(parentwindow);
//			}
	       	System.out.println(driver.switchTo().window(parentwindow).getTitle());
	        Thread.sleep(3000);
        }
		//driver.switchTo().window(parentwindow);
	}
	
}
