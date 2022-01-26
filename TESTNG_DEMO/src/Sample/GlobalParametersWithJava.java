package Sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalParametersWithJava {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties prop= new Properties();
		
		FileInputStream FIS = new FileInputStream("I:\\Eclipse IDE Spring\\TESTNG_DEMO\\src\\data.properties");
		prop.load(FIS);
		
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		
		prop.setProperty("browser", "firefox");
		
		System.out.println(prop.getProperty("browser"));
		
		FileOutputStream FOS = new FileOutputStream("I:\\\\Eclipse IDE Spring\\\\TESTNG_DEMO\\\\src\\\\data.properties");
	
		prop.store(FOS, null); 
	}

}
