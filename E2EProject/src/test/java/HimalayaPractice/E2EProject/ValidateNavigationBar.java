package HimalayaPractice.E2EProject;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class ValidateNavigationBar extends base {

	public WebDriver driver;
	public static Logger log= 	LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initializer() throws Exception{
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		Thread.sleep(1000);
	}
	
	
	@Test
	public void ValidateNavigationBars() throws IOException, InterruptedException
	{
		
		
		LandingPage lp = new LandingPage(driver);
		//lp.getLogin().click();
		Thread.sleep(1000);
		//System.out.println(lp.getTitle().getText());
		Assert.assertTrue(lp.getNavigationBar().isDisplayed()); 
		log.info("NavigationBar is Displayed ");
		//Assert.assertEquals(lp.getTitle().getText(), "Featured Courses");
		
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}
	
}
