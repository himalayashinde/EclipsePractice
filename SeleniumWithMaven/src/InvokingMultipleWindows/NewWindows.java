package InvokingMultipleWindows;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

import systemProperty.setProperty;

public class NewWindows {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		setProperty property = new setProperty();

		property.setData();
		WebDriver driver = property.getChromeDriver();

		driver.get("https://rahulshettyacademy.com/angularpractice/");

		// Opens a new Blank Tab
		driver.switchTo().newWindow(WindowType.WINDOW);

		Set<String> handles = driver.getWindowHandles();

		Iterator<String> it = handles.iterator();
		
		String parentWindowId = it.next();
		String childWindowId= it.next();
		
		driver.switchTo().window(childWindowId);
		
		driver.get("https://www.rahulshettyacademy.com/#/index");
		
		String courseName= driver.findElements(By.cssSelector("h2 a[href*='https://courses.rahulshettyacademy.com/p']")).get(2).getText();
		
		System.out.println(courseName);
		
		driver.switchTo().window(parentWindowId);
		WebElement name=driver.findElement(By.cssSelector("div input[minlength='2']"));
		name.sendKeys(courseName);
		
		//Screenshot mechanism
		File file= name.getScreenshotAs(OutputType.FILE);	
		FileUtils.copyFile(file, new File("logo.png"));
		
		
		// Get Height and Width
		
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());
		 
		Thread.sleep(2000);
		driver.quit();
	}

}
