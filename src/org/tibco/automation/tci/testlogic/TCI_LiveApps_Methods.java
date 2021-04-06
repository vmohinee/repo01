package org.tibco.automation.tci.testlogic;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.tibco.automation.tci.objrepo.TCI_LiveApps;
import org.tibco.automation.tsc.testlogic.TSC_TCI_Methods;

public class TCI_LiveApps_Methods extends TCI_LiveApps{
	
	public TCI_LiveApps_Methods(WebDriver driver){
		this.driver=driver;
	}
	
	public void LAsCallTCIFlogo(String uname, String password) throws Exception {
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);	
		TSC_TCI_Methods obj1 = new TSC_TCI_Methods(driver);
		obj1.reachTCI(uname, password);
		click(driver, obj1.btn_createimport(driver));
		String flogoApp = System.getProperty("user.dir") + "\\src\\org\\tibco\\automation\\shared\\data\\files\\Flogo\\flogo.json";
//		obj1.createFlogoApp(flogoApp, "Flogo");
//		Thread.sleep(3000);
//		obj1.scale_tciapp(1);
//		Thread.sleep(2000);
//		driver.navigate().refresh();
//		waitForElement(driver, obj1.running);
//		makeTCIAppPrivate();
		Thread.sleep(2000);
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
		click(driver, designer(driver));
		Thread.sleep(2000);
	
		for(String winHandle : driver.getWindowHandles()){
			if(!winHandleBefore1.equalsIgnoreCase(winHandle)) {
			driver.switchTo().window(winHandle);
			Thread.sleep(1000);
			String title = driver.getTitle();
			System.out.println(title);
			}
		}
		Thread.sleep(10000);
		explicitWait_Click(driver, welcomeDilaog);
		//click(driver, welcomeDilaog(driver));
		Thread.sleep(3000);
	}
	
	
	public void reachLAS() throws Exception {
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);				
		String winHandleBefore = driver.getWindowHandle();
		Thread.sleep(1000);
	    click(driver, btn_gnh_menu(driver));
		Thread.sleep(1000);
		
		click(driver, designer(driver));
		Thread.sleep(7000);
		//driver.switchTo().window(winHandle);
		
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}		
		Thread.sleep(3000);
		explicitWait_Click(driver, welcomeDilaog);
		//click(driver, welcomeDilaog(driver));
		Thread.sleep(2000);
	}
	
	public void createLAsApp() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);	
		Actions actions = new Actions(driver);
		explicitWait_Click(driver, btn_NewApp_Designer);
		//click(driver, btn_NewApp_Designer(driver));
		click(driver, lbl_BlankApplication(driver));
		click(driver, tbox_AppName(driver));
		click(driver, btn_Add(driver));
		Thread.sleep(1000);
		click(driver, editCreator(driver));
		Thread.sleep(2000);
		//click(driver, btn_skipCreator(driver));
		//Thread.sleep(1000);		
        JavascriptExecutor js = (JavascriptExecutor)driver;		
		actions.moveToElement(rect_EnterBlankAppData(driver), -6, -6).click().perform();				
		Thread.sleep(1000);
		click(driver, appendTask_Rect(driver));
		Thread.sleep(1000);
		actions.moveByOffset(160, 55).click().perform();
		Thread.sleep(1000);
		click(driver, showProperties(driver));
		Thread.sleep(1000);
		try {
		if(showAdvancedOptions(driver).isDisplayed()) {
			click(driver, showAdvancedOptions(driver));	
			click(driver, exchangeDataWithCompanyService(driver));
		}
		}catch(Exception e) {
			click(driver, exchangeDataWithCompanyService(driver));
			log.info(e);
		}
		//click(driver, showAdvancedOptions(driver));		
		Thread.sleep(2000);
		click(driver, btn_SelectaDataService(driver));
		Thread.sleep(2000);		
		click(driver, btn_SelectService(driver));
		Thread.sleep(8000);
		WebElement btn = (WebElement) js.executeScript("return document.querySelector('synergy-service-picker').shadowRoot.querySelector('asr-dialogue').querySelector('asr-service-list').querySelector('asr-tooltip > div > div')");						
		
		//clickShadowDOMElement("document.querySelector('synergy-service-picker').shadowRoot.querySelector('asr-dialogue').querySelector('asr-service-list').querySelector('asr-tooltip > div > div')");
			
		Actions action = new Actions(driver);
