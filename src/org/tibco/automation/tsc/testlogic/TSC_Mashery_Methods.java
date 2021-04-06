package org.tibco.automation.tsc.testlogic;

import org.tibco.automation.shared.utilities.SharedMethods;

import org.tibco.automation.tsc.objrepo.TSC_TCI;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TSC_Mashery_Methods extends TSC_TCI{
	public TSC_Mashery_Methods(WebDriver driver){
		this.driver=driver;
	}

	public String winHandleBefore;
	//public String winHandle;
	public String errormsg;
	public void reachTCI(String uname, String password, String BaseURL) throws Exception{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		perform_login_withBaseURL(uname, password, BaseURL);
		Thread.sleep(3000);
		winHandleBefore = driver.getWindowHandle();
		click(driver, btn_gnh_menu(driver));
		Thread.sleep(1000);
		click(driver, integration_apps(driver));
		Thread.sleep(2000);
		
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		Thread.sleep(6000);
		//click(driver, btn_createimport(driver));
	}
	
	public void reachTCI_refresh() throws Exception{
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.navigate().refresh();
		Thread.sleep(3000);
		winHandleBefore = driver.getWindowHandle();
		click(driver, btn_gnh_menu(driver));
		Thread.sleep(1000);
		click(driver, integration_apps(driver));
		Thread.sleep(2000);
		
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		Thread.sleep(6000);
		//click(driver, btn_createimport(driver));
	}
	public void createFlogoApp(String filepath, String apptype) throws Exception {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		click(driver, btn_createimport(driver));
		click(driver, tciapptype(driver, apptype));
		click(driver, createnewapp(driver));
		click(driver, importapp(driver));
		Thread.sleep(2000);
		click(driver, browsetoUpload(driver));
		Thread.sleep(3000);
		//sendKeys(driver,browsetoUpload(driver), filepath);
		//driver.findElement( By.xpath("//a[text()='browse to upload']")).sendKeys(filepath);
		
		uploadFile(filepath);
		Thread.sleep(1000);
		explicitWait_Click(driver, btn_Upload);
		click(driver, btn_importall(driver));
		click(driver, btn_push(driver));
	}
}
