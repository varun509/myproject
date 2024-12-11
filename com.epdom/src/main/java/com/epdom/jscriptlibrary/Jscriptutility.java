package com.epdom.jscriptlibrary;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Jscriptutility {
	
	public static WebDriver driver;
	public static JavascriptExecutor jsobj;
	
	public static void enterdatatodisabledelement(WebElement element,String data) {
		JavascriptExecutor jsobj=(JavascriptExecutor)driver;
		jsobj.executeScript("arguments[0].value="+data+" ",element);
		
	}
public static void scrollby() {
	JavascriptExecutor jsobj=(JavascriptExecutor)driver;
	jsobj.executeScript("window.scrollBy(1000,1000)");
	}
public static void scrollto() {
	JavascriptExecutor jsobj=(JavascriptExecutor)driver;
	jsobj.executeScript("window.scrollto(1000,1000)");
}
public static void scrollusingview(WebElement element,boolean value) {
	JavascriptExecutor jsobj=(JavascriptExecutor)driver;
	jsobj.executeScript("arguments[0].scrollIntoView("+value+")", element);
}

}
