package org.tibco.automation.tsc.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tibco.automation.shared.utilities.InitBrowser;

import org.tibco.automation.tsc.testlogic.TSC_Mashery_Methods;
import org.tibco.automation.tsc.testlogic.TSC_TCI_Methods;

import com.aventstack.extentreports.Status;

public class TSC_Mashery_Tests extends InitBrowser{

private static WebDriver driver;
	
	
		
	@BeforeClass
	void setup(){
		driver = getDriver();
	}
		
	@Test(priority=1)
	public void Mashery_11() throws Exception {
		TSC_TCI_Methods obj = new TSC_TCI_Methods(driver);	
		TSC_Mashery_Methods objm=new TSC_Mashery_Methods(driver);
		logger = extent.createTest("Mashery 1.1: Check capabilities of trial subscription to create and push Web Integrator Apps");
		log.info("Execution of Mashery 1.1 started...");
		String propFile = System.getProperty("user.dir")+"/src/org/tibco/automation/shared/data/files/config.properties";
		String bw_ear = System.getProperty("user.dir") + "\\src\\org\\tibco\\automation\\shared\\data\\files\\BW\\BW_Post_1.0.0.ear";
		String bwManifest = System.getProperty("user.dir") + "\\src\\org\\tibco\\automation\\shared\\data\\files\\BW\\manifest.json";		
		objm.reachTCI(getPropValue(propFile,"mashery_username"), getPropValue(propFile,"mashery_password"), getPropValue(propFile, "baseURL"));
		String flogoApp = System.getProperty("user.dir") + "\\src\\org\\tibco\\automation\\shared\\data\\files\\Flogo\\flogo.json";
		
		objm.createFlogoApp(flogoApp, "Flogo");
		Thread.sleep(3000);
		obj.scale_tciapp(1);
		
		if(obj.validateAppLimit()==false){
			log.error("Error in Mashery 1.1...");
			logger.log(Status.FAIL, "");
			driver.navigate().refresh();
			Assert.fail(" ");
		}
		logger.log(Status.PASS, "Validation PASSED: Cannot push more than 1 IPAAS apps");
		Thread.sleep(1000);
		obj.deleteTCIApp();	
		driver.close();
		switchToParentWin();
	
	}
	@Test(priority=2)
	public void Mashery_12() throws Exception {
		TSC_TCI_Methods obj = new TSC_TCI_Methods(driver);	
		TSC_Mashery_Methods objm=new TSC_Mashery_Methods(driver);
		logger = extent.createTest("Mashery 1.2: Check capabilities of trial subscription to create and push Web Integrator Apps");
		log.info("Execution of Mashery 1.2 started...");
		String propFile = System.getProperty("user.dir")+"/src/org/tibco/automation/shared/data/files/config.properties";
		String bw_ear = System.getProperty("user.dir") + "\\src\\org\\tibco\\automation\\shared\\data\\files\\BW\\BW_Post_1.0.0.ear";
		String bwManifest = System.getProperty("user.dir") + "\\src\\org\\tibco\\automation\\shared\\data\\files\\BW\\manifest.json";		
		objm.reachTCI_refresh();
		obj.createBWApp("BusinessWorks", bw_ear, bwManifest);
		Thread.sleep(3000);
		obj.scale_tciapp(6);
		
		if(obj.validateAppLimit()==false){
			log.error("Error in Mashery 1.1...");
			logger.log(Status.FAIL, "");
			driver.navigate().refresh();
			Assert.fail(" ");
		}
		logger.log(Status.PASS, "Validation PASSED: Cannot push more than 6 IPAAS apps");
		Thread.sleep(1000);
		obj.deleteTCIApp();	
		driver.close();
		switchToParentWin();
		}
	
	@Test(priority=2)
	public void Mashery_13() throws Exception {
		TSC_TCI_Methods obj = new TSC_TCI_Methods(driver);	
		TSC_Mashery_Methods objm=new TSC_Mashery_Methods(driver);
		logger = extent.createTest("Mashery 1.3: Check capabilities of trial subscription to create and push Web Integrator Apps");
		log.info("Execution of Mashery 1.3 started...");
		String propFile = System.getProperty("user.dir")+"/src/org/tibco/automation/shared/data/files/config.properties";
		String nodejsManifest = System.getProperty("user.dir") + "\\src\\org\\tibco\\automation\\shared\\data\\files\\NodeArtf\\manifest.json";
		String nodejsZip = System.getProperty("user.dir") + "\\src\\org\\tibco\\automation\\shared\\data\\files\\NodeArtf\\nodeApp.zip";		
		objm.reachTCI_refresh();
		obj.createNodeJSApp("Node.js", nodejsManifest, nodejsZip);
		
		Thread.sleep(3000);
		obj.scale_tciapp(6);
		
		if(obj.validateAppLimit()==false){
			log.error("Error in Mashery 1.1...");
			logger.log(Status.FAIL, "");
			driver.navigate().refresh();
			Assert.fail(" ");
		}
		logger.log(Status.PASS, "Validation PASSED: Cannot push more than 6 IPAAS apps");
		Thread.sleep(1000);
		obj.deleteTCIApp();	
		driver.close();
		switchToParentWin();
		}
}
