package org.tibco.automation.tsc.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tibco.automation.shared.utilities.InitBrowser;

import org.tibco.automation.tsc.testlogic.TSC_Scribe_Methods;
import org.tibco.automation.tsc.testlogic.TSC_TCE_Methods;

import com.aventstack.extentreports.Status;

public class TSC_Scribe_Tests extends InitBrowser{

private static WebDriver driver;
	

		
	@BeforeClass
	void setup(){
		driver = getDriver();
	}
				
	@Test(priority=1)
	public void scribe_11() throws Exception {
		TSC_Scribe_Methods obj = new TSC_Scribe_Methods(driver);	
		logger = extent.createTest("TCE 1.1: Validate Scribe access to Administrator user in TCI subscription");
		log.info("Execution of Scribe 1.1 started...");
		String propFile = System.getProperty("user.dir")+"/src/org/tibco/automation/shared/data/files/config.properties";
		obj.reachEnvTools(getPropValue(propFile,"username"), getPropValue(propFile,"password"));	
		if(obj.verifyScribeOptions()==false){
			log.error("Error in Scribe 1.1...");
			logger.log(Status.FAIL, "");
			driver.navigate().refresh();
			Assert.fail(" ");
		}
		logger.log(Status.PASS, "");
		Thread.sleep(1000);
	}
	
	

}
