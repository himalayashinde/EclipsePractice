package DropDownPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DepartureAndArrivalCity {

	public void getDepartureCity(WebDriver driver) throws InterruptedException{
		
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[@text='Mumbai (BOM)']")).click();
	
	Thread.sleep(1000);
	
	}	
	
	
	public void getArrivalCity(WebDriver driver) throws InterruptedException{
				
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@text='Hyderabad (HYD)']")).click();
		
		Thread.sleep(1000);
		
	}
		
}
