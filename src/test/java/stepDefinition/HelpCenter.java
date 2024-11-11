package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import elementRepository.HomePage;
import elementRepository.PremiumHomesPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilPackage.DriverFactory;
import utilityClasses.WebDriverUtility;

public class HelpCenter {
	WebDriver driver=DriverFactory.getDriver();
	HomePage homePage=new HomePage(driver);
	WebDriverUtility webDriverUtility=new WebDriverUtility();
	PremiumHomesPage premiumHomesPage=new PremiumHomesPage(driver);
	
	@When("user should be able to click on Premium Homes Link and navigate to the premium homes Page")
	public void user_should_be_able_to_click_on_premium_homes_link_and_navigate_to_the_premium_homes_page() {
	    homePage.getPremiumHomesLink().click();
	    webDriverUtility.switchToTabOnTitle(driver, "Luxury Property in Bangalore | Luxury Real Estate in Bangalore - MagicBricks");
	    Assert.assertEquals(driver.getTitle(), "Luxury Property in Bangalore | Luxury Real Estate in Bangalore - MagicBricks");
	    Reporter.log("User is able tp navigte the Premium Homes Page",true);
	}

	@When("user should be able to hover on Help Link in Premium Homes Page")
	public void user_should_be_able_to_hover_on_help_link_in_premium_homes_page() {
		webDriverUtility.mouseHover(driver, premiumHomesPage.getHelpLink());
	}

	@When("user should be able to click on Help Center")
	public void user_should_be_able_to_click_on_help_center() {
	    premiumHomesPage.getHelpCenterLink().click();
	}

	@Then("User should be able to navigate to the Help Center page")
	public void user_should_be_able_to_navigate_to_the_help_center_page() {
	    webDriverUtility.switchToTabOnUrl(driver, "https://www.magicbricks.com/help/");
	    Assert.assertEquals(driver.getCurrentUrl(), "https://www.magicbricks.com/help/");
	    Reporter.log("User is navigate to the help center page",true);
	}



}
