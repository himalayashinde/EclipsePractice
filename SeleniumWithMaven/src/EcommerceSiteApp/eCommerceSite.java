package EcommerceSiteApp;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import systemProperty.setProperty;

public class eCommerceSite {

	@SuppressWarnings({ "unchecked", "deprecation" })
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		setProperty webSite = new setProperty();

		webSite.setData();
		WebDriver driver = webSite.getChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		WebDriverWait wait= new WebDriverWait(driver,5);
		//Thread.sleep(2000);

		String[] itemsNeeded = { "Brocolli", "Cucumber", "Beetroot", "Cauliflower", "Banana", "Pumpkin", "Grapes" };

		// Add Items Class
		AddItems Cart =new AddItems();
		Cart.addItems(driver, itemsNeeded);

		CheckOut payment =new CheckOut();
		payment.proceedToCheckOut(driver,wait);
		
	}


}// Class Closure
