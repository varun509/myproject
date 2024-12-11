package com.epdom.pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Pagemanagement {
	
	public WebDriver driver;
	public Loginpage loginpageobj;
	public Registerpage registerpageobj;
	public WelcomePage welcomepageobj;
	public Pagemanagement(WebDriver driver) {
		this.driver=driver;
	}
	public Loginpage initloginpage() {
		loginpageobj=new Loginpage(driver);
		return loginpageobj;
	}
	public Registerpage initregisterpage() {
		registerpageobj=new Registerpage(driver);
		return registerpageobj;
	}
	public WelcomePage initwelcomepage() {
		welcomepageobj=new WelcomePage(driver);
		return welcomepageobj;
	}
	
	

}
