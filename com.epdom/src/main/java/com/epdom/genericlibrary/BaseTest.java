package com.epdom.genericlibrary;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import com.epdom.pagerepository.Pagemanagement;
import com.epdom.propertyfilelibrary.ReadPropertiesFile;
import com.epdom.webdriver.library.Webdriverutil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	// public static WebDriver driver;
	public String username;
	public Webdriverutil webdriverobj;
	public Pagemanagement pagemanagementobj;
	public com.epdom.propertyfilelibrary.Readexcelfile excelutilityobj;
	public ExtentSparkReporter spark;
	public ExtentReports report;
	public ExtentTest test;

	@BeforeSuite
	public void suitsetup() {

		// Create the SparkReport
		spark = new ExtentSparkReporter("./AdvanceReports/report.html");

		// Configure the sparkReport Information
		spark.config().setDocumentTitle("Regression Testing for Register page");
		spark.config().setReportName("Regression suit");
		spark.config().setTheme(Theme.STANDARD);

		// Create the Extent Report
		report = new ExtentReports();

		// Attach the spark Report and ExtentReport
		report.attachReporter(spark);

		// Configure the System information in Extent Report
		report.setSystemInfo("Devicename", "Harry");
		report.setSystemInfo("OperatingSystem", "WINDOWS 11");
		report.setSystemInfo("Browser", "Chrome");
		report.setSystemInfo("BrowserVersion", "chrome-128.0.6613.85");

	}

	@AfterSuite
	public void suiteTerminateSetup() {

		// Flush the Report information
		report.flush();
	}

	@Parameters({ "browsername", "weburl" })
	@BeforeClass
	public void openbrowser(String name, String url) {
		createobjects();
	
		webdriverobj.browsersetup(name);
		Reporter.log("launch browser succes",true);

		webdriverobj.maximizebrowser();
		Reporter.log("maximizebrowser browser succes",true);
		// String weburl = ReadPropertiesFile.readdata("url");
		webdriverobj.launchapp(url);
		Reporter.log("launch browser succes",true);

	}

	@AfterClass
	public void terminatebrowser() {
		
		webdriverobj.terminateBrowser();
		Reporter.log("terminateBrowser browser succes",true);

	}

	public void createobjects() {
	 webdriverobj = new Webdriverutil();
		//excelutilityobj = new Readexcelfile();

	}

}
