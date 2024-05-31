package WebElement;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseClassDemoSite {
	WebDriver driver;
	@BeforeSuite
	public void beforeSuite() {
	System.out.println("connecting to the data base");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Precondition for test Runner");
	}
	
	@Parameters("url")
    @Test
	public void beforeClass(String url) {
		 driver =new ChromeDriver();
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get(url);
	}
	@BeforeMethod
	public void beforeMethod() {
			System.out.println("Before Method");
			
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod");
	}
	@AfterClass
	public void afterClass() {
	//	driver.close();
	}
	@AfterTest
	public void afterTest() {
		System.out.println("post Condition for test Runner");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("dis-connecting to the data base");
	}


}
