package org.tibco.automation.tsc.objrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.tibco.automation.shared.utilities.SharedMethods;

public class TSC_TCI extends SharedMethods{

	public WebElement btn_gnh_menu(WebDriver driver){
		return driver.findElement(By.xpath("//button[@id='gnh-menu-btn-products']"));
	}
	
	public WebElement integration_apps(WebDriver driver){
		return driver.findElement(By.xpath("//span[text()='Integration Apps']"));
	}
	
	public WebElement btn_createimport(WebDriver driver){
		return driver.findElement(By.xpath("//*[contains(text(),'Create/Import')]"));
	}
	//div[@id='ng-listing-create']
	public WebElement tciapp(WebDriver driver, String apptype){
		return driver.findElement(By.xpath("//div[@class='ng-container ng-left']//div[text()='"+apptype+" ']"));
	}
	
	public WebElement tciapptype(WebDriver driver, String apptype){
		return driver.findElement(By.xpath("//div[text()='"+apptype+" ']"));
	}
	
	public WebElement createnewapp(WebDriver driver){
		return driver.findElement(By.xpath("//button[text()='Create New App']"));
	}
	
	public WebElement importapp(WebDriver driver){
		return driver.findElement(By.xpath("//button[text()='Import app']"));
	}
	
	public WebElement browsetoUpload(WebDriver driver){
		return driver.findElement(By.xpath("//a[text()='browse to upload']"));
	}
	
	public WebElement btn_Upload(WebDriver driver){
		return driver.findElement(By.xpath("//button[@id='uploadFiles']"));
	}
	
	public By btn_Upload = By.xpath("//button[@id='uploadFiles']");
	
	public WebElement btn_importall(WebDriver driver){
		return driver.findElement(By.xpath("//button[@id='continueAndSaveApp']"));
	}
	
	public WebElement btn_push(WebDriver driver){
		return driver.findElement(By.xpath("//button[@id='pushAppBtn']"));
	}
	
	public WebElement appscale(WebDriver driver){
		return driver.findElement(By.xpath("//div[@class='inst-val-input']"));
	}
	
	public By appscale = By.xpath("//div[@class='inst-val-input']");
	
	public WebElement scaleup(WebDriver driver){
		return driver.findElement(By.xpath("//i[@class='fa fa-fw fa-angle-up']"));
	}
	
	public By scaleup = By.xpath("//i[@class='fa fa-fw fa-angle-up']");
	
	public WebElement btn_scale(WebDriver driver){
		return driver.findElement(By.xpath("//button[text()='Scale']"));
	}
	
	public By running = By.xpath("//div[text()='Running']");
	
	public By scaling = By.xpath("//div[text()='Scaling']");
	
	public By appstate = By.xpath("//div[@class='pub-noti-state']");
	
	public WebElement appstate(WebDriver driver){
		return driver.findElement(By.xpath("//div[@class='pub-noti-state']"));
	}
	
	public WebElement failure(WebDriver driver){
		return driver.findElement(By.xpath("//div[text()='Failure']"));
	}
	
	public By failure = By.xpath("//div[text()='Failure']");
	
	public WebElement msg_subscriptionCheckFailed(WebDriver driver){
		return driver.findElement(By.xpath("//div[contains(text(), 'Subscription check failed for integration instance')]"));
	}
	
	public WebElement detailsbackArrow(WebDriver driver){
		return driver.findElement(By.xpath("//*[@id='ng-details-back']"));
	}
	
	public WebElement btn_createImport(WebDriver driver){
		return driver.findElement(By.xpath("//button[@id='ng-listing-create']"));
	}
	
	public WebElement btn_next(WebDriver driver){
		return driver.findElement(By.xpath("//button[text()='Next']"));
	}
	
	public WebElement browsetoUploadNode(WebDriver driver){
		return driver.findElement(By.xpath("//label[text()='browse to upload']"));
	}
	
	public WebElement btn_importApp(WebDriver driver){
		return driver.findElement(By.xpath("//button[text()='Import App']"));
	}
	
	public By btn_importApp = By.xpath("//button[text()='Import App']");
	
	public WebElement row(WebDriver driver){
		return driver.findElement(By.xpath("//ng-app-listing-row[1]/div[1]"));
	}
	
	public WebElement deleteicon(WebDriver driver){
		return driver.findElement(By.xpath("//ng-app-listing-row[1]/div[1]//div[@class='row-btn ng-ic ng-ic-delete']"));
	}
	
	public WebElement btn_delete(WebDriver driver){
		return driver.findElement(By.xpath("//button[text()='Delete app']"));
	}
	
	public WebElement btn_endpoint(WebDriver driver) {
		return driver.findElement(By.xpath("//a[text()='Endpoints']"));
	}
	public WebElement btn_test(WebDriver driver) {
		return driver.findElement(By.xpath("//a[text()='Test']"));
	}
	public WebElement btn_POST_activity(WebDriver driver) {
		return driver.findElement(By.xpath("//span[text()='POST']"));
	}
	public WebElement btn_try_it_out(WebDriver driver) {
		return driver.findElement(By.xpath("//button[text()='Try it out ']"));
	}
	public WebElement btn_execute(WebDriver driver) {
		return driver.findElement(By.xpath("//button[text()='Execute']"));
	}
	public WebElement validate_responcecode(WebDriver driver) {
		return driver.findElement(By.xpath("//table[@class=\"responses-table live-responses-table\"]/tbody/tr/td[text()=\"200\"]"));
	}
	public WebElement btn_audisafe(WebDriver driver) {
		return driver.findElement(By.xpath("//span[text()='AuditSafe']"));
	}
	
	public WebElement btn_openApp(WebDriver driver) {
		return driver.findElement(By.xpath("//div[@class='ng-table-row info']/div[@class='ng-row-name-container']/a[text()='New_Flogo_App_0']"));
	}
	public WebElement open_flogoFlow(WebDriver driver) {
		return driver.findElement(By.xpath("//div[@class=\"flow__container flow__container--small\"]"));
	}
	public WebElement btn_Test(WebDriver driver) {
		return driver.findElement(By.xpath("//button[text()=' Test']"));
	}
	public WebElement Create_configuration(WebDriver driver) {
		return driver.findElement(By.xpath("//div[text()='Create a Launch Configuration']"));
	}
	public WebElement btn_Next(WebDriver driver) {
		return driver.findElement(By.xpath("//button[text()='Next ']"));
	}
	public WebElement btn_Run(WebDriver driver) {
		return driver.findElement(By.xpath("//button[text()='Run ']"));
	}
	public WebElement msg_flogo_tester(WebDriver drive) {
		return drive.findElement(By.xpath("//div[contains(text(),'Done')]"));
	}
	public WebElement btn_StopTesting(WebDriver driver) {
		return driver.findElement(By.xpath("//button[text()=' Stop testing']"));
	}

}
