package org.tibco.automation.shared.utilities;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class InitBrowser extends SharedMethods {
	
	private static WebDriver driver;
	
	public WebDriver getDriver(){
		return driver;
	}
	public static String parentwindow;
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest logger;
	
	@BeforeSuite
	public void startReport(){		
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/STMExtentReport.html");
		extent = new ExtentReports ();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("OS", "Windows 10");
		extent.setSystemInfo("Host Name", "shhinduj-p51");
		extent.setSystemInfo("Environment", "IQA Environment");
		extent.setSystemInfo("User Name", "Shweta Hinduja");
		htmlReporter.config().setDocumentTitle("Extent Report for Cloud Integration Testing Automation");
		htmlReporter.config().setReportName("Cloud Integration Testing Automation Report");
		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlReporter.config().setTheme(Theme.DARK);		
	}
		
	@Parameters({"browserType","appURL"})
	@BeforeTest
	public void setBrowser(String browserType, String appURL){
		if(browserType.equals("ie")){
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"/src/org/tibco/automation/shared/data/drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(appURL);
		} else if(browserType.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/org/tibco/automation/shared/data/drivers/chromedriver.exe");			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("incognito");
			options.setCapability(ChromeOptions.CAPABILITY, options);
			driver = new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(appURL);
			parentwindow= driver.getWindowHandle();
		} else {
			System.out.println("The browser is not supported.....");
		}
	}
	
	@AfterMethod
	public void setTestResult(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
			logger.log(Status.FAIL, result.getName());			
			logger.log(Status.FAIL,result.getThrowable());			
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			logger.log(Status.PASS, result.getName());			
		} else if (result.getStatus() == ITestResult.SKIP) {
			logger.skip("Test Case : " + result.getName() + " has been skipped");
		}
	}
	
	@AfterClass
	public void exit(){
		driver.close();
		driver.quit();
	}
	
	@AfterSuite
	public void endReport(){
		extent.flush();
		
    }

}
