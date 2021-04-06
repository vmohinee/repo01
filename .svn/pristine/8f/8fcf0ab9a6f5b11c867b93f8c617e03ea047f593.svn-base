package org.tibco.automation.tci.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tibco.automation.shared.utilities.InitBrowser;

import org.tibco.automation.tci.testlogic.TCI_Auditsafe_Methods;
import org.tibco.automation.tsc.testlogic.TSC_Mashery_Methods;
import org.tibco.automation.tsc.testlogic.TSC_TCI_Methods;

import com.aventstack.extentreports.Status;

public class TCI_Auditsafe_Tests extends InitBrowser{

private static WebDriver driver;
	
	
		
	@BeforeClass
	void setup(){
		driver = getDriver();
	}
	
	@Test(priority=1)
	public void Auditsafe_11() throws Exception {
		TSC_TCI_Methods obj = new TSC_TCI_Methods(driver);	
		TCI_Auditsafe_Methods obja=new TCI_Auditsafe_Methods(driver);
		logger = extent.createTest("Auditsafe 1.1: Create FLOGO application using  PostAuditEvent activitiy .");
		log.info("Execution of Auditsafe 1.1 started...");
		String propFile = System.getProperty("user.dir")+"/src/org/tibco/automation/shared/data/files/config.properties";
		obja.reachTCI(getPropValue(propFile,"Tas_username"), getPropValue(propFile,"Tas_password"), getPropValue(propFile, "baseURL"));
		String flogoApp = System.getProperty("user.dir") + "\\src\\org\\tibco\\automation\\shared\\data\\files\\Auditsafe\\PostAuditsafe_app.json";
		obja.createFlogoApp(flogoApp, "Flogo");
		
		Thread.sleep(5000);
		obj.scale_tciapp(1);
		Thread.sleep(15000);
		if(obja.validateEndpoint()==false){
			log.error("Error in Auditsafe 1.1...");
			logger.log(Status.FAIL, "");
			driver.navigate().refresh();
			Assert.fail(" ");
		}
		//backTOParent_window();
		//obja.reachTAS();
		driver.navigate().to("https://auditsafe.iqa-pune.eu-west-1.tcie.pro/");
		Thread.sleep(50000);
		if(obja.validateTASConnection()==false){
			log.error("Error in Auditsafe 1.1...");
			logger.log(Status.FAIL, "");
			driver.navigate().refresh();
			Assert.fail(" ");
		}
		logger.log(Status.PASS, "Validation PASSED: HTTP trigger activity and PostAuditEvent and configure");
		Thread.sleep(1000);
	
		//obj.deleteTCIApp();	
		//backTOParent_window();
	
	}
	
	@Test(priority=2)
	public void Audisafe_12() throws Exception {
		TSC_TCI_Methods obj = new TSC_TCI_Methods(driver);	
		TCI_Auditsafe_Methods obja=new TCI_Auditsafe_Methods(driver);
		logger = extent.createTest("Auditsafe 1.2: Create Flogo application with TAS activities -> test application using FLOGO tester  .");
		log.info("Execution of Auditsafe 1.2 started...");
		//backTOParent_window();
		//obja.reachTCI_refresh();
		driver.navigate().to("https://integration.iqa-pune.eu-west-1.tcie.pro/applications");
		Thread.sleep(5000);
		obja.openFlogoApp();
		Thread.sleep(5000);
		if(obj.validateFlogoTester()==false){
			log.error("Error in Auditsafe 1.1...");
			logger.log(Status.FAIL, "");
			driver.navigate().refresh();
			Assert.fail(" ");
		}
		logger.log(Status.PASS, "Validation PASSED: HTTP trigger activity and PostAuditEvent and configure");
		Thread.sleep(1000);
		obj.deleteTCIApp();	
	//	backTOParent_window();
	
	}
		
    @Test(priority=3)
	public void Auditsafe_13() throws Exception {
		TSC_TCI_Methods obj = new TSC_TCI_Methods(driver);	
		TCI_Auditsafe_Methods obja=new TCI_Auditsafe_Methods(driver);
		logger = extent.createTest("Auditsafe 1.2: Import AuditSafe sample application and test end to end .");
		log.info("Execution of Auditsafe 1.1 started...");
		String propFile = System.getProperty("user.dir")+"/src/org/tibco/automation/shared/data/files/config.properties";
		//obja.reachTCI_refresh();
		//refresh_page();
		String flogoApp = System.getProperty("user.dir") + "\\src\\org\\tibco\\automation\\shared\\data\\files\\Auditsafe\\AuditSafeDemo.json";
		obja.createFlogoApp(flogoApp, "Flogo");
		Thread.sleep(3000);
		obj.scale_tciapp(1);
		Thread.sleep(15000);
		if(obja.validateEndpoint()==false){
			log.error("Error in Auditsafe 1.1...");
			logger.log(Status.FAIL, "");
			driver.navigate().refresh();
			Assert.fail(" ");
		}
		logger.log(Status.PASS, "Validation PASSED:  AuditSafe sample application and test end to end");
		Thread.sleep(1000);
		//obj.deleteTCIApp();	
		//driver.close();
		//switchToParentWin();
	
	}
    @Test(priority = 4)
    public void Auditsafe_14() throws Exception {
		TSC_TCI_Methods obj = new TSC_TCI_Methods(driver);	
		TCI_Auditsafe_Methods obja=new TCI_Auditsafe_Methods(driver);
		logger = extent.createTest("Auditsafe 1.4: Get auditsafe activity application and test end to end .");
		log.info("Execution of Auditsafe 1.4 started...");
		String propFile = System.getProperty("user.dir")+"/src/org/tibco/automation/shared/data/files/config.properties";
		//obja.reachTCI_refresh();
		//refresh_page();
		String flogoApp = System.getProperty("user.dir") + "\\src\\org\\tibco\\automation\\shared\\data\\files\\Auditsafe\\getpost.json";
		obja.createFlogoApp(flogoApp, "Flogo");
		Thread.sleep(3000);
		obj.scale_tciapp(1);
		Thread.sleep(15000);
		if(obja.validateEndpoint()==false){
			log.error("Error in Auditsafe 1.1...");
			logger.log(Status.FAIL, "");
			driver.navigate().refresh();
			Assert.fail(" ");
		}
		logger.log(Status.PASS, "Validation PASSED:  AuditSafe sample application and test end to end");
		Thread.sleep(1000);
		obj.deleteTCIApp();	
		Thread.sleep(1000);
		obj.deleteTCIApp();
		//driver.close();
		//switchToParentWin();
	
	}
}	