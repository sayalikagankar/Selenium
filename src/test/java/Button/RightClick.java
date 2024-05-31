package Button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RightClick extends BaseClass{
	@Test
	public void rightClick() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Right Click']")).click();
		Thread.sleep(2000) ;
	
		
		 Actions a =new Actions (driver);
		 WebElement button= driver.findElement(By.id("btn30"));
		 a.contextClick(button).build().perform();
		 Thread.sleep(2000) ;
		 driver.findElement(By.xpath("//div[text()='Yes']")).click();
		 Thread.sleep(2000) ;
		 
		 WebElement button1 =driver.findElement(By.id("btn31"));
		 a.contextClick(button1).build().perform();
		 Thread.sleep(2000) ;
		 driver.findElement(By.xpath("//div[text()='Yes']")).click();
		 Thread.sleep(2000) ;
		 
		 
		 WebElement button2 =driver.findElement(By.id("btn32"));
		 a.contextClick(button2).build().perform();
		 Thread.sleep(2000) ;
		 driver.findElement(By.xpath("//div[text()='4']")).click();
		 
	}

}
