package org.tibco.automation.tsc.testlogic;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.tibco.automation.tsc.objrepo.TSC_TCE;


public class TSC_TCE_Methods extends TSC_TCE{
	
	public TSC_TCE_Methods(WebDriver driver){
		this.driver=driver;
	}
	
	public String winHandleBefore;
	public String errormsg;
	
	public void reachTCE(String uname, String password) throws Exception{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		perform_login(uname, password);
		Thread.sleep(3000);
		winHandleBefore = driver.getWindowHandle();
		click(driver, btn_gnh_menu(driver));
		Thread.sleep(1000);
		click(driver, tce(driver));
		Thread.sleep(2000);
		
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		Thread.sleep(1000);
	}
	
	public void createTCEApp(String filepath) throws InterruptedException, AWTException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		click(driver, btn_upload(driver));
		Thread.sleep(1000);
		click(driver, browseToUpload(driver));
		Thread.sleep(1000);
		uploadFile(filepath);
		Thread.sleep(1000);
		click(driver, btn_push(driver));
		Thread.sleep(5000);
		explicitWait_Click(driver, appstate_Running);		
	}
	
	public void scale_tceapp(int num) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		for (int i = 0; i < num; i++){
			explicitWait_Click(driver, scale_up);
		}
		click(driver, scale(driver));
	}
	
	public boolean validateTCEAppLimit() throws IOException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		boolean b=false;
		try{
			Thread.sleep(1000);
			if(errorMsg_FailedToScale(driver).isDisplayed())
				errormsg = errorMsg_FailedToScale(driver).getText();
				System.out.println("EXPECTED: "+errormsg);
				b=true;
		} catch (Exception e){
//			String screenShot = captureScreen(driver,"src3");
//			InitBrowser.logger.fail("Screen Shot : " + InitBrowser.logger.addScreenCaptureFromPath(screenShot));
			log.error(e);
		}
		return b;		
	}
	
	

}
