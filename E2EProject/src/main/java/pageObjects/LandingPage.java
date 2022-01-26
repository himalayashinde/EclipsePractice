package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;

	private By signin = By.xpath("//div[@class='login-btn'] /a[@class='theme-btn register-btn']");

	private By title = By.xpath("//div[@class='pull-left']/h2");

	private By Navbar = By.xpath("//div[@class='clearfix']");

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	public LoginPage getLogin() {

		driver.findElement(signin).click();
		LoginPage lop = new LoginPage(driver);
		return lop;

	}

	public WebElement getTitle() {

		return driver.findElement(title);
	}

	public WebElement getNavigationBar() {

		return driver.findElement(Navbar);
	}
}
