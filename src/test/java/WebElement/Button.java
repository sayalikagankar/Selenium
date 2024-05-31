package WebElement;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Button extends BaseClassDemoSite {
	
  
    @Test
	public void clickbutton() throws InterruptedException  {
		
		driver.findElement(By.id("btn")).click();
		Thread.sleep(2000) ;
		driver.findElement(By.id("btn3")).click();
		Thread.sleep(2000) ;
		driver.findElement(By.id("btn7")).click();
		Thread.sleep(2000) ;
		
		 
		 
		 
		 
		}
	
	


	
	

}
