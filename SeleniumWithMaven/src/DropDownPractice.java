//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

import Calendar.DepartureDate;
import DropDownPractice.AutoSuggest;
import DropDownPractice.DepartureAndArrivalCity;
import DropDownPractice.getCurrency;
import DropDownPractice.getPassengers;
import systemProperty.setProperty;

public class DropDownPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		setProperty systemProperty= new setProperty();
		
		systemProperty.setData();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

	
 		//set currency 
        getCurrency Currency = new getCurrency();
		Currency.getCurrencyValue(driver);

		//set passengers
 		getPassengers Passengers = new getPassengers();
		Passengers.setCount(driver);
	
		//Set Departure and Arrival city 
  		DepartureAndArrivalCity CityName= new DepartureAndArrivalCity();
		CityName.getDepartureCity(driver);
		Thread.sleep(1000);
		CityName.getArrivalCity(driver);
		
		//AutoSuggest the new City
		AutoSuggest Suggestion =new AutoSuggest();
		Suggestion.getSuggestion(driver);
		
		//Selection of date in calendar
		
		DepartureDate departure = new DepartureDate();
		
	 	departure.getDate(driver);
	 
		driver.quit();
		
	}	
}
