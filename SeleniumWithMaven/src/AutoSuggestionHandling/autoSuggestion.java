package AutoSuggestionHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import systemProperty.setProperty;

public class autoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		setProperty property= new setProperty();
		property.setData();
		WebDriver driver=property.getChromeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

	    driver.findElement(By.id("autocomplete")).sendKeys("ind");

	    Thread.sleep(2000);

	    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

	    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN,Keys.ENTER);
	   
	    System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
	    
	   
	}

}
