package checkboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import systemProperty.setProperty;

public class checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		setProperty SystemPorperty = new setProperty();
		SystemPorperty.setData();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
		Thread.sleep(1000);
		
		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
		Thread.sleep(1000);
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		Thread.sleep(1000);
		Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(),3);
		
		driver.quit();
	}

}
