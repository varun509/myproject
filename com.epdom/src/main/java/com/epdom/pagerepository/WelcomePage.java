package com.epdom.pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	@FindBy(id="name")
	private WebElement uname;
	@FindBy(id="email")
	private WebElement mailid;
	
	@FindBy(id="password")
	private WebElement pass;
	@FindBy(id="mobile")
	private WebElement mob;
	@FindBy(xpath="//a[text()='Contact Us']")
	private WebElement contactus;
	@FindBy(xpath="(//input[@type='radio'])[1]")
	private WebElement gender;
	@FindBy(xpath="(//input[@type='checkbox'])[1]")
	private WebElement checkbox;
	@FindBy(xpath="(//select[@name='country1'])")
	private WebElement country;
	@FindBy(xpath="(//textarea[@name='feedback'])")
	private WebElement feedback;
	@FindBy(xpath="(//input[@name='photo'])")
	private WebElement upload;
	@FindBy(xpath="(//input[@value='Register'])")
	private WebElement register;
	@FindBy(xpath="(//input[@name='dob'])")
	private WebElement dob;
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getMob() {
		return mob;
	}
	public WebElement getDob() {
		return dob;
	}
	public WebElement getRegister() {
		return register;
	}
	public WebElement getUpload() {
		return upload;
	}
	public WebElement getFeedback() {
		return feedback;
	}
	public WebElement getCountry() {
		return country;
	}
	public WebElement getCheckbox() {
		return checkbox;
	}
	public WebElement getGender() {
		return gender;
	}
	
	public WebElement getuname() {
		return uname;
	}
	public WebElement getpass() {
		return pass;
	}
	public WebElement getmail() {
		return mailid;
		}
	public WebElement clickcontact() {
		return contactus;
	}
}
