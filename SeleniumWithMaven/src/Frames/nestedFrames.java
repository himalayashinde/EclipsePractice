package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import systemProperty.setProperty;

public class nestedFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		setProperty property = new setProperty();
		property.setData();
		WebDriver driver = property.getChromeDriver();

		driver.get("http://the-internet.herokuapp.com/nested_frames");
		
		//int TotalFramesOnPage=driver.findElements(By.tagName("frame")).size();
		
		//System.out.println("Total Number of frames on Home Page"+TotalFramesOnPage);
		driver.switchTo().frame(0);

		//int FrameNested=driver.findElements(By.tagName("frame")).size();
		//System.out.println("Nested Frame Count= "+FrameNested);
		driver.switchTo().frame(1);
		System.out.println(driver.findElement(By.cssSelector("div[id='content']")).getText());
		//System.out.println(driver.findElement(By.cssSelector("body")).getText());
	}

}
