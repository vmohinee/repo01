package org.tibco.automation.tci.testlogic;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.tibco.automation.shared.utilities.InitBrowser;
import org.tibco.automation.tci.objrepo.TCI_Auditsafe;
import org.tibco.automation.tsc.objrepo.TSC_TCI;

import com.gargoylesoftware.htmlunit.javascript.SimpleScriptable;
import com.gargoylesoftware.htmlunit.javascript.host.Iterator;
import com.gargoylesoftware.htmlunit.javascript.host.Set;

public class TCI_Auditsafe_Methods extends TSC_TCI{
	TCI_Auditsafe obj=new TCI_Auditsafe();
	public TCI_Auditsafe_Methods(WebDriver driver){
		this.driver=driver;
	}
	public static String parentwindow, c;
	static SimpleScriptable chid;
	public String winHandleBefore;
	//public String winHandle;
	public String errormsg;
	public void reachTCI(String uname, String password, String BaseURL) throws Exception{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		perform_login_withBaseURL(uname, password, BaseURL);
		Thread.sleep(3000);
		winHandleBefore = driver.getWindowHandle();
		parentwindow = driver.getWindowHandle(); 
		click(driver, btn_gnh_menu(driver));
		Thread.sleep(1000);
		click(driver, integration_apps(driver));
		Thread.sleep(2000);
		GoTOChild_window();
		Thread.sleep(6000);
		//click(driver, btn_createimport(driver));
	}
	
	public void reachTCI_refresh() throws Exception{
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.navigate().refresh();
		Thread.sleep(3000);
		parentwindow = driver.getWindowHandle();
		click(driver, btn_gnh_menu(driver));
		Thread.sleep(1000);
		click(driver, integration_apps(driver));
		Thread.sleep(2000);
		GoTOChild_window();
		//click(driver, btn_createimport(driver));
	}
	
	public void openFlogoApp() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		click(driver,btn_openApp(driver));
		Thread.sleep(1000);
		click(driver,open_flogoFlow(driver));
		Thread.sleep(1000);
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
		uploadFile(filepath);
		Thread.sleep(2000);
		explicitWait_Click(driver, btn_Upload);
		click(driver, btn_importall(driver));
		Thread.sleep(15000);
		click(driver, btn_push(driver));
		Thread.sleep(2000);
		//backTOParent_window();
	}
	
	public void reachTAS() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		click(driver, btn_gnh_menu(driver));
		Thread.sleep(1000);
		//GoTOChild_window();
		click(driver, btn_audisafe(driver));
		Thread.sleep(1000);
		GoTOChild_window();
		Thread.sleep(10000);
	}
	
	
	public boolean validateTASConnection()throws Exception {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		boolean b = false;
		String validmsg = null;
		Thread.sleep(15000);
		try {
			click(driver, obj.btn_TryWithDemoData(driver));
			Thread.sleep(1000);
			click(driver, obj.btn_DemoMode(driver));
			Thread.sleep(1000);
			click(driver, obj.btn_Select(driver));
			Thread.sleep(1000);
			click(driver, obj.btn_TransctionID(driver));
			Thread.sleep(1000);
			click(driver, obj.btn_equals(driver));
			Thread.sleep(1000);
			Actions action = new Actions(driver);
			try{
				action.moveToElement(obj.input_TransactioId(driver)).click();
				obj.input_TransactioId(driver).sendKeys("12345");
			} catch(Exception e){
				log.error(e);
				throw e;
			}
			//sendKeys(driver, obj.input_TransactioId(driver), "12345");
			click(driver, obj.btn_Find(driver));
			Thread.sleep(1000);
			if (obj.msg_fromTas(driver).isDisplayed())
				validmsg = validate_responcecode(driver).getText();
			System.out.println("EXPECTED: " + validmsg);
			
			b = true;
		} catch (Exception e) {
			String screenShot = captureScreen(driver,"src3");
			InitBrowser.logger.fail("Screen Shot : " + InitBrowser.logger.addScreenCaptureFromPath(screenShot));
		//backTOParent_window();
		log.error(e);
	}
	//backTOParent_window();
	return b;
	}
	
	public boolean validateEndpoint() throws Exception {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		boolean b = false;
		try {
			Thread.sleep(3000);
			click(driver, btn_endpoint(driver));
			Thread.sleep(1000);
			click(driver, btn_test(driver));
			Thread.sleep(1000);
			click(driver,btn_POST_activity(driver));
			Thread.sleep(1000);
			click(driver,btn_try_it_out(driver));
			Thread.sleep(3000);
			click(driver, btn_execute(driver));
			String validmsg = null;
			Thread.sleep(5000);
			if (validate_responcecode(driver).isDisplayed())
				validmsg = validate_responcecode(driver).getText();
			System.out.println("EXPECTED: " + validmsg);
			b = true;
		} catch (Exception e) {
				String screenShot = captureScreen(driver,"src3");
				InitBrowser.logger.fail("Screen Shot : " + InitBrowser.logger.addScreenCaptureFromPath(screenShot));
			click(driver, detailsbackArrow(driver));
			Thread.sleep(2000);
			log.error(e);
		}
		click(driver, detailsbackArrow(driver));
		Thread.sleep(2000);
		return b;	
	}
	
	
}
