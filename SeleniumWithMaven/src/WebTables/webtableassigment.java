package WebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import systemProperty.setProperty;

public class webtableassigment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		setProperty property = new setProperty();
		
		property.setData();
		WebDriver driver=property.getChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(2000);
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		js.executeScript("window.scroll(0,600)");
		
		//Rows Count
		System.out.println(driver.findElements(By.cssSelector("table[name='courses'] tr")).size());
		
		Thread.sleep(1000);
		
		//Column Count
		System.out.println(driver.findElements(By.cssSelector("table[name='courses'] th")).size());
		
		//2nd Row Content		
		System.out.println(driver.findElement(By.cssSelector("table[name='courses'] tr:nth-child(3)")).getText());
	}

}
