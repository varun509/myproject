package germanyisCalling;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Logintest {
	WebDriver driver;
	@BeforeTest
	public void openLoginPage() {
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://app.germanyiscalling.com/common/login/");
	
}
	@Test
	public void validLoginPage() {
		driver.findElement(By.id("username")).sendKeys("varunt153@gmail.com");
		driver.findElement(By.id("password")).sendKeys("varungermany");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String actual = driver.getCurrentUrl();
		Assert.assertEquals("https://app.germanyiscalling.com/cv/upload/", actual);
		Reporter.log("pass",true);
	}
//	@AfterMethod
//	public void logout() {
//		driver.findElement(By.id("dropdownUser1")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/ul/li[3]/a")).click();
//		
//	}
	
	@AfterTest
	public void close() {
		driver.quit();
	}
	@Test
	public void invalidLoginPage() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("varunt15@gmail.com");
		driver.findElement(By.id("password")).sendKeys("varungerman");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		WebElement element = driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/form/div[3]/ul/li"));
		String message=element.getText();
		System.out.println(message);
		String expected="Please enter a correct username and password. Note that both fields may be case-sensitive.";
		Assert.assertTrue(message.contains(expected));
		Thread.sleep(2000);
		
	}











}
