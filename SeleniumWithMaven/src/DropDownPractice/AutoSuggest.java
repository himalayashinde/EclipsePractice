package DropDownPractice;

import java.util.List;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.testng.collections.Lists;

public class AutoSuggest {

	public void getSuggestion(WebDriver driver) throws InterruptedException
	{
		//List <WebElement> suggest= driver.findElements(By.id("autosuggest"))).sendKeys("ind");
		driver.findElement(By.cssSelector("input[id='autosuggest']")).sendKeys("ind");
		
		Thread.sleep(2000);
		
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
	
		for(WebElement option : options){
			if(option.getText().equalsIgnoreCase("India")){
				System.out.println(option.getText());
				option.click();
				break;
			}
		}
	
	}
}
