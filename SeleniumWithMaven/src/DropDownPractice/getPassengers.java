package DropDownPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class getPassengers {

	public void setCount(WebDriver driver) throws InterruptedException {
		
		//divpaxinfo
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		Thread.sleep(2000);
		
		int i=1;
		while(i<4)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("btnclosepaxoption")).click();

		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "4 Adult");
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}
}
