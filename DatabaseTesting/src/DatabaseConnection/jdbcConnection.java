package DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jdbcConnection {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String url = "jdbc:mysql://localhost:3306/qadbt";
		String user = "root";
		String password = "root";
		
		System.setProperty("webdriver.chrome.driver",
				"I:\\Selenium Training\\Selenium 3 jar\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection(url, user, password);

		Statement st = con.createStatement();

		ResultSet rs = st.executeQuery("select * from credentials where scenario ='zerobalancecard'");

		while (rs.next()) {
			String uname = rs.getString("username");
			String pass = rs.getString("password");

			driver.findElement(By.id("username")).sendKeys(uname);
			driver.findElement(By.id("password")).sendKeys(pass);
			
		}
		
		
		
		
		
		
	}

	
	
}
