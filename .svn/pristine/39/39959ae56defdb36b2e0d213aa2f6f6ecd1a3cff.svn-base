package org.tibco.automation.tsc.objrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TSC_Mashery {

	
	public WebElement stoppedApp(WebDriver driver){
		return driver.findElement(By.xpath("//div[text()='Stopped']"));
	}
	
	public WebElement errormsg(WebDriver driver) {
		return driver.findElement(By.xpath("//div[@class='app-mindet ps-container ps-theme-default']/div[text()='Subscription check failed for integration instance: The '1' Requested integration instances is more than the '0' integration instances allowed per your current subscription.']"));
    }
}
