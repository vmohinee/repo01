package org.tibco.automation.tsc.objrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.tibco.automation.shared.utilities.SharedMethods;

public class TSC_TCI_LAs extends SharedMethods{

	public WebElement btn_gnh_menu(WebDriver driver){
		return driver.findElement(By.xpath("//button[@id='gnh-menu-btn-products']"));
	}
	
	public WebElement designer(WebDriver driver){
		return driver.findElement(By.xpath("//span[contains(text(),'Designer')]"));
	}
	
	public WebElement welcomeDilaog(WebDriver driver){
		return driver.findElement(By.xpath("//md-icon[@ng-click='cancel()']"));
	}
	
	public WebElement blankApplication(WebDriver driver){
		return driver.findElement(By.xpath("//a[text()='Blank Application']"));
	}
	
	public WebElement editCreator(WebDriver driver){
		return driver.findElement(By.xpath("//div[@class='layout-xs-column layout-sm-column layout-row']/div[2]//div[@class='main-card-container']/div[2]//a"));
	}
	
	public WebElement btn_skipCreator(WebDriver driver){
		return driver.findElement(By.xpath("//span[contains(text(),'Skip')]"));
	}
	
	public WebElement rect_EnterBlankAppData(WebDriver driver){
		return driver.findElement(By.xpath("//div[@class='djs-container']//*[local-name() = 'svg'][1]//*[local-name()='g'][1]//*[local-name()='g'][1]//*[local-name()='g'][3]//*[local-name()='g'][1]//*[local-name()='g'][1]//*[local-name()='rect'][2]"));
	}
	
	public WebElement appendTask_Rect(WebDriver driver){
		return driver.findElement(By.xpath("//div[@class='entry dt-bpm-icon-ic_task dt-hand-pointer']"));
	}
	
	public WebElement showProperties(WebDriver driver){
		return driver.findElement(By.xpath("//div[@class='entry dt-bpm-icon-ic_settings dt-hand-pointer']"));
	}
	
	public WebElement showAdvancedOptions(WebDriver driver){
		return driver.findElement(By.xpath("//a[contains(text(),'Show advanced options')]"));
	}
	
	public WebElement exchangeDataWithCompanyService(WebDriver driver){
		return driver.findElement(By.xpath("//md-radio-button[@value='bp:TciServiceTask']"));
	}
	
	public WebElement btn_SelectaDataService(WebDriver driver){
		return driver.findElement(By.xpath("//button[@id='user-task-settings-tab-no-read-tci-next']"));
	}
	
	public WebElement btn_SelectService(WebDriver driver){
		return driver.findElement(By.xpath("//button[@id='web-service-selection-tab-select-service']"));
	}
		
	public WebElement btn_cancel(WebDriver driver){
		return driver.findElement(By.xpath("//button[text()='Cancel']"));
	}
	

}
