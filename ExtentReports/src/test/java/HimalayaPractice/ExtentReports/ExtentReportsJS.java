package HimalayaPractice.ExtentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class ExtentReportsJS {
	
	ExtentReports extent;
	@BeforeTest
	public void config(){
		
		//ExtentReports, ExtentSparkReporter
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter= new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		
		extent= new ExtentReports();
		
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester","Himalaya Shinde");
	}


	@Test
	public void initialDemo() {
		
		ExtentTest test=extent.createTest("Initial Demo");
		
		System.setProperty("webdriver.chrome.driver",
				"I:\\Selenium Training\\Selenium 3 jar\\chromedriver\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/#/index");
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
		test.fail("Result do not match...!!!");
		
		extent.flush();
		
	}
	
}
