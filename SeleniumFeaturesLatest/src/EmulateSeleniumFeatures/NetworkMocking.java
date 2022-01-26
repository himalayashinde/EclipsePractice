package EmulateSeleniumFeatures;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v96.emulation.Emulation;
import org.openqa.selenium.devtools.v96.network.Network;
import org.openqa.selenium.devtools.v96.network.model.Request;
import org.openqa.selenium.devtools.v96.network.model.Response;

public class NetworkMocking {

	//@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","I:\\Selenium Training\\Selenium 3 jar\\chromedriver\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		DevTools devTools= driver.getDevTools();
		
		devTools.createSession();
		
		//send commands to CDP
		
		///devTools.send(Emulation.setDeviceMetricsOverride(600, 1000, 50, true, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));
	
		devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()))	;	
		
		
		devTools.addListener(Network.requestWillBeSent(), request ->{
			
			Request req = request.getRequest();
			System.out.println("Requested URL := "+req.getUrl());
			
		});
		
		devTools.addListener(Network.responseReceived(), response -> 
		{
			Response res = response.getResponse();
			System.out.println(" Response URL := "+res.getUrl());
			System.out.println("Status Code := "+res.getStatus());
			if(res.getStatus().toString().startsWith("4")){
				System.out.println(res.getUrl()+"is failing with the status code "+ res.getStatus());
			}
			
		}
				);
		
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		
		driver.findElement(By.cssSelector("button[routerlink='/library']")).click();
		
		
		
	}

}
