package JavaStreams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import systemProperty.setProperty;

public class filterFunctionality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		setProperty property = new setProperty();
		property.setData();
		WebDriver driver = property.getChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		driver.findElement(By.id("search-field")).sendKeys("Rice");
		
		List<WebElement> veggies= driver.findElements(By.xpath("//tr/td[1]"));
		
		List<WebElement> filteredList= veggies.stream().filter(veggie -> veggie.getText().contains("Rice")).collect(Collectors.toList());
		
		Assert.assertEquals(veggies.size(), filteredList.size());
		

	}

}
