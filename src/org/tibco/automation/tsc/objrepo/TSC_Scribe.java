package org.tibco.automation.tsc.objrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.tibco.automation.shared.utilities.SharedMethods;

public class TSC_Scribe extends SharedMethods{

	public WebElement btn_gnh_menu(WebDriver driver){
		return driver.findElement(By.xpath("//button[@id='gnh-menu-btn-products']"));
	}
	
	public WebElement envTools_tab(WebDriver driver){
		return driver.findElement(By.xpath("//a[text()='Environment & Tools']"));
	}
	
	public WebElement securitySettings(WebDriver driver){
		return driver.findElement(By.xpath("//div[text()='Security Settings']"));
	}
	
	public WebElement managedConnectors(WebDriver driver){
		return driver.findElement(By.xpath("//div[text()='Managed Connectors']"));
	}
	
	

}
