package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class base {

	public Properties prop;
	public WebDriver driver;

	// @SuppressWarnings("deprecation")
	public WebDriver initializeDriver() throws IOException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		
		//String browserName = System.getProperty("browser");

		//System.out.println(browserName);
		String browserName = prop.getProperty("browser");

		System.out.println(browserName);

		if (browserName.contains("chrome")) {
			// chrome
			//System.out.println("Inside Chrome SetProperty :-" +System.getProperty("user.dir").toString());
			String Path=System.getProperty("user.dir")+"\\src\\main\\java\\resources\\chromedriver.exe";
			//System.out.println(Path);
			System.out.println(browserName);
			System.setProperty("webdriver.chrome.driver",Path);

			ChromeOptions options = new ChromeOptions();
			
			if(browserName.contains("headless"))
			{
				options.addArguments("headless");
			}
			
			driver = new ChromeDriver(options);

		} else if (browserName.equals("firefox")) {
			// firefox
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir")+"\\src\\main\\java\\resources\\geckodriver.exe");

			driver = new FirefoxDriver();

		} else if (browserName.equals("IE")) {
			// IE
			System.setProperty("webdriver.edge.driver",
					System.getProperty("user.dir")+"\\src\\main\\java\\resources\\msedgedriver.exe");

			driver = new EdgeDriver();
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return driver;

	}

	public String getScreenShotPath(String testMethodName, WebDriver driver) throws Exception {

		TakesScreenshot ts= (TakesScreenshot)driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		String destinationFile= System.getProperty("user.dir")+"\\reports\\"+testMethodName+".png";
		FileUtils.copyFile(source, new File(destinationFile));
		return destinationFile;
	}
	
	
	/*public static void main(String args[]) throws Exception {
		
		base b = new base();
		b.initializeDriver();
	}*/
	
}

