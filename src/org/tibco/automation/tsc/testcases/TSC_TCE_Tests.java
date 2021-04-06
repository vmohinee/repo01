package org.tibco.automation.tsc.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tibco.automation.shared.utilities.InitBrowser;

import org.tibco.automation.tsc.testlogic.TSC_TCE_Methods;
import org.tibco.automation.tsc.testlogic.TSC_TCI_Methods;

import com.aventstack.extentreports.Status;

public class TSC_TCE_Tests extends InitBrowser{

private static WebDriver driver;
	
	
		
	@BeforeClass
	void setup(){
		driver = getDriver();
	}
				
	@Test(priority=1)
	public void tce_11() throws Exception {
		TSC_TCE_Methods obj = new TSC_TCE_Methods(driver);	
		logger = extent.createTest("TCE 1.1: Validate TCE apps limit in TCE trial subscription");
		log.info("Execution of TCE 1.1 started...");
		String propFile = System.getProperty("user.dir")+"/src/org/tibco/automation/shared/data/files/config.properties";
		obj.reachTCE(getPropValue(propFile,"shared_username"), getPropValue(propFile,"shared_password"));	
		String BEJSON = System.getProperty("user.dir") + "\\src\\org\\tibco\\automation\\shared\\data\\files\\TCE\\BEJSONServer.ear";
		obj.createTCEApp(BEJSON);
		Thread.sleep(3000);
		obj.scale_tceapp(5);
		if(obj.validateTCEAppLimit()==false){
			log.error("Error in TCE 1.1...");
			logger.log(Status.FAIL, "");
			driver.navigate().refresh();
			Assert.fail(" ");
		}
		logger.log(Status.PASS, "Validation PASSED: Cannot push more than 5 TCE apps");
		Thread.sleep(1000);
	}

}
