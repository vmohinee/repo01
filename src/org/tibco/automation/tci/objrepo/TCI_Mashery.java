package org.tibco.automation.tci.objrepo;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TCI_Mashery {

	public WebElement btn_controlcenter(WebDriver driver) {
		return driver.findElement(By.xpath("//span[text()='Mashery Control Center']"));
	}
	public WebElement Endpoints_url(WebDriver driver){
		return driver.findElement(By.xpath("//div[@class='top-bar endpoint-breadcrumb']/a[text()='Endpoints']"));
	}
	public WebElement btn_Publish_to_mashery(WebDriver driver) {
		return driver.findElement(By.xpath("//a[text()='Publish to Mashery']"));
	}
	public WebElement btn_select_domain(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@class='ui-dropdown ui-widget ui-state-default ui-corner-all ui-helper-clearfix']"));
	}
	public WebElement btn_Select_Thanos(WebDriver driver) {
		return driver.findElement(By.xpath("//span[text()='eval395769.api.thanos.mashspud.com']"));
	}
	public WebElement btn_Next(WebDriver driver) {
		return driver.findElement(By.xpath("//span[text()='Next']"));
	}
	public WebElement btn_NewDefination(WebDriver driver) {
		return driver.findElement(By.xpath("//span[text()='+ New definition']"));
	}
	public WebElement input_ApiName(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@id='new_api_def_name']"));
	}
	public WebElement btn_create(WebDriver driver) {
		return driver.findElement(By.xpath("//button[text()='Create']"));
	}
	public WebElement btnSelectApi(WebDriver driver, String apptype) {
		return driver.findElement(By.xpath("//*[text()='"+apptype+"_api']"));
	}
	public WebElement btn_newPackage (WebDriver driver) {
		return driver.findElement(By.xpath("//button[text()='+ New Package']"));
	}
	public WebElement input_packageName(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@id='new_package_name']"));
	}
	public WebElement btn_create_package(WebDriver driver) {
		return driver.findElement(By.xpath("//form[@name='newPackageForm']/div/button[@class='tci-btn btn-primary']"));
	}
	public WebElement Select_package(WebDriver driver, String apptype) {
		return driver.findElement(By.xpath("//*[text()='"+apptype+"_pkg']"));
	}
	public WebElement btn_newplan(WebDriver driver) {
		return driver.findElement(By.xpath("//button[text()='Create a plan']"));
	}
	public WebElement input_planName(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@id='new_plan_name']"));
	}
	public WebElement btn_crete_plan(WebDriver driver) {
		return driver.findElement(By.xpath("//form/div[4]/button[text()='Create']"));
	}
	public WebElement select_plan(WebDriver driver,String apptype) {
		return driver.findElement(By.xpath("//*[text()='"+apptype+"_plan']"));
	}
	public WebElement btn_publish(WebDriver driver) {
		return driver.findElement(By.xpath("//span[text()='Publish']"));
	}
	public WebElement btn_Done(WebDriver driver) {
		return driver.findElement(By.xpath("//span[text()='Done']"));
	}
	public WebElement btn_design(WebDriver driver) {
	return driver.findElement(By.xpath("//a[contains(text(),'Design')]"));
	}
	public WebElement btn_package(WebDriver driver) {
		return driver.findElement(By.xpath(" //a[text()='Packages']"));
	}
	public WebElement btn_access_control(WebDriver driver) {
		return driver.findElement(By.xpath("//*[contains(text(),'Access Control')]"));
	}
	public WebElement btn_everyone (WebDriver driver) {
		return driver.findElement(By.xpath("//div[text()='Unselected']/ul/li/span[text()='Everyone']"));
	}
	public WebElement btn_save(WebDriver driver) {
		return driver.findElement(By.xpath("//button[text()='Save']"));
	}

 	public WebElement btn_manage (WebDriver driver) {
		return driver.findElement(By.xpath("//ul[@class='nav navbar-nav cloud-navbar']/li/a[contains(text(),'Manage')]"));}
 	
 	public WebElement btn_application  (WebDriver driver) {
 		return driver.findElement(By.xpath("//li/a[contains(text(),'Applications')]")); }
 	public WebElement btn_New_application (WebDriver driver) {
 		return driver.findElement(By.xpath("//button[contains(text(),'New Application')]"));}
 	public WebElement input_applicatioName(WebDriver driver) {
 		return driver.findElement(By.xpath("//input[@name='name']"));}
 	public WebElement input_applicationOwner(WebDriver driver) {
 		return driver.findElement(By.xpath("//input[@name='username']"));}    //eval395769_serviceaccount
 	public WebElement btn_save_continue(WebDriver driver) {
 		return driver.findElement(By.xpath("//button[text()='Save and continue']"));}
 	public WebElement btn_first_selectpkg(WebDriver driver) {
 		return driver.findElement(By.xpath("//span[text()='First select a package']"));}
 	public WebElement btn_select_dropdown_pkg(WebDriver driver) {
 		return driver.findElement(By.xpath("//span[@class='first-dropdown']"));}
 	public WebElement btn_add_item (WebDriver driver) {
 		return driver.findElement(By.xpath("//button[@title='Add Item']"));}
 	public WebElement btn_status(WebDriver driver) {
 		return driver.findElement(By.xpath("//label[text()='Waiting']"));}
 	public WebElement select_key(WebDriver driver) {
 		return driver.findElement(By.xpath("//td[@class='link-cell renderable']"));}
 	public WebElement getKey(WebDriver driver) {
 		return driver.findElement(By.xpath("//h1[contains(text(),'Package')]"));}
 	public WebElement btn_apis (WebDriver driver) {
		return driver.findElement(By.xpath("//a[text()='APIs']"));}
 	public WebElement btnnew_ApiDefination(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@title='New API Definition']"));}
	public WebElement get_url(WebDriver driver) {
		return driver.findElement(By.xpath("//table[@class='backgrid table-hover']/tbody/tr/td[4]"));}
	public WebElement select_dropdown(WebDriver driver) {
		return driver.findElement(By.xpath("//div[@class='tt-dataset-username']"));
	}
	
	public WebElement Deletepkg(WebDriver driver) {
		return driver.findElement(By.xpath("//table/tbody/tr[1]/td/a[@class='glyphicon glyphicon-trash']"));
	}
	
}