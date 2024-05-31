package Button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DoubleClick extends BaseClass {
	@Test
	public void doubleClick() throws InterruptedException {
		 Actions a =new Actions (driver);
		 
		 WebElement button= driver.findElement(By.id("btn20"));
		  a.doubleClick(button).build().perform();
		 Thread.sleep(2000) ;
		// driver.findElement(By.xpath("//div[text()='Yes']")).click();
		 
		 
		 WebElement button1= driver.findElement(By.id("btn23"));
		  a.doubleClick(button1).build().perform();
		 Thread.sleep(2000) ;
		
		 
		 WebElement button2= driver.findElement(By.id("btn27"));
		  a.doubleClick(button2).build().perform();
		 
		 
	}

}
