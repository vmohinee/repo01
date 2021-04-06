package org.tibco.automation.tci.testcases;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tibco.automation.shared.utilities.InitBrowser;

import org.tibco.automation.tci.testlogic.TCI_LiveApps_Methods;
import org.tibco.automation.tsc.testlogic.TSC_TCI_Methods;

import com.aventstack.extentreports.Status;

public class TCI_LiveApps_Tests extends InitBrowser{
	
private static WebDriver driver;
	
	
		
	@BeforeClass
	void setup(){
		driver = getDriver();
	}
	
	@Test(priority=1)
	public void tci_liveapps_11() throws Exception {
		TCI_LiveApps_Methods obj = new TCI_LiveApps_Methods(driver);
		TSC_TCI_Methods obj1 = new TSC_TCI_Methods(driver);
		logger = extent.createTest("TCI_LiveApps 1.1: Flogo+LiveApps interaction end to end");
		log.info("Execution of TCI_LiveApps 1.1 started...");
		String propFile = System.getProperty("user.dir")+"/src/org/tibco/automation/shared/data/files/config.properties";	
		obj.LAsCallTCIFlogo(getPropValue(propFile,"shared_username"), getPropValue(propFile,"shared_password"));
		//obj.reachLAS();
		obj.createLAsApp();
		obj.configureFLogoLAsInputOutput();
		obj.selectCreateState();
		obj.testLAsApp("test123");
		if(obj.verifyStatusOK()==false){
			log.error("Error in TCI_LiveApps 1.1...");
			logger.log(Status.FAIL, "");
			driver.navigate().refresh();
			Assert.fail(" ");
		}
		logger.log(Status.PASS, "");
		Thread.sleep(1000);
	}

}
