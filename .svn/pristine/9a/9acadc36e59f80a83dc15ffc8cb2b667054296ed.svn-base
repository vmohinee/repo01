package org.tibco.automation.tsc.objrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.tibco.automation.shared.utilities.SharedMethods;

public class TSC_Spotfire extends SharedMethods{

	public WebElement tab_TeamMember(WebDriver driver){
		return driver.findElement(By.xpath("//a[text()='Team Members']"));
	}
	
	public WebElement btn_InviteTeamMembers(WebDriver driver){
		return driver.findElement(By.xpath("//button[contains(text(),'Invite new members')]"));
	}
	
	public WebElement spotfire(WebDriver driver){
		return driver.findElement(By.xpath("//span[text()='Spotfire®']"));
	}
	
	public WebElement input_EnterEmails(WebDriver driver){
		return driver.findElement(By.xpath("//input[@id='tsc-manage-team-invite-enter-emails']"));
	}
	
	public WebElement btn_AssignRoles(WebDriver driver){
		return driver.findElement(By.xpath("//button[@id='tsc-manage-tenant-team-send-invitation-btn']"));
	}
	
	public WebElement toggleRow1(WebDriver driver, String num){
		return driver.findElement(By.xpath("//div[@class='tsc-modal tsc-manage-team-role ng-scope']//div[@class='modal-body']/div[2]/div["+num+"]//label"));
	}
	
	public void click_togglerow1Ele(WebDriver driver, int i){
		if(i<5)
		{
	    	String xPathWithVariable = "//div[@class='tsc-modal tsc-manage-team-role ng-scope']//div[@class='modal-body']/div[2]/div["+i+"]//label";  
	    	driver.findElement(By.xpath(xPathWithVariable)).click();
		}
	}
	
	public void click_togglerow(WebDriver driver, int i1, int i2){
	    	String xPathWithVariable = "//div[@class='tsc-modal tsc-manage-team-role ng-scope']//div[@class='modal-body']/div["+i1+"]/div["+i2+"]//label";  
	    	driver.findElement(By.xpath(xPathWithVariable)).click();
	}
	
	public WebElement toggleRow2(WebDriver driver){
		return driver.findElement(By.xpath("//div[@class='tsc-modal tsc-manage-team-role ng-scope']//div[@class='modal-body']/div[3]/div[2]//label"));
	}
	
	public String toggleRow2Disabled(WebDriver driver, int i){
		String attrib = null;
			if(i<5)
			{
		    	String xPathWithVariable = "//div[@class='tsc-modal tsc-manage-team-role ng-scope']//div[@class='modal-body']/div[3]/div["+i+"]//button[@class='tc-buttons tc-button-switch switch-off']";  
		    	attrib = driver.findElement(By.xpath(xPathWithVariable)).getAttribute("disabled");
		    	System.out.println("Value: "+attrib);
		}
		return attrib;
	}
	
	public String toggleRow2DisabledCheck(WebDriver driver, int i1, int i2){
		String attrib = null;
		    	String xPathWithVariable = "//div[@class='tsc-modal tsc-manage-team-role ng-scope']//div[@class='modal-body']/div["+i1+"]/div["+i2+"]//button[@class='tc-buttons tc-button-switch switch-off']";  
		    	attrib = driver.findElement(By.xpath(xPathWithVariable)).getAttribute("disabled");
		    	System.out.println("Value: "+attrib);
		return attrib;
	}
	
	public WebElement closeBtn(WebDriver driver){
		return driver.findElement(By.xpath("//button[@id='tsc-manage-team-close-role-modal-btn']"));
	}
	 	

}
