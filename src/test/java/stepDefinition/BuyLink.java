package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import elementRepository.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilPackage.DriverFactory;
import utilityClasses.FileUtility;
import utilityClasses.WebDriverUtility;

public class BuyLink {
	WebDriver driver=DriverFactory.getDriver();
	HomePage homePage=new HomePage(driver);
	WebDriverUtility webDriverUtility=new WebDriverUtility();
	FileUtility fileUtility=new FileUtility();
	
	@Given("Browser should be open and url should be navigated")
	public void browser_should_be_open_and_url_should_be_navigate() throws Exception {
		Assert.assertEquals(driver.getCurrentUrl(),fileUtility.getDataFromPropertiesFiles("url"));
	    Reporter.log("Browser is opened",true);
	}
	@When("user should be hover on location and click on BangloreLink")
	public void user_should_be_hover_on_location_and_click_on_banglore_link() throws InterruptedException {
	    webDriverUtility.mouseHover(driver,homePage.getLocationLink());
	    //Thread.sleep(3000);
	    homePage.getBangloreLink().click();
	    Thread.sleep(3000);
	    Reporter.log("User is hover on the location and click on banglore",true);
	}

	@When("user should be able to mouse hover on the Buy Link")
	public void user_should_be_able_to_mouse_hover_on_the_buy_link() throws InterruptedException 
	{
		webDriverUtility.mouseHover(driver, homePage.getBuyLink());
		//Thread.sleep(2000);
		Reporter.log("user is mouse hover on the buy link");
	}

	@Then("The Budget Homes link should be displayed")
	public void the_budget_homes_link_should_be_displayed() {
		
		Assert.assertEquals(driver.findElement(By.partialLinkText("Ready to Move")).getText(), "Ready to Move");
		Reporter.log("Budget Homes is displayed",true);
	}




}
