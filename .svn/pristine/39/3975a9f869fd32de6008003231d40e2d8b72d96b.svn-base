package org.tibco.automation.tci.objrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.tibco.automation.shared.utilities.SharedMethods;

public class TCI_LiveApps extends SharedMethods{
	
	public WebElement btn_gnh_menu(WebDriver driver){
		return driver.findElement(By.xpath("//button[@id='gnh-menu-btn-products']"));
	}
		
	public WebElement tci_app_link(WebDriver driver){
		return driver.findElement(By.xpath("//div[@class='ng-row-name-container']/a"));
	}
		
	public WebElement public_appstate(WebDriver driver){
		return driver.findElement(By.xpath("//span[text()='Public']"));
	}
	
	public WebElement btn_update(WebDriver driver){
		return driver.findElement(By.xpath("//span[text()='Update']"));
	}
	
	public WebElement closeMessage(WebDriver driver){
		return driver.findElement(By.xpath("//div[@class='ui-growl-icon-close fa fa-close']"));
	}
	
	public WebElement draft_appstate(WebDriver driver){
		return driver.findElement(By.xpath("//span[text()='Draft']"));
	}
	
	public WebElement btn_setaslive(WebDriver driver){
		return driver.findElement(By.xpath("//span[text()='Set as live']"));
	}
	
	public WebElement designer(WebDriver driver){
		return driver.findElement(By.xpath("//span[contains(text(),'Designer')]"));
	}
	
	public By designer = By.xpath("//span[contains(text(),'Designer')]");
	
	public WebElement welcomeDilaog(WebDriver driver){
		return driver.findElement(By.xpath("//md-icon[@ng-click='cancel()']"));
	}
	
	public By welcomeDilaog = By.xpath("//md-icon[@ng-click='cancel()']");
	
	public WebElement blankApplication(WebDriver driver){
		return driver.findElement(By.xpath("//a[text()='Blank Application']"));
	}
	
	public WebElement btn_NewApp_Designer(WebDriver driver){
		return driver.findElement(By.xpath("//span[contains(text(),'New application')]"));
	}
	
	public By btn_NewApp_Designer = By.xpath("//span[contains(text(),'New application')]");
	
	public WebElement lbl_BlankApplication(WebDriver driver){
		return driver.findElement(By.xpath("//div[text()='BA']"));
	}
	
	public WebElement tbox_AppName(WebDriver driver){
		return driver.findElement(By.id("create-application-dialog-name"));
	}
	
