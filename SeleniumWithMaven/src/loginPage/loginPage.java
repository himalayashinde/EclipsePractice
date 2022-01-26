package loginPage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import systemProperty.setProperty;

public class loginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		setProperty property = new setProperty();

		property.setData();

		WebDriver driver = property.getChromeDriver();

		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");

		driver.findElement(By.cssSelector("a.blinkingText")).click();

		Set<String> windows = driver.getWindowHandles();

		Iterator<String> it = windows.iterator();

		String parentId = it.next();

		String childId = it.next();

		driver.switchTo().window(childId);

		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());

		String Email = driver.findElement(By.cssSelector(".im-para.red")).getText();

		String ExtractedEmailId = Email.split("at")[1].trim().split("with")[0].trim();
		System.out.println(ExtractedEmailId);

		driver.switchTo().window(parentId);

		driver.findElement(By.cssSelector("#username")).sendKeys(ExtractedEmailId);

	}

}
