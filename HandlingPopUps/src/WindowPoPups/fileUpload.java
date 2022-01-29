package WindowPoPups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fileUpload {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"I:\\Selenium Training\\Selenium 3 jar\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://airconvertpdftojpg.com/");
		driver.findElement(By.cssSelector("button[id='dropzoneInput-label']")).click();
		
		//Thread.sleep(3000);
		
		Runtime.getRuntime().exec("C:\\Users\\ADMIN\\Downloads\\fileupload.exe");
		
		//WebDriverWait wait = new WebDriverWait(driver,10);
		Thread.sleep(20000);
	
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Convert Now!']")));
		
		driver.findElement(By.xpath("//button[text()='Convert Now!']")).click();
		
		Thread.sleep(15000);
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Download']")));
		
		driver.findElement(By.xpath("//a[text()='Download']")).click();

		Runtime.getRuntime().exec("C:\\Users\\ADMIN\\Downloads\\download.exe");
		
		
	}

}
