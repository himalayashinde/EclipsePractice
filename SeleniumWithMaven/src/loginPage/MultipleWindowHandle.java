package loginPage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import systemProperty.setProperty;

public class MultipleWindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		setProperty property=new setProperty();
		property.setData();
		WebDriver driver=property.getChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/windows");
		
		driver.findElement(By.cssSelector("div[class='example'] a[href$='/windows/new']")).click();
		
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		
		String parentId= it.next();
		String childId= it.next();
		
		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.cssSelector("h3")).getText());
		
		driver.switchTo().window(parentId);
		System.out.println(driver.findElement(By.cssSelector("h3")).getText());
		
	}

}
