package Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DepartureDate {

	public void getDate(WebDriver driver) throws InterruptedException {
		// Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		Thread.sleep(1000);
	}

}
