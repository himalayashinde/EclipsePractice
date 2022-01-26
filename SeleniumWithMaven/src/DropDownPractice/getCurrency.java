package DropDownPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class getCurrency {

	public void getCurrencyValue(WebDriver driver) throws InterruptedException{
		
WebElement staticDropDown =driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

		
		Select DropDown= new Select(staticDropDown);
		
		Thread.sleep(1000);
		
		for(int i=3;i>0;i--)
		{
			DropDown.selectByIndex(i);
			
			Thread.sleep(1000);
			
			System.out.println(DropDown.getFirstSelectedOption().getText());
		}		
	}
	
}
