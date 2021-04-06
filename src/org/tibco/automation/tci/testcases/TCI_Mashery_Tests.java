package org.tibco.automation.tci.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tibco.automation.shared.utilities.InitBrowser;

import org.tibco.automation.tci.testlogic.TCI_Auditsafe_Methods;
import org.tibco.automation.tci.testlogic.TCI_Mashery_Methods;
import org.tibco.automation.tsc.testlogic.TSC_Mashery_Methods;
import org.tibco.automation.tsc.testlogic.TSC_TCI_Methods;

import com.aventstack.extentreports.Status;

public class TCI_Mashery_Tests extends InitBrowser{

private static WebDriver driver;
	
	String url, keyvalue;
		
	@BeforeClass
	void setup(){
		driver = getDriver();
	}
	
	@Test(priority=1)
	public void TCI_Mashery_11() throws Exception {
		TSC_TCI_Methods obj = new TSC_TCI_Methods(driver);	
		TCI_Mashery_Methods objm=new TCI_Mashery_Methods(driver);
		TCI_Auditsafe_Methods obja=new TCI_Auditsafe_Methods(driver);
		logger = extent.createTest("TCI_Mashery 1.1: Create FLOGO application using  PostAuditEvent activitiy .");
		log.info("Execution of TCI_Mashery 1.1 started...");
		String propFile = System.getProperty("user.dir")+"/src/org/tibco/automation/shared/data/files/config.properties";
		obja.reachTCI(getPropValue(propFile,"TCI_Mashery_user"), getPropValue(propFile,"password"), getPropValue(propFile, "baseURL"));
		String flogoApp = System.getProperty("user.dir") + "\\src\\org\\tibco\\automation\\shared\\data\\files\\Flogo\\TCI_LA.json";
		obja.createFlogoApp(flogoApp, "Flogo");
		Thread.sleep(5000);
		obj.scale_tciapp(1);
		Thread.sleep(15000);
		if(objm.validateEndpoint()==false){
			log.error("Error in Auditsafe 1.1...");
			logger.log(Status.FAIL, "");
			driver.navigate().refresh();
			Assert.fail(" ");
		}
		objm.publishTomashery(driver,"flogo");
//		backTOParent_window();
		objm.reachMashery();
		//driver.navigate().to("https://eval395769.admin.thanos.mashspud.com/");
		
		//backTOParent_window();
		Thread.sleep(10000);
		objm.setPackageToEveryone(driver,"flogo");
		keyvalue=objm.CreateApplication(driver,"flogo");
		url=objm.getAPIurl(driver,"flogo");
		//obja.reachTAS();
		System.out.println("url: "+url);
		System.out.println("key :"+keyvalue);
		driver.navigate().to(url+"?api_key="+keyvalue);
		Thread.sleep(50000);
//		if(obja.validateTASConnection()==false){
//			log.error("Error in Auditsafe 1.1...");
//			logger.log(Status.FAIL, "");
//			driver.navigate().refresh();
//			Assert.fail(" ");
//		}
		logger.log(Status.PASS, "Validation PASSED: HTTP trigger activity and PostAuditEvent and configure");
		Thread.sleep(1000);
	
		objm.deletePackage(driver);
		objm.deleteApi(driver);
		objm.deleteApplication(driver);
		//backTOParent_window();
	
	}
}
