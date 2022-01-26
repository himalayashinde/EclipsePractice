package EmulateSeleniumFeatures;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v96.emulation.Emulation;
import org.openqa.selenium.devtools.v96.fetch.Fetch;
import org.openqa.selenium.devtools.v96.network.Network;
import org.openqa.selenium.devtools.v96.network.model.Request;
import org.openqa.selenium.devtools.v96.network.model.Response;

public class NetworkLogActivity {

	// @SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"I:\\Selenium Training\\Selenium 3 jar\\chromedriver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		DevTools devTools = driver.getDevTools();

		devTools.createSession();

		devTools.send(Fetch.enable(Optional.empty(), Optional.empty()));

		devTools.addListener(Fetch.requestPaused(), request -> {

			if (request.getRequest().getUrl().contains("shetty")) {
				String mockerURL = request.getRequest().getUrl().replace("=shetty", "=BadGuy");

				System.out.println(mockerURL);

				devTools.send(Fetch.continueRequest(request.getRequestId(), Optional.of(mockerURL),
						Optional.of(request.getRequest().getMethod()), Optional.empty(), Optional.empty(),
						Optional.empty()));

			} else {

				devTools.send(Fetch.continueRequest(request.getRequestId(), Optional.of(request.getRequest().getUrl()),
						Optional.of(request.getRequest().getMethod()), Optional.empty(), Optional.empty(),
						Optional.empty()));
			}

		});

		driver.get("https://rahulshettyacademy.com/angularAppdemo/");

		driver.findElement(By.cssSelector("button[routerlink='/library']")).click();

		System.out.println(driver.findElement(By.cssSelector("p")).getText());

	}

}
