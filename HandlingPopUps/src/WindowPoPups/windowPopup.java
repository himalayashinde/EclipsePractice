package WindowPoPups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"I:\\Selenium Training\\Selenium 3 jar\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://admin:admin@the-internet.herokuapp.com");
		driver.findElement(By.cssSelector("a[href$='/basic_auth']")).click();
	}

}
