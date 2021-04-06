package org.tibco.automation.tci.testlogic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.tibco.automation.shared.utilities.InitBrowser;
import org.tibco.automation.tci.objrepo.TCI_Auditsafe;
import org.tibco.automation.tci.objrepo.TCI_Mashery;
import org.tibco.automation.tsc.objrepo.TSC_TCI;

public class TCI_Mashery_Methods extends TSC_TCI{
	TCI_Mashery obj=new TCI_Mashery();
	public TCI_Mashery_Methods(WebDriver driver){
		this.driver=driver;
	}
	String apptype;
	public boolean validateEndpoint() throws Exception {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		boolean b = false;
		try {
			Thread.sleep(3000);
			click(driver, btn_endpoint(driver));
			Thread.sleep(1000);
			click(driver, btn_test(driver));
			Thread.sleep(1000);
			click(driver,btn_POST_activity(driver));
			Thread.sleep(1000);
			click(driver,btn_try_it_out(driver));
			Thread.sleep(3000);
			click(driver, btn_execute(driver));
			String validmsg = null;
			Thread.sleep(5000);
			if (validate_responcecode(driver).isDisplayed())
				validmsg = validate_responcecode(driver).getText();
			System.out.println("EXPECTED: " + validmsg);
			b = true;
		} catch (Exception e) {
				String screenShot = captureScreen(driver,"src3");
				InitBrowser.logger.fail("Screen Shot : " + InitBrowser.logger.addScreenCaptureFromPath(screenShot));
		//	click(driver, detailsbackArrow(driver));
			Thread.sleep(2000);
			log.error(e);
		}
	//	click(driver, detailsbackArrow(driver));
		Thread.sleep(2000);
		return b;	
	}
	public void publishTomashery( WebDriver driver, String apptype) throws Exception {
		//apptype=this.apptype;
		click(driver, obj.Endpoints_url(driver));
		Thread.sleep(1000);
		click(driver, obj.btn_Publish_to_mashery(driver));Thread.sleep(1000);
		click(driver, obj.btn_select_domain(driver));Thread.sleep(1000);
		click(driver, obj.btn_Select_Thanos(driver));Thread.sleep(1500);
		click(driver, obj.btn_Next(driver));Thread.sleep(1000);
		click(driver, obj.btn_NewDefination(driver));Thread.sleep(1000);
		sendKeys(driver, obj.input_ApiName(driver), (apptype+"_api"));Thread.sleep(1000);
		click(driver, obj.btn_create(driver));Thread.sleep(1000);
		click(driver, obj.btnSelectApi(driver, apptype));Thread.sleep(1000);
		click(driver, obj.btn_Next(driver));Thread.sleep(1000);
		click(driver, obj.btn_newPackage(driver));Thread.sleep(1000);
		sendKeys(driver, obj.input_packageName(driver), (apptype+"_pkg"));Thread.sleep(1000);
		click(driver,obj.btn_create_package(driver));Thread.sleep(1000);
		click(driver,obj.Select_package(driver, apptype));Thread.sleep(1000);
		click(driver, obj.btn_newplan(driver));Thread.sleep(1000);
		sendKeys(driver, obj.input_planName(driver), apptype+"_plan");Thread.sleep(1000);
		click(driver, obj.btn_crete_plan(driver));Thread.sleep(1000);
		click(driver, obj.select_plan(driver, apptype));Thread.sleep(1000);
		click(driver, obj.btn_publish(driver));Thread.sleep(1000);
		click(driver,obj.btn_Done(driver));Thread.sleep(1000);
		
	}
	public void setPackageToEveryone(WebDriver driver,String apptype) throws InterruptedException {
		//apptype=this.apptype;
		click(driver, obj.btn_design(driver));Thread.sleep(1000);
		click(driver,obj.btn_package(driver));Thread.sleep(1000);
		click(driver, obj.Select_package(driver, apptype));Thread.sleep(1000);
		click(driver, obj.select_plan(driver, apptype));Thread.sleep(1000);
		click(driver, obj.btn_access_control(driver));Thread.sleep(1000);
		click(driver, obj.btn_everyone(driver));Thread.sleep(1000);
		click(driver, obj.btn_save(driver));Thread.sleep(1000);
	}
	public String CreateApplication(WebDriver driver,String apptype) throws Exception
	{
		String key_value=null;
		//apptype=this.apptype;
		click(driver, obj.btn_manage(driver));Thread.sleep(1000);
		click(driver, obj.btn_application(driver));Thread.sleep(1000);
		click(driver,obj.btn_New_application(driver));Thread.sleep(1000);
		sendKeys(driver, obj.input_applicatioName(driver), (apptype+"_app"));
		Thread.sleep(1000);
		sendKeys(driver, obj.input_applicationOwner(driver), "eval395769_serviceaccount");
		obj.input_applicationOwner(driver).sendKeys(Keys.ENTER);Thread.sleep(1000);
		click(driver, obj.select_dropdown(driver));Thread.sleep(1000);
		click(driver, obj.btn_save_continue(driver));Thread.sleep(1000);
		click(driver, obj.btn_first_selectpkg(driver));Thread.sleep(1000);
		click(driver, obj.Select_package(driver, apptype));Thread.sleep(1000);
		click(driver, obj.btn_select_dropdown_pkg(driver));Thread.sleep(1000);
		click(driver, obj.select_plan(driver, apptype));Thread.sleep(1000);
		click(driver, obj.btn_add_item(driver));Thread.sleep(1000);
		click(driver, obj.btn_save_continue(driver));Thread.sleep(1000);
		click(driver, obj.btn_status(driver));Thread.sleep(1000);
		click(driver, obj.select_key(driver));Thread.sleep(1000);
		key_value=obj.getKey(driver).getText().toString();Thread.sleep(1000);
		return key_value;
	}
	
	public String getAPIurl(WebDriver  driver,String apptype) throws InterruptedException {
		String key_value=null;
		String Api_URL=null;
		click(driver, obj.btn_design(driver));Thread.sleep(1000);
		click(driver, obj.btn_apis(driver));Thread.sleep(1000);
		click(driver, obj.btnSelectApi(driver, apptype));Thread.sleep(1000);
		Api_URL=obj.get_url(driver).getText().toString();Thread.sleep(1000);
		return Api_URL;
	}
	
	public void reachMashery() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		click(driver, btn_gnh_menu(driver));
		Thread.sleep(1000);
		click(driver, obj.btn_controlcenter(driver));
		Thread.sleep(2000);
		GoTOChild_window();
		
		Thread.sleep(1000);
		//click(driver, btn_createimport(driver));
	}
	
	public void deletePackage(WebDriver driver) throws InterruptedException
	{
		click(driver, obj.btn_design(driver));Thread.sleep(1000);
		click(driver,obj.btn_package(driver));Thread.sleep(1000);
		click(driver, obj.Deletepkg(driver));Thread.sleep(1000);
	}
	public void deleteApplication(WebDriver driver) throws InterruptedException {
		click(driver, obj.btn_manage(driver));Thread.sleep(1000);
		click(driver, obj.btn_application(driver));Thread.sleep(1000);
		click(driver, obj.Deletepkg(driver));Thread.sleep(1000);
	}
	public void deleteApi(WebDriver driver) throws InterruptedException {
		click(driver, obj.btn_design(driver));Thread.sleep(1000);
		click(driver,obj.btn_apis(driver));Thread.sleep(1000);
		click(driver, obj.Deletepkg(driver));Thread.sleep(1000);
		
	}
}
