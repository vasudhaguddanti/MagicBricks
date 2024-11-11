package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import elementRepository.HomePage;
import elementRepository.FlatInBanglorePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilPackage.DriverFactory;
import utilityClasses.FileUtility;
import utilityClasses.WebDriverUtility;

public class MenuBarIcon {
	
	
	WebDriver driver=DriverFactory.getDriver();
	WebDriverUtility webDriverUtility=new WebDriverUtility();
	HomePage homePage=new HomePage(driver);
	FileUtility fileUtility=new FileUtility();
	FlatInBanglorePage flatInBanglorePage=new FlatInBanglorePage(driver);
	
	@When("user should be click on Flat in Banglore and navigated to the FlatInBanglorePage")
	public void user_should_be_click_on_budget_homes_and_navigated_to_the_Flat_In_Banglore_page() throws Exception {
	    homePage.getFlatInBanglore().click();
	    
	    webDriverUtility.switchToTabOnUrl(driver, fileUtility.getDataFromPropertiesFiles("flatInBanglore"));
	    Assert.assertTrue(driver.getCurrentUrl().contains(fileUtility.getDataFromPropertiesFiles("flatInBanglore")));
	    
	    Reporter.log("Ready to Move Page is displayed",true);

	}


	@When("user should be click on MenuBarIcon")
	public void user_should_be_click_on_menu_bar_icon() throws InterruptedException {
		flatInBanglorePage.getMenuBarLink().click();
		webDriverUtility.waitForElementPresent(driver, flatInBanglorePage.getHelpLink());
		Reporter.log("User is click on MenuBar Icon",true);
		Assert.assertTrue(flatInBanglorePage.getHelpLink().isDisplayed());
		Reporter.log("MenuBar is displayed",true);
	}
	
	@When("user should be able to click on help link")
	public void user_should_be_able_to_click_on_help_link() {
	    flatInBanglorePage.getHelpLink().click();
	}

	@When("user should be able click on sales Enquiry")
	public void user_should_be_able_click_on_sales_enquiry() throws InterruptedException {
		flatInBanglorePage.getSalesEnquiry().click();
		Thread.sleep(2000);
	}

	@Then("sales Enquiry Page should be displayed")
	public void sales_enquiry_page_should_be_displayed() throws Exception {
		webDriverUtility.switchToTabOnUrl(driver, fileUtility.getDataFromPropertiesFiles("salesEnquiryPage"));
	    Assert.assertEquals(driver.getCurrentUrl(), fileUtility.getDataFromPropertiesFiles("salesEnquiryPage"));
	    Reporter.log("Sales Enquiry Page is displayed",true);
	}




}
