package systemProperty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/*import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;*/
@Test
public class setProperty {

	// System.setProperty("webdriver.chrome.driver",
	// "I:\\Selenium Training\\Selenium 3 jar\\chromedriver\\chromedriver.exe");
	public void setData() {
		System.setProperty("webdriver.chrome.driver",
				"I:\\Selenium Training\\Selenium 3 jar\\chromedriver\\chromedriver.exe");
	}

	public WebDriver getChromeDriver() {

		WebDriver driver = new ChromeDriver();

		return driver;
	}
}
