package EmulateSeleniumFeatures;

import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v96.emulation.Emulation;

public class MobileEmulatorTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","I:\\Selenium Training\\Selenium 3 jar\\chromedriver\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		DevTools devTools= driver.getDevTools();
		
		devTools.createSession();
		
		//send commands to CDP
		
		devTools.send(Emulation.setDeviceMetricsOverride(600, 1000, 50, true, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));
	
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		
		driver.findElement(By.cssSelector(".navbar-toggler-icon")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Library")).click();
		
		
	}

}
