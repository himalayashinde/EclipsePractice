package AutomationPractice;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import systemProperty.setProperty;

public class AutomationPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		setProperty property = new setProperty();
		property.setData();
		WebDriver driver = property.getChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// Size of all the links on the URL provided.
		System.out.println("Count of links in full webpage= " + driver.findElements(By.cssSelector("a")).size());

		// footer WebElement
		WebElement footer = driver.findElement(By.id("gf-BIG"));

		// find the size of all the link in the footer
		System.out.println("Count of links in footer= " + footer.findElements(By.cssSelector("a")).size());

		WebElement FooterColumn = footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));

		// find the list of links in footer 1st column
		System.out.println("Footer 1st Column links count= " + FooterColumn.findElements(By.tagName("a")).size());

		// Click on each links in the Footer 1st Column and check if the pages are
		// opening

		for (int i = 1; i < FooterColumn.findElements(By.tagName("a")).size(); i++) 
		{
			String clickOnLinkTab= Keys.chord(Keys.CONTROL,Keys.ENTER);
			FooterColumn.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
			Thread.sleep(3000);
		}
		
			Set<String> windows=driver.getWindowHandles();
			Iterator<String> it=windows.iterator();
			
			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println("WebPage Title:= "+driver.getTitle());
			}
			
	}

}
