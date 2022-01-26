package HimalayaPractice.E2EProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class ValidateTitle extends base {

public WebDriver driver;

public static Logger log= 	LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initializer() throws Exception{
		driver = initializeDriver();
		log.info("Driver is Initialized for ValidateTitle...");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to HomePage URL");		
		Thread.sleep(1000);
	}
	
	@Test
	public void ValidateAppTitle() throws IOException, InterruptedException
	{
		//driver = initializeDriver();
		//driver.get("https://rahulshettyacademy.com/");
		Thread.sleep(1000);
		
		LandingPage lp = new LandingPage(driver);
		//lp.getLogin().click();
		Thread.sleep(1000);
		//System.out.println(lp.getTitle().getText());
		
		Assert.assertEquals(lp.getTitle().getText(), "Featured Courses");
		log.info("Successfully Validated Text message...");
		//driver.quit();
		
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}
	
}
