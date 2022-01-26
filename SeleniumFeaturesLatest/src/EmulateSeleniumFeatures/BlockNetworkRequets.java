package EmulateSeleniumFeatures;

import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v96.network.Network;

import com.google.common.collect.ImmutableList;

public class BlockNetworkRequets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"I:\\Selenium Training\\Selenium 3 jar\\chromedriver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		DevTools devTools = driver.getDevTools();

		devTools.createSession();

		devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));

		devTools.send(Network.setBlockedURLs(ImmutableList.of("*.jpg","*.css")));
		
		long startTime= System.currentTimeMillis();
		//System.out.println(startTime);
		
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		
		driver.findElement(By.xpath("//a[text()='Browse Products']")).click();
	
		driver.findElement(By.linkText("Selenium")).click();
		
		driver.findElement(By.cssSelector(".add-to-cart")).click();
		
		System.out.println(driver.findElement(By.cssSelector(" .sp")).getText());
		
		long endTime= System.currentTimeMillis();
		System.out.println(endTime-startTime);
	}

}
