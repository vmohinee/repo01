package org.tibco.automation.tci.testlogic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.tibco.automation.tci.objrepo.TCI_CloudEvents;
import org.tibco.automation.tsc.testlogic.TSC_TCE_Methods;
import org.tibco.automation.tsc.testlogic.TSC_TCI_Methods;


public class TCI_CloudEvents_Methods extends TCI_CloudEvents{
	
	public TCI_CloudEvents_Methods(WebDriver driver){
		this.driver=driver;
	}
	
	public String winHandleBefore2;
	
	public void createSB(String uname, String password) throws Exception {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);	
		TSC_TCE_Methods obj1 = new TSC_TCE_Methods(driver);
		obj1.reachTCE(uname, password);
		Thread.sleep(2000);
		click(driver, dropdown_createSandbox(driver));
		click(driver, label_New_CreateSandbox(driver));
		click(driver, createSandbox(driver));
		//click(driver, tbox_SandboxName(driver));
		tbox_SandboxName(driver).sendKeys("sb_org");
		tbox_SandboxDisplayName(driver).sendKeys("sb_org");
		click(driver, radioBtn_Organization(driver));		
		click(driver, btn_CreateSandox(driver));
		Thread.sleep(1000);
	}
	
	public void moveAppToSB() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		click(driver, verticalDots_App(driver));
		Thread.sleep(1000);
		click(driver, movetoSB(driver));
		Thread.sleep(1000);
		click(driver, sb_orgSB(driver));
		Thread.sleep(1000);
		click(driver, btn_MoveApplication(driver));
		Thread.sleep(1000);
	}
	
	public void createFlogoCallApp() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		TSC_TCE_Methods obj1 = new TSC_TCE_Methods(driver);
		TSC_TCI_Methods obj2 = new TSC_TCI_Methods(driver);
		driver.close();
		Thread.sleep(1000);
		driver.switchTo().window(obj1.winHandleBefore);
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(4000);
		String winHandleBefore1 = driver.getWindowHandle();
		Thread.sleep(1000);
		click(driver, btn_gnh_menu(driver));
		Thread.sleep(1000);
		click(driver, obj2.integration_apps(driver));
		Thread.sleep(3000);				
	}
	
	public boolean verifyEndpoint() throws InterruptedException{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		boolean b = false;
		click(driver, endpointsTab(driver));
		Thread.sleep(1000);
		click(driver, testEndpoint(driver));
		Thread.sleep(1000);
		click(driver, getMethod(driver));
		Thread.sleep(1000);
		click(driver, tryItOut(driver));
		Thread.sleep(1000);
		click(driver, btn_execute(driver));
		Thread.sleep(1000);
		try{			
			if(statusOK(driver).isDisplayed()&&empID(driver).isDisplayed()){
				b = true;
				Thread.sleep(1000);
			}
			}catch(Exception e){				
				log.info(e);
			}		
		return b;
	}
	
	
	
	
	
	
	
	
	

}
