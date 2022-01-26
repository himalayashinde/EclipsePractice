package Assignment6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import systemProperty.setProperty;

public class PracticeExcecise {

	public static void main(String[] args) {

		setProperty property = new setProperty();
		property.setData();
		WebDriver driver = property.getChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.id("checkBoxOption2")).click();
		String OptionSelected = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();

		System.out.println(OptionSelected);

		WebElement DropDown = driver.findElement(By.id("dropdown-class-example"));

		Select options = new Select(DropDown);

		options.selectByVisibleText(OptionSelected);

		driver.findElement(By.name("enter-name")).sendKeys(OptionSelected);

		driver.findElement(By.id("alertbtn")).click();

		String text = driver.switchTo().alert().getText();

		if (text.contains(OptionSelected))

		{
			System.out.println("Option Selected in checkbox is sent to AlertBox");
		} else
			System.out.println("Options is not correctly sent.. Please check again..!!");
	}

}
