package com.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import com.elementRepository.FlatInBanglorePage;
import com.elementRepository.HelpCenterPage;
import com.elementRepository.HomePage;
import com.elementRepository.SalesEnquiryPage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.FileUtility;
import com.utilityClasses.JavaScriptUtil;
import com.utilityClasses.WebDriverUtility;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ManageCallsAndAlerts {

	WebDriver driver = DriverFactory.getDriver();

	FlatInBanglorePage flatInBanglorePage = new FlatInBanglorePage(driver);
	HelpCenterPage helpCenterPage = new HelpCenterPage(driver);
	WebDriverUtility webDriverUtility = new WebDriverUtility();
	FileUtility fileUtility = new FileUtility();
	SalesEnquiryPage salesEnquiryPage = new SalesEnquiryPage(driver);
	JavaScriptUtil javaScriptUtil = new JavaScriptUtil(driver);
	HomePage homePage = new HomePage(driver);

	@When("user should be click on Flat in Banglore and navigated to the FlatInBanglorePage")
	public void user_should_be_click_on_flat_in_banglore_and_navigated_to_the_flat_in_banglore_page() throws Exception {
		javaScriptUtil.jsClick(homePage.getFlatInBanglore());
		webDriverUtility.switchToTabOnUrl(driver, fileUtility.getDataFromPropertiesFiles("flatInBanglore"));
		Assert.assertTrue(driver.getCurrentUrl().contains(fileUtility.getDataFromPropertiesFiles("flatInBanglore")));
		Reporter.log("Flat in Banglore Page is displayed", true);
		Thread.sleep(3000);
	}

	@When("user should be click on MenuBarIcon")
	public void user_should_be_click_on_menu_bar_icon() {
		javaScriptUtil.jsClick(flatInBanglorePage.getMenuBarLink());
		webDriverUtility.waitForElementPresent(driver, flatInBanglorePage.getHelpLink());
		Reporter.log("User is click on MenuBar Icon", true);
		Assert.assertTrue(flatInBanglorePage.getHelpLink().isDisplayed());
		Reporter.log("Help Link is displayed", true);

	}

	@When("user should be able to click on help link")
	public void user_should_be_able_to_click_on_help_link() {
		flatInBanglorePage.clickElement(flatInBanglorePage.getHelpLink());
		Reporter.log("user is able to click on help link", true);
	}

	@When("user should be clicks on the Help Center link and navigates to the Help Center page")
	public void user_should_be_clicks_on_the_help_center_link_and_navigates_to_the_help_center_page() throws Exception {
		javaScriptUtil.jsClick(flatInBanglorePage.getHelpCenterLink());
		webDriverUtility.switchToTabOnUrl(driver, fileUtility.getDataFromPropertiesFiles("helpCenterUrl"));
		Assert.assertEquals(driver.getCurrentUrl(), fileUtility.getDataFromPropertiesFiles("helpCenterUrl"));
		Reporter.log("user clicks on help center and navigate to the help center page", true);
		helpCenterPage.clickElement(helpCenterPage.getHelpCenterPopUp());

	}

	@When("user should be clicks on the Explore More link")
	public void user_should_be_clicks_on_the_explore_more_link() throws InterruptedException {
		webDriverUtility.waitForElementToBeClickable(driver, helpCenterPage.getExploreMoreLink());
		javaScriptUtil.jsClick(helpCenterPage.getExploreMoreLink());
		Reporter.log("user clicks on the Explore More Link", true);

	}

	@When("user should be clicks on the Manage CallsandAlerts link")
	public void user_should_be_clicks_on_the_manage_callsand_alerts_link() throws Exception {
		javaScriptUtil.jsClick(helpCenterPage.getManageCallsAndAlertsLink());
		Thread.sleep(2000);
		webDriverUtility.switchToTabOnUrl(driver, fileUtility.getDataFromPropertiesFiles("manageCallsAndAlertUrl"));
		Assert.assertEquals(driver.getCurrentUrl(), fileUtility.getDataFromPropertiesFiles("manageCallsAndAlertUrl"));
		Reporter.log("user click on manage calls/Alerts link and navigate to Manage Calls/Alters Page", true);
	}

	@Then("user should be able to click on the questions and view the answers")
	public void user_should_be_able_to_click_on_the_questions_and_view_the_answers() throws InterruptedException {
		javaScriptUtil.jsClick(helpCenterPage.getQuestion1Link());
		Thread.sleep(2000);
		webDriverUtility.waitForElementPresent(driver, helpCenterPage.getManageListLink());
		Reporter.log("user is able to click on qustion and view tha answer", true);
	}

	@When("user should be able click on sales Enquiry and sales Enquiry Page should be displayed")
	public void user_should_be_able_click_on_sales_enquiry_and_sales_enquiry_page_should_be_displayed()
			throws Exception {
		flatInBanglorePage.clickElement(flatInBanglorePage.getSalesEnquiry());
		Thread.sleep(2000);
		Reporter.log("user is able to click on Sales Enquiry", true);
		webDriverUtility.switchToTabOnUrl(driver, fileUtility.getDataFromPropertiesFiles("salesEnquiryPage"));
		Assert.assertEquals(driver.getCurrentUrl(), fileUtility.getDataFromPropertiesFiles("salesEnquiryPage"));
		Reporter.log("Sales Enquiry Page is displayed", true);
	}

	@When("user should be able to click on Terms and Conditions")
	public void user_should_be_able_to_click_on_terms_and_conditions() throws Exception {
		WebElement termsAndConditions = salesEnquiryPage.getTermsAndConditionsLink();
		webDriverUtility.scrollToElementTop(driver, termsAndConditions);
		javaScriptUtil.jsClick(termsAndConditions);
		Thread.sleep(2000);
		Reporter.log("user is able to click on terms and conditions link", true);
	}

	@Then("user should be able to navigate to the terms and conditions page")
	public void user_should_be_able_to_navigate_to_the_terms_and_conditions_page() throws Exception {
		webDriverUtility.switchToTabOnTitle(driver, fileUtility.getDataFromPropertiesFiles("termsAndConditionsPage"));
		Assert.assertEquals(driver.getTitle(), fileUtility.getDataFromPropertiesFiles("termsAndConditionsPage"));
		Reporter.log("user is able to navigate the terms and conditions page", true);
	}

}
