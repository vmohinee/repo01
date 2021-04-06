package org.tibco.automation.tsc.testlogic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.tibco.automation.tsc.objrepo.TSC_Scribe;

public class TSC_Scribe_Methods extends TSC_Scribe{
	
	public TSC_Scribe_Methods(WebDriver driver){
		this.driver=driver;
	}
		
	public void reachEnvTools(String uname, String password) throws Exception {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		TSC_TCI_Methods obj = new TSC_TCI_Methods(driver);
		obj.reachTCI(uname, password);
		Thread.sleep(2000);
		click(driver, envTools_tab(driver));
		Thread.sleep(1000);		
	}
	
	public boolean verifyScribeOptions() {
		boolean b = false;
		try{			
			if(securitySettings(driver).isDisplayed()&&managedConnectors(driver).isDisplayed()){
				b = true;
				Thread.sleep(1000);
			}
			}catch(Exception e){				
				log.info(e);
			}		
		return b;
	}

}
