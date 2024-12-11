package com.epdom.webdriver.library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

import freemarker.core.ReturnInstruction.Return;
import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * this class provides reusable mehods to perform all browser related actions
 * @author fern
 * */
public class Webdriverutil {

	public WebDriver driver;
	public static WebDriver driver_static;
	public Select selectobj;
	public Actions actionobj;
/**
 * @param String browsername
 * @{@link Return} void*/
	public void waitimplicitly(long duration) {
		driver.manage().timeouts().implicitlyWait(duration, TimeUnit.SECONDS);
	}

	public void launchapp(String url) {
		driver.get(url);
	}

	public void selectoption(WebElement element, int index) {
		selectobj.selectByIndex(index);
	}

	public void selectoption(WebElement element, String visibilitytext) {
		selectobj.selectByVisibleText(visibilitytext);
	}

	public void selectoption(String value, WebElement element) {
		selectobj.selectByValue(value);
	}
/**
 * this method is used to perform actions on popup.*/
	public void alertpopaccept() {
		driver.switchTo().alert().accept();
	}

	public void alertpopdismiss() {
		driver.switchTo().alert().dismiss();
	}

	public void switchcontroltoframe(int index) {
		driver.switchTo().frame(index);
	}

	public void switchcontroltoframe(WebElement element) {
		driver.switchTo().frame(element);
	}

	public void switchcontroltoframe(String name) {
		driver.switchTo().frame(name);
	}

	public void switchback() {
		driver.switchTo().defaultContent();
	}

	public void switchcontroltowindow(String windowid) {
		driver.switchTo().window(windowid);
	}

	public void terminateBrowser() {
		driver.quit();

	}

	public void maximizebrowser() {
		driver.manage().window().maximize();

	}
	/**
	 * @param String browsername
	 * @{@link Return} void*/
	public void browsersetup(String brow) {
		// Scanner sc=new Scanner(System.in);
		// System.out.println("enter the browser:");
		// String brow=sc.nextLine();
		switch (brow) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver_static = driver;
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver_static = driver;

		default:
			System.out.println("invalid browser");
			driver_static = driver;
			break;
		}
	}

}
