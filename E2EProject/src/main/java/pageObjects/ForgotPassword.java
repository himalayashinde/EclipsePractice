package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword {

	public WebDriver driver;
	
	By email =By.id("email");
	By Next =By.cssSelector("input[type='submit']");
	//By loginbtn = By.cssSelector("input[value='Login']");
	
		
	public ForgotPassword(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement getEmail() {
		
		return driver.findElement(email);
	}
	
	public WebElement getNext() {
		return driver.findElement(Next);
	}

	
	
	
}
