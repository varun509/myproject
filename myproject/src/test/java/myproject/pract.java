package myproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pract {
	WebDriver driver;
	@Parameters("url")
	@BeforeTest
	public void openpage(String url) {
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);

	}
	@Parameters({"uname","pass"})
	@Test
	public void loginPage(String uname,String pass) {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys(uname);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys(pass);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	}
	@AfterMethod
  public void verifylogin() {
	  String url=driver.getCurrentUrl();
	  Assert.assertEquals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index", url);
	  Reporter.log("pass",true);
  }
	@AfterTest(enabled = true)
	public void closebrow() {
		driver.close();
	}

}
