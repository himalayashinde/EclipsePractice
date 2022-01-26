package EcommerceSiteApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckOut {

	public void proceedToCheckOut(WebDriver driver,WebDriverWait wait) throws InterruptedException {
		
		//a.cart-icon img[alt="Cart"]
		
		driver.findElement(By.cssSelector("a.cart-icon img[alt='Cart']")).click();
		
		driver.findElement(By.xpath("(//button[normalize-space()='PROCEED TO CHECKOUT'])[1]")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.cssSelector(".promoWrapper button[class='promoBtn']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		driver.findElement(By.xpath("(//button[normalize-space()='Place Order'])[1]")).click();
		
	}
	
}
