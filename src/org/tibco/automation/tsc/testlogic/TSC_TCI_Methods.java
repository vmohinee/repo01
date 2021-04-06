package org.tibco.automation.tsc.testlogic;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.tibco.automation.shared.utilities.InitBrowser;
import org.tibco.automation.tsc.objrepo.TSC_TCI;

public class TSC_TCI_Methods extends TSC_TCI {
	
	public TSC_TCI_Methods(WebDriver driver){
		this.driver=driver;
	}
	
	public String winHandleBefore;
	//public String winHandle;
	public String errormsg,validmsg;
	
	public void reachTCI(String uname, String password) throws Exception{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		perform_login(uname, password);
		Thread.sleep(3000);
		//winHandleBefore = driver.getWindowHandle();
		click(driver, btn_gnh_menu(driver));
		Thread.sleep(1000);
		click(driver, integration_apps(driver));
		Thread.sleep(2000);
		GoTOChild_window();
//		for(String winHandle : driver.getWindowHandles()){
//		    driver.switchTo().window(winHandle);
//		}
		Thread.sleep(1000);
		//click(driver, btn_createimport(driver));
	}
	
	public void createFlogoApp(String filepath, String apptype) throws InterruptedException, AWTException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		click(driver, btn_createimport(driver));
		click(driver, tciapp(driver, apptype));
		click(driver, createnewapp(driver));
		click(driver, importapp(driver));
		Thread.sleep(1000);
		click(driver, browsetoUpload(driver));
		Thread.sleep(1000);
		uploadFile(filepath);
		Thread.sleep(1000);
		explicitWait_Click(driver, btn_Upload);
		click(driver, btn_importall(driver));
		click(driver, btn_push(driver));
	}
	
	public void scale_tciapp(int num) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		explicitWait_Click(driver, appscale);	
		for (int i = 0; i < num; i++){
			explicitWait_Click(driver, scaleup);
		}
		click(driver, btn_scale(driver));
	}
	
	public void createNodeJSApp(String apptype, String filepath1, String filepath2) throws InterruptedException, AWTException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		click(driver, tciapp(driver, apptype));
		click(driver, btn_next(driver));
		click(driver, browsetoUploadNode(driver));
		Thread.sleep(2000);
		uploadFile(filepath1);
		Thread.sleep(1000);
		click(driver, browsetoUploadNode(driver));
		Thread.sleep(2000);
		uploadFile(filepath2);
		Thread.sleep(1000);
		explicitWait_Click(driver, btn_importApp);
		Thread.sleep(1000);
	}
	
	public boolean validateAppLimit() throws IOException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		boolean b=false;
		try{
			Thread.sleep(1000);
			click(driver, appstate(driver));
			if(msg_subscriptionCheckFailed(driver).isDisplayed())
				errormsg = msg_subscriptionCheckFailed(driver).getText();
				System.out.println("EXPECTED: "+errormsg);
				b=true;
		} catch (Exception e){
//			String screenShot = captureScreen(driver,"src3");
//			InitBrowser.logger.fail("Screen Shot : " + InitBrowser.logger.addScreenCaptureFromPath(screenShot));
			click(driver, detailsbackArrow(driver));
			log.error(e);
		}
		click(driver, detailsbackArrow(driver));
		return b;		
	}
	
	public boolean validateFlogoTester() throws IOException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		boolean b=false;
		try{
			Thread.sleep(1000);
			click(driver, btn_Test(driver));
			Thread.sleep(1000);
			click(driver,Create_configuration(driver));
			Thread.sleep(1000);
			click(driver,btn_Next(driver));
			click(driver, btn_Run(driver));
			Thread.sleep(2000);
			if(msg_flogo_tester(driver).isDisplayed())
				validmsg =msg_flogo_tester(driver).getText();
				System.out.println("EXPECTED: "+validmsg);
				Thread.sleep(2000);
				b=true;
		} catch (Exception e){
//			String screenShot = captureScreen(driver,"src3");
//			InitBrowser.logger.fail("Screen Shot : " + InitBrowser.logger.addScreenCaptureFromPath(screenShot));
			click(driver, btn_StopTesting(driver));
			click(driver, detailsbackArrow(driver));
			click(driver, detailsbackArrow(driver));
			log.error(e);
		}
		click(driver, btn_StopTesting(driver));
		Thread.sleep(1000);
		click(driver, detailsbackArrow(driver));
		click(driver, detailsbackArrow(driver));
		Thread.sleep(1000);
		return b;		
	}
	public void deleteTCIApp() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
		Actions actions = new Actions(driver);
		actions.moveToElement(row(driver)).perform();
		click(driver, deleteicon(driver));
		click(driver, btn_delete(driver));
		Thread.sleep(3000);
	}
	
	public void createBWApp(String apptype, String filepath1, String filepath2) throws InterruptedException, AWTException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(1000);
		click(driver, btn_createimport(driver));
		createNodeJSApp(apptype, filepath1, filepath2);		
	}

}
