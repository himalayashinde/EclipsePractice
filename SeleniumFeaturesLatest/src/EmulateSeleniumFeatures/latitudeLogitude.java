package EmulateSeleniumFeatures;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v96.emulation.Emulation;

public class latitudeLogitude {

	//@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","I:\\Selenium Training\\Selenium 3 jar\\chromedriver\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		DevTools devTools= driver.getDevTools();
		
		devTools.createSession();
		
		//send commands to CDP
		
		///devTools.send(Emulation.setDeviceMetricsOverride(600, 1000, 50, true, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));
	
		//@SuppressWarnings("rawtypes")
		Map<String,Object> coordinates = new HashMap<String,Object>();
		
		coordinates.put("latitude", 40);
		coordinates.put("longitude", 3);
		coordinates.put("accuracy", 1);
		
		
		driver.executeCdpCommand("Emulation.setGeolocationOverride", coordinates);
		
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("NetFlix",Keys.ENTER);
		
		driver.findElements(By.cssSelector(".LC20lb")).get(0).click();
		
		String title=driver.findElement(By.cssSelector(".our-story-card-title")).getText();
	
		System.out.println(title);
	}

}
