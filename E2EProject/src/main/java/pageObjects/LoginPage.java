package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;
	
	By email =By.id("email");
	By password =By.id("password");
	By loginbtn = By.cssSelector("input[value='Login']");
	
	By forgotPassword = By.cssSelector("[href*='forgot_password']");

	public ForgotPassword forgotPassword() {

		driver.findElement(forgotPassword).click();
		return new ForgotPassword(driver);
	}
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement getEmail() {
		
		return driver.findElement(email);
	}
	
	public WebElement getPassword() {
		return driver.findElement(password);
	}

	public WebElement getLoginbtn() {
		return driver.findElement(loginbtn);
	}
	
	
}
