package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TextBox extends BaseClassDemoSite {
	
	@Parameters({"name","Email","password"})
    @Test
	public void enterintoTexBox(String name,String Email,String password) throws InterruptedException {
		
		
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys(name) ;
		Thread.sleep(2000) ;
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(Email);
		Thread.sleep(2000) ;

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);		
		
		
	}

}
