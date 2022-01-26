import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import systemProperty.setProperty;

public class ClearTripAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		setProperty system = new setProperty();
		system.setData();
		
		WebDriver driver= system.getChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.cleartrip.com/");//https://www.cleartrip.com/
		
	/**/	Thread.sleep(2000);
		
		driver.findElement(By.cssSelector(".homeCalender")).click();
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.cssSelector(".DayPicker-Day.DayPicker-Day--start.DayPicker-Day--selected.DayPicker-Day--today")).getText());
		driver.findElement(By.cssSelector(".DayPicker-Day.DayPicker-Day--start.DayPicker-Day--selected.DayPicker-Day--today")).click();
		Thread.sleep(2000);
	
		//Select Adult DropDown
		
		WebElement options=driver.findElement(By.cssSelector("div[class='mb-4'] select"));
		Select option= new Select(options);
		
		option.selectByIndex(4);
		Thread.sleep(2000);
			
		//Select Hyperlink on page
		driver.findElement(By.cssSelector("div[class='mb-4'] a")).click();;
		Thread.sleep(2000);
		WebElement ClassOfTravel = driver.findElement(By.xpath("(//select)[4]"));
		Select option2= new Select(ClassOfTravel);
		option2.selectByIndex(2);
		Thread.sleep(2000);
		
		//Preferred Airline
		
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Indigo");
		
		//Search Flight
		driver.findElement(By.xpath("//button[text()='Search flights']")).click();

		
		//span[text()="Select Departure and Arrival airports/cities."]
		
		WebElement Error = driver.findElement(By.xpath("//span[text()='Select Departure and Arrival airports/cities.']"));
		if(Error != null)
		{
			System.out.println(Error.getText());
		}
		else
		{
			System.out.println("Error not there...!!!");
		}
		
		driver.quit();
		
	}

}
