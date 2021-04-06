package org.tibco.automation.tci.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tibco.automation.shared.utilities.InitBrowser;
import org.tibco.automation.tci.testlogic.TCI_CloudEvents_Methods;
import org.tibco.automation.tci.testlogic.TCI_LiveApps_Methods;
import org.tibco.automation.tsc.testlogic.TSC_TCI_Methods;

import com.aventstack.extentreports.Status;

public class TCI_CloudEvents_Tests extends InitBrowser{
	
private static WebDriver driver;
	
	
		
	@BeforeClass
	void setup(){
		driver = getDriver();
	}
	
	@Test(priority=1)
	public void tci_cloudevents_11() throws Exception {
		TCI_CloudEvents_Methods obj = new TCI_CloudEvents_Methods(driver);
		TSC_TCI_Methods obj1 = new TSC_TCI_Methods(driver);
		logger = extent.createTest("TCI_CloudEvents 1.1: TCE+Flogo interaction for Public TCE app end to end");
		log.info("Execution of TCI_CloudEvents 1.1 started...");
		String propFile = System.getProperty("user.dir")+"/src/org/tibco/automation/shared/data/files/config.properties";
		obj1.reachTCI(getPropValue(propFile,"shared_username"), getPropValue(propFile,"shared_password"));	
		String flogoApp = System.getProperty("user.dir") + "\\src\\org\\tibco\\automation\\shared\\data\\files\\TCE\\call_TCEPublic.json";
		obj1.createFlogoApp(flogoApp, "Flogo");
		Thread.sleep(3000);
		obj1.scale_tciapp(1);
		Thread.sleep(10000);
		if(obj.verifyEndpoint()==false){
			log.error("Error in TCI_CloudEvents 1.1...");
			logger.log(Status.FAIL, "");
			driver.navigate().refresh();
			Assert.fail(" ");
		}
		logger.log(Status.PASS, "");
		Thread.sleep(1000);
	}
	
//	@Test(priority=2)
//	public void tci_cloudevents_12() throws Exception {
//		TCI_CloudEvents_Methods obj = new TCI_CloudEvents_Methods(driver);
//		logger = extent.createTest("TCI_CloudEvents 1.2: TCE+Flogo interaction for Public TCE app end to end");
//		log.info("Execution of TCI_CloudEvents 1.2 started...");
//		String propFile = System.getProperty("user.dir")+"/src/org/tibco/automation/shared/data/files/config.properties";		
//		obj.createSB(getPropValue(propFile,"shared_username"), getPropValue(propFile,"shared_password"));
//		obj.moveAppToSB();
//		//if(obj.verifyStatusOK()==false){
////			log.error("Error in TCI_LiveApps 1.1...");
////			logger.log(Status.FAIL, "");
////			driver.navigate().refresh();
////			Assert.fail(" ");
////		}
////		logger.log(Status.PASS, "");
////		Thread.sleep(1000);
//	}

}
