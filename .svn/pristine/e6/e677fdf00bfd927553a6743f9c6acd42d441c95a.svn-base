package org.tibco.automation.tsc.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tibco.automation.shared.utilities.InitBrowser;
import org.tibco.automation.tsc.testlogic.TSC_TCI_Methods;

import com.aventstack.extentreports.Status;

public class TSC_TCI_Tests extends InitBrowser {

private static WebDriver driver;
	
		
	@BeforeClass
	void setup(){
		driver = getDriver();
	}
				
	@Test(priority=1)
	public void tci_11() throws Exception {
		TSC_TCI_Methods obj = new TSC_TCI_Methods(driver);	
		logger = extent.createTest("TCI 1.1: Validate IPAAS apps limit in TCI trial subscription");
		log.info("Execution of TCI 1.1 started...");
		String propFile = System.getProperty("user.dir")+"/src/org/tibco/automation/shared/data/files/config.properties";
		obj.reachTCI(getPropValue(propFile,"username"), getPropValue(propFile,"password"));	
		String flogoApp = System.getProperty("user.dir") + "\\src\\org\\tibco\\automation\\shared\\data\\files\\Flogo\\flogo.json";
		obj.createFlogoApp(flogoApp, "Flogo");
		Thread.sleep(3000);
		obj.scale_tciapp(5);
		Thread.sleep(10000);
		driver.navigate().refresh();
		waitForElement(driver, obj.running);
		click(driver, obj.detailsbackArrow(driver));
		click(driver, obj.btn_createImport(driver));
		String nodejsManifest = System.getProperty("user.dir") + "\\src\\org\\tibco\\automation\\shared\\data\\files\\NodeArtf\\manifest.json";
		String nodejsZip = System.getProperty("user.dir") + "\\src\\org\\tibco\\automation\\shared\\data\\files\\NodeArtf\\nodeApp.zip";		
		obj.createNodeJSApp("Node.js", nodejsManifest, nodejsZip);
		obj.scale_tciapp(6);
		if(obj.validateAppLimit()==false){
			log.error("Error in TCI 1.1...");
			logger.log(Status.FAIL, "");
			driver.navigate().refresh();
			Assert.fail(" ");
		}
		logger.log(Status.PASS, "Validation PASSED: Cannot push more than 10 IPAAS apps");
		Thread.sleep(1000);
		obj.deleteTCIApp();	
		Thread.sleep(1000);
		obj.deleteTCIApp();
	}
	
	@Test(priority=2)
	public void tci_12() throws Exception {
		TSC_TCI_Methods obj = new TSC_TCI_Methods(driver);	
		logger = extent.createTest("TCI 1.2: Validate BW apps limit in TCI trial subscription");
		log.info("Execution of TCI 1.2 started...");
		String propFile = System.getProperty("user.dir")+"/src/org/tibco/automation/shared/data/files/config.properties";	
		String bw_ear = System.getProperty("user.dir") + "\\src\\org\\tibco\\automation\\shared\\data\\files\\BW\\BW_Post_1.0.0.ear";
		String bwManifest = System.getProperty("user.dir") + "\\src\\org\\tibco\\automation\\shared\\data\\files\\BW\\manifest.json";		
		obj.createBWApp("BusinessWorks", bw_ear, bwManifest);
		obj.scale_tciapp(3);
		if(obj.validateAppLimit()==false){
			log.error("Error in TCI 1.2...");
			logger.log(Status.FAIL, "");
			driver.navigate().refresh();
			Assert.fail(" ");
		}
		logger.log(Status.PASS, "Validation PASSED: Cannot push more than 2 BW apps");
		Thread.sleep(1000);
		obj.deleteTCIApp();	
	}


	
}
