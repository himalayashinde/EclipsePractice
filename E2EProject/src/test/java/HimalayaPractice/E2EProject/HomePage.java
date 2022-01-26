package HimalayaPractice.E2EProject;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.ForgotPassword;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class HomePage extends base {
	
public static Logger log= LogManager.getLogger(base.class.getName());

	public WebDriver driver;
	
	@BeforeTest
	public void initializer() throws Exception{
		driver = initializeDriver();
		
		Thread.sleep(1000);
	}
	
	@Test(dataProvider="getData")
	public void ValidateHomePage(String Username,String Password, String text) throws IOException, InterruptedException
	{
		//driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		Thread.sleep(1000);
		
		LandingPage lp = new LandingPage(driver);
		LoginPage lop=lp.getLogin();
		Thread.sleep(1000);
		
		lop.getEmail().sendKeys(Username);
		lop.getPassword().sendKeys(Password);
		log.info(text);
		
		Thread.sleep(1000);
		
		lop.getLoginbtn().click();
		Thread.sleep(1000);
		
		ForgotPassword fp = lop.forgotPassword();
		fp.getEmail().sendKeys("xxx");
		fp.getNext().click();
		//driver.quit();
		
	}
	
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data= new Object[2][3];
		
		data[0][0]= "nonrestricteduser@qw.com";
		data[0][1]= "123456";
		data[0][2]= "Restricted User";
		
		data[1][0]= "restricteduser@qw.com";
		data[1][1]= "456789";
		data[1][2]= "Non Restriceted User";
		
		return data;
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}
	
}