//			
		action.moveToElement(btn).click().build().perform();
		Thread.sleep(1000);	
		
		WebElement btn_Select = (WebElement) js.executeScript("return document.querySelector('synergy-service-picker').shadowRoot.querySelector('asr-dialogue').querySelector('asr-service-details').querySelector('asr-button').querySelector('button')");
		action.moveToElement(btn_Select).click().build().perform();
		Thread.sleep(2000);
		
		//clickShadowDOMElement("document.querySelector('synergy-service-picker').shadowRoot.querySelector('asr-dialogue').querySelector('asr-service-details').querySelector('asr-button').querySelector('button')");
	}
		
	public void configureFLogoLAsInputOutput() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		click(driver, lbl_Outputs(driver));
		Thread.sleep(1000);
		click(driver, input_Status(driver));
		Thread.sleep(1000);
		click(driver, drpdown_Field1(driver, "Blank Application"));
		Thread.sleep(1000);
		click(driver, input_Name(driver));
		Thread.sleep(1000);
		click(driver, drpdown_Field2(driver, "Blank Application"));
		Thread.sleep(1000);
		click(driver, lbl_ExitState(driver));
		Thread.sleep(1000);
		click(driver, radioBtn_ASpecificStateOfMyChoice(driver));
		Thread.sleep(1000);
		click(driver, radioBtn_Completed(driver));
		Thread.sleep(1000);
	}
		
	public void selectCreateState() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		click(driver, rect_taskName(driver));
		Thread.sleep(1000);
		click(driver, showProperties(driver));
		Thread.sleep(1000);
		click(driver, lbl_ExitState(driver));
		Thread.sleep(1000);
		click(driver, radioBtn_ASpecificStateOfMyChoice(driver));
		Thread.sleep(1000);
		click(driver, radioBtn_Created(driver));
		Thread.sleep(1000);
		click(driver, btn_CloseEditor(driver));
		Thread.sleep(1000);
	}
	
	public void testLAsApp(String testdata) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		click(driver, btn_TestApplication(driver));
		Thread.sleep(7000);
		click(driver, btn_NewApp(driver));
		Thread.sleep(1000);
		click(driver, input1_NewApp(driver));
		Thread.sleep(1000);
		input1_NewApp(driver).sendKeys(testdata);
		click(driver, btn_submit(driver));
		Thread.sleep(1000);
		click(driver, btn_closeDialog(driver));
		Thread.sleep(1000);
//        driver.navigate().refresh();
//        Thread.sleep(5000);
        click(driver, details(driver));
		Thread.sleep(1000);
	}
		
	public boolean verifyStatusOK() throws InterruptedException{
		boolean b = false;
		try{			
			if(statusOK_Field1(driver).isDisplayed()){
				b = true;
				Thread.sleep(1000);
			}
			}catch(Exception e){				
				log.info(e);
			}		
		return b;
	}
	
	public void makeTCIAppPrivate() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		TSC_TCI_Methods obj1 = new TSC_TCI_Methods(driver);
		click(driver, obj1.detailsbackArrow(driver));
		Thread.sleep(2000);
		click(driver, tci_app_link(driver));
		Thread.sleep(1000);
		click(driver, public_appstate(driver));
		click(driver, btn_update(driver));
		click(driver, closeMessage(driver));
		Thread.sleep(1000);
		click(driver, draft_appstate(driver));
		click(driver, btn_setaslive(driver));
		click(driver, closeMessage(driver));
		Thread.sleep(1000);		
	}

}
