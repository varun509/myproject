package com.epdom.welcometest;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.epdom.genericlibrary.BaseTest;
import com.epdom.pagerepository.Pagemanagement;
import com.epdom.pagerepository.WelcomePage;
import com.epdom.propertyfilelibrary.ReadPropertiesFile;
import com.epdom.webdriver.library.Webdriverutil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verifywelcometest extends BaseTest {
	public Pagemanagement pagemanagementobj;
	// public WebDriver driver;
	@Test(priority = 1)
	public void verifywelcomepagewithvalidinput() throws Exception {
	
		// Create the Test Information
		test = report.createTest("verifywelcomepagewithvalidInput");
		test.log(Status.INFO, "execution statrted");
		test.log(Status.INFO, "launching done statrted");
		webdriverobj.waitimplicitly(20);

		String title = "Learning Selenium";
		String actualtitle = webdriverobj.driver.getTitle();
//		if (title.contains(actualtitle)) {
//			Reporter.log("pass",true);
//			
//		} else
//			Reporter.log("fail",true);
		Assert.assertEquals(actualtitle, title);
		test.log(Status.PASS, "title verified statrted"+title);

		pagemanagementobj = new Pagemanagement(webdriverobj.driver);
		WelcomePage wel = new WelcomePage(webdriverobj.driver);

		WebElement uname = wel.getuname();
		WebElement mail = wel.getmail();
		WebElement pass = wel.getpass();
		WebElement mobno = wel.getMob();
		WebElement dob = wel.getDob();
		WebElement feedback = wel.getFeedback();
//		boolean b = uname.isDisplayed();
////		if (uname.isDisplayed()) {
////			 Reporter.log("uname is present",true);
////			
////		} else
////		   Reporter.log("not there",true);
//		Assert.assertTrue(b, "uname is present");
//		
		uname.clear();
		uname.sendKeys("RON");
		mail.sendKeys("varunt153@gmail.com");
		pass.sendKeys("hero");
		mobno.sendKeys("7036374200");
		feedback.sendKeys("very good");
//		Select s1=new Select(dob);
//		s1.selectByVisibleText("AUSTRALIA");
//		
		Thread.sleep(2000);
		// BaseTest.terminatebrowser();

	}

	@Test(priority = 2,invocationCount = 2,dependsOnMethods = "verifywelcomepagewithvalidinput")
	public void verifywelcomepagewithinvalidinputs() {
		// Create the Test Information
				test = report.createTest("verifywelcomepagewithinvalidInput");
				test.log(Status.INFO, "execution statrted");
				test.log(Status.INFO, "launching done statrted");
				webdriverobj.waitimplicitly(20);

	
	}

}
