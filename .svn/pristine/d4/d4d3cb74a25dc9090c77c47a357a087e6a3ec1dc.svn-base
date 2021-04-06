package org.tibco.automation.tsc.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tibco.automation.shared.utilities.InitBrowser;

import org.tibco.automation.tsc.testlogic.TSC_Spotfire_Methods;
import com.aventstack.extentreports.Status;

public class TSC_Spotfire_Tests extends InitBrowser{

private static WebDriver driver;
	
	@BeforeClass
	void setup(){
		driver = getDriver();
	}
				
	@Test(priority=1)
	public void spotfire_11() throws Exception {
		TSC_Spotfire_Methods obj = new TSC_Spotfire_Methods(driver);	
		logger = extent.createTest("Spotfire 1.1: Validate capabilities of trial subscription to assign Analyst role");
		log.info("Execution of Spotfire 1.1 started...");
		String propFile = System.getProperty("user.dir")+"/src/org/tibco/automation/shared/data/files/config.properties";
		obj.reachTeamManagers(getPropValue(propFile,"spotfire_username"), getPropValue(propFile,"spotfire_password"));
		obj.assignRoles();
		obj.enterEmailID("iqauser01sh+spotfire04@gmail.com");
		Thread.sleep(1000);
		obj.enterEmailID("iqauser01sh+spotfire05@gmail.com");
		if(obj.verifyCapabilities(driver, 2, 2)==false){
			log.error("Error in Spotfire 1.1...");
			logger.log(Status.FAIL, "");
			driver.navigate().refresh();
			Assert.fail(" ");
		}
		logger.log(Status.PASS, "");
		Thread.sleep(1000);
	}
	
	@Test(priority=2)
	public void spotfire_12() throws Exception {
		TSC_Spotfire_Methods obj = new TSC_Spotfire_Methods(driver);	
		logger = extent.createTest("Spotfire 1.2: Validate capabilities of trial subscription to assign Business Author role");
		log.info("Execution of Spotfire 1.2 started...");
		obj.assignRoles();
		obj.enterEmailID("iqauser01sh+spotfire04@gmail.com");
		obj.enterEmailID("iqauser01sh+spotfire05@gmail.com");
		obj.enterEmailID("iqauser01sh+spotfire06@gmail.com");
		if(obj.TryverifyCapabilities(driver, 2, 3, 3, 4)==false){
			log.error("Error in Spotfire 1.2...");
			logger.log(Status.FAIL, "");
			driver.navigate().refresh();
			Assert.fail(" ");
		}
		logger.log(Status.PASS, "");
		Thread.sleep(1000);
	}
	
	@Test(priority=3)
	public void spotfire_13() throws Exception {
		TSC_Spotfire_Methods obj = new TSC_Spotfire_Methods(driver);	
		logger = extent.createTest("Spotfire 1.3: Validate capabilities of trial subscription to assign Consumer role");
		log.info("Execution of Spotfire 1.3 started...");
		obj.assignRoles();
		obj.enterEmailID("iqauser01sh+spotfire04@gmail.com");
		obj.enterEmailID("iqauser01sh+spotfire05@gmail.com");
		obj.enterEmailID("iqauser01sh+spotfire06@gmail.com");
		if(obj.TryverifyCapabilities(driver, 2, 4, 3, 4)==false){
			log.error("Error in Spotfire 1.3...");
			logger.log(Status.FAIL, "");
			driver.navigate().refresh();
			Assert.fail(" ");
		}
		logger.log(Status.PASS, "");
		Thread.sleep(1000);
	}


}
