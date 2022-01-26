package itGeared;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import systemProperty.setProperty;

public class ExplicitWaitExample {

	public static void main(String[] args) {

		setProperty environment = new setProperty();
		environment.setData();
		WebDriver driver = environment.getChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 5);

		driver.get("https://www.itgeared.com/demo/1506-ajax-loading.html");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a)[2]")));

		driver.findElement(By.xpath("(//a)[2]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#results")));

		System.out.println(driver.findElement(By.cssSelector("div#results")).getText());

	}

}