	public WebElement btn_Add(WebDriver driver){
		return driver.findElement(By.id("create-application-dialog-ok"));
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
	
	public WebElement rect_taskName(WebDriver driver){
        return driver.findElement(By.xpath("//*[local-name()='g' and @class='djs-children']//*[local-name()='text' and @class='djs-label process-label']"));
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
	
	public WebElement lbl_Inputs(WebDriver driver){
        return driver.findElement(By.xpath("//md-tab-item//div[@id='serviceInputTab-label']"));
    }

    public WebElement input_Inputs(WebDriver driver, int inputNumber){
        return driver.findElement(By.xpath("//md-content[@id='serviceInputTab-content']//md-list-item["+inputNumber+"]//input[@type='search']"));
    }
    
    public WebElement drpdown_Field1(WebDriver driver, String appName){
        return driver.findElement(By.xpath("//span[@title='"+appName+"/Field 1']"));
    }

    public WebElement drpdown_Field2(WebDriver driver, String appName){
        return driver.findElement(By.xpath("//span[@title='"+appName+"/Field 2']"));
    }

    public WebElement drpdown_Field3(WebDriver driver, String appName){
        return driver.findElement(By.xpath("//span[@title='"+appName+"/Field 3']"));
    }

    public WebElement lbl_Outputs(WebDriver driver){
        return driver.findElement(By.xpath("//md-tab-item//div[@id='serviceOutputTab-label']"));
    }

    public WebElement input_Status(WebDriver driver){
        return driver.findElement(By.xpath("//md-content[@id='serviceOutputTab-content']//md-list-item[1]//input[@type='search']"));
    }
	
	public WebElement input_Name(WebDriver driver){
        return driver.findElement(By.xpath("//md-content[@id='serviceOutputTab-content']//md-list-item[2]//input[@type='search']"));
    }

    public WebElement lbl_ExitState(WebDriver driver){
        return driver.findElement(By.xpath("//md-tab-item//div[@id='userTaskExitStateTab-label']"));
    }

    public WebElement radioBtn_ASpecificStateOfMyChoice(WebDriver driver){
        return driver.findElement(By.xpath("//md-radio-button[@value='SpecificOne']"));
    }

    public WebElement radioBtn_Completed(WebDriver driver){
        return driver.findElement(By.xpath("//md-radio-button[@value='Completed']"));
    }

    public WebElement radioBtn_Created(WebDriver driver){
        return driver.findElement(By.xpath("//md-radio-button[@value='Created']"));
    }

    public WebElement btn_CloseEditor(WebDriver driver){
        return driver.findElement(By.xpath("//button[@id='closeEditorButton']"));
    }

    public WebElement btn_TestApplication(WebDriver driver){
        return driver.findElement(By.xpath("//button[@id='testApplicationButton']"));
    }

    public WebElement btn_NewApp(WebDriver driver){
        return driver.findElement(By.xpath("//div[@class='new-case layout-row']/button"));
    }

    public WebElement input1_NewApp(WebDriver driver){
        return driver.findElement(By.xpath("//md-conent//md-conent//tf-control-textinput[1]//input"));
    }

    public WebElement btn_submit(WebDriver driver){
        return driver.findElement(By.xpath("//button[@type='submit']"));
    }

    public WebElement btn_closeDialog(WebDriver driver){
        return driver.findElement(By.xpath("//button[@class='tib-btn tib-btn-flat  close md-button md-autofocus md-ink-ripple md-tibcloudtheme-theme']"));
    }

    public WebElement details(WebDriver driver){
        return driver.findElement(By.xpath("//div[contains(text(),'DETAILS')]"));
    }
    
    public WebElement statusOK_Field1(WebDriver driver){
        return driver.findElement(By.xpath("//div[@class='case-data-container ng-scope layout-column flex']/div[2]/div[contains(text(),'OK')]"));
    }

    public WebElement btn_Apps(WebDriver driver, String appType){
        return driver.findElement(By.xpath("//button[contains(text(),'"+appType+"')]"));
    }

    public WebElement deleteApp_VerticalDots(WebDriver driver){
        return driver.findElement(By.xpath("//a[@class='tropos-apps-delete-app']"));
    }

    public WebElement tbox_DeleteAppDialog(WebDriver driver){
        return driver.findElement(By.xpath("//input[@type='text']"));
    }

    public WebElement btn_Delete_DeleteAppDialog(WebDriver driver){
        return driver.findElement(By.xpath("//div[@class='pull-right']/button[2]"));
    }

    public WebElement btn_VerticalDots_La(WebDriver driver){
        return driver.findElement(By.xpath("//button[contains(@aria-label, \"Menu Options\")]"));
    }

    public WebElement moveToTrash(WebDriver driver){
        return driver.findElement(By.xpath("//span[contains(text(),'Move to Trash')]"));
    }

    public WebElement btn_MoveToTrash(WebDriver driver){
        return driver.findElement(By.xpath("//button[@id='delete-dialog-ok']"));
    }

    public WebElement menu_LeftPane(WebDriver driver){
        return driver.findElement(By.xpath("//md-icon[contains(@aria-label, \"Menu\")]"));
    }

    public WebElement applicationAdmin_MenuLeftPane(WebDriver driver){
        return driver.findElement(By.xpath("//tcc-side-nav-item//div[1]//span[contains(text(),'Application Administration')]"));
    }

    public WebElement delete_VerticalDots_Admin(WebDriver driver){
        return driver.findElement(By.xpath("//md-menu-item//span[contains(text(),'Delete')]"));
    }

    public WebElement tbox_DeleteApp_Admin(WebDriver driver){
        return driver.findElement(By.xpath("//input[@id='verification-text-id']"));
    }

    public WebElement btn_Delete_DeleteAppDialogLA(WebDriver driver){
        return driver.findElement(By.xpath("//md-dialog-actions/button[2]"));
    }

}
