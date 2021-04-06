package org.tibco.automation.tsc.testlogic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.tibco.automation.tsc.objrepo.TSC_Spotfire;

public class TSC_Spotfire_Methods extends TSC_Spotfire{
	
	public TSC_Spotfire_Methods(WebDriver driver){
		this.driver=driver;
	}
		
	public void reachTeamManagers(String uname, String password) throws Exception {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.navigate().to("http://account.tenant-integration.tcie.pro/");
		perform_login(uname, password);
		Thread.sleep(3000);
		click(driver, tab_TeamMember(driver));
		//Thread.sleep(1000);		
	}
	
	public void assignRoles() throws Exception{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		click(driver, btn_InviteTeamMembers(driver));
		//Thread.sleep(1000);
		click(driver, spotfire(driver));		
		}
	
	public void enterEmailID(String email) throws Exception {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		sendKeys(driver, input_EnterEmails(driver), email);
		input_EnterEmails(driver).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}
	
	public boolean verifyCapabilities(WebDriver driver, int num1, int num2) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		boolean b = false;
		Thread.sleep(1000);
		click(driver, btn_AssignRoles(driver));
		Thread.sleep(1000);
		click_togglerow1Ele(driver, num1);
		Thread.sleep(1000);
        if(toggleRow2Disabled(driver, num2).equals("true")){
        	b = true;
        }
        click(driver, closeBtn(driver));
		return b;	
	}
	
	public boolean TryverifyCapabilities(WebDriver driver, int row2, int column, int row3, int row4) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		boolean b = false;
		Thread.sleep(1000);
		click(driver, btn_AssignRoles(driver));
		Thread.sleep(1000);
		click_togglerow(driver, row2, column);
		Thread.sleep(1000);
		click_togglerow(driver, row3, column);
		Thread.sleep(1000);
        if(toggleRow2DisabledCheck(driver, row4, column).equals("true")){
        	b = true;
        }
        click(driver, closeBtn(driver));
		return b;	
	}

}
