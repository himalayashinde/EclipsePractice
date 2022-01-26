import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import systemProperty.setProperty;

public class Rahulshettylogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
	setProperty systemProperty= new setProperty();	
	systemProperty.setData();
	
	WebDriver driver= new ChromeDriver();

	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	Thread.sleep(1000);
	
	driver.findElement(By.id("inputUsername")).sendKeys("himalayashinde@gmail.com");
	driver.findElement(By.name("inputPassword")).sendKeys("hello123");
	driver.findElement(By.className("signInBtn")).click();
	Thread.sleep(1000);
	
	String error= driver.findElement(By.className("error")).getText();
	System.out.println(error);
	Thread.sleep(1000);
	
	driver.findElement(By.linkText("Forgot your password?")).click();
	
	driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Himalaya");
	
	driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("himalaua.com");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("himalayashinde@gmail.com");

	
	driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("9789745323");

	driver.findElement(By.className("reset-pwd-btn")).click();
	
	Thread.sleep(1000);
	
	String infoMsg=driver.findElement(By.cssSelector("p.infoMsg")).getText();
	System.out.println(infoMsg);
	
	Thread.sleep(2000);
	
	driver.findElement(By.className("go-to-login-btn")).click();
	Thread.sleep(1000);
	
	
	driver.findElement(By.id("inputUsername")).sendKeys("himalayashinde@gmail.com");
	Thread.sleep(1000);
	
	driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
	Thread.sleep(1000);
	
	driver.findElement(By.id("chkboxOne")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.id("chkboxTwo")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.className("signInBtn")).click();
	Thread.sleep(1000);
	
	String SuccessMsg=driver.findElement(By.cssSelector("div[class='login-container'] p")).getText();
	System.out.println(SuccessMsg);
	
	Assert.assertEquals(SuccessMsg, "You are successfully logged in.");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//div/button[1]")).click();
	Thread.sleep(1000);
	
	//div/button[1]
	driver.quit();
	
	}

}
