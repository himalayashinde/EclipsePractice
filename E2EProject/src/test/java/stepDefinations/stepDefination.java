package stepDefinations;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.portalHomePage;
import resources.base;

public class stepDefination extends base{
	
	LoginPage lop;
	
	@Given("^Initialize the browser with chrome$")
    public void initialize_the_browser_with_chrome() throws Throwable {
		driver = initializeDriver();
    }

  /*  @When("^User enters \"([^\"]*)\" and \"([^\"]*)\" and Logs in$")
    public void user_enters_something_and_something_and_logs_in(String strArg1, String strArg2) throws Throwable {
        
    	lop.getEmail().sendKeys(strArg1);
		lop.getPassword().sendKeys(strArg2);
		lop.getLoginbtn().click();
    }
    */
      
    @When("^User enters (.+) and (.+) and Logs in$")
    public void user_enters_and_and_logs_in(String username, String password) throws Throwable {

    	lop.getEmail().sendKeys(username);
		lop.getPassword().sendKeys(password);
		lop.getLoginbtn().click();

    }

    @Then("^Verify that user is successfully logged in$")
    public void verify_that_user_is_successfully_logged_in() throws Throwable {
        
    	portalHomePage p = new portalHomePage(driver);
    	
    	Assert.assertTrue( p.getSearchBox().isDisplayed());
    }

    @And("^Navigate to \"([^\"]*)\" site$")
    public void navigate_to_something_site(String strArg1) throws Throwable {
    	driver.get(strArg1);
    }

    @And("^Click on login link in home page to land on secure sign in page$")
    public void click_on_login_link_in_home_page_to_land_on_secure_sign_in_page() throws Throwable {
    	LandingPage lp = new LandingPage(driver);
		 lop=lp.getLogin();
		 
    }

	
    @And("^close all browsers$")
    public void close_all_browsers() throws Throwable {
       driver.quit();
    }

	
	
	
}