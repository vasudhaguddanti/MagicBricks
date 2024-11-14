package com.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import com.elementRepository.BudgetHomesPage;
import com.elementRepository.ShortListPage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.FileUtility;
import com.utilityClasses.JavaScriptUtil;
import com.utilityClasses.WebDriverUtility;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToShortList {

	WebDriver driver = DriverFactory.getDriver();
	WebDriverUtility webDriverUtility = new WebDriverUtility();
	BudgetHomesPage budgetHomesPage = new BudgetHomesPage(driver);
	FileUtility fileUtility = new FileUtility();
	ShortListPage shortListPage = new ShortListPage(driver);
	JavaScriptUtil javaScriptUtil = new JavaScriptUtil(driver);
	String flatName;

	@When("user should be click on the BHK link")
	public void user_should_be_click_on_the_bhk_link() {
		webDriverUtility.waitForElementPresent(driver, budgetHomesPage.getBhkLink());
		budgetHomesPage.clickElement(budgetHomesPage.getBhkLink());
		Reporter.log("user is click on BHK link", true);
	}

	@When("user should be click on the 1BHK link")
	public void user_should_be_click_on_the_1bhk_link() throws InterruptedException {
		webDriverUtility.waitForElementPresent(driver, budgetHomesPage.getBhk1Button());
		javaScriptUtil.jsClick(budgetHomesPage.getBhk1Button());
		Thread.sleep(5000);
		Reporter.log("user is click on 1bhk link", true);
	}

	@When("user should be able to click on the like button")
	public void user_should_be_able_to_click_on_the_like_button() throws InterruptedException {
		javaScriptUtil.jsClick(budgetHomesPage.getLikeButton());
		Thread.sleep(5000);
		String flatName= budgetHomesPage.getFlatName().getAttribute("title");
		
		Reporter.log("user is click on like button", true);
	 }

	@When("user should be able to click on the Shortlist button")
	public void user_should_be_able_to_click_on_the_shortlist_button() {

		webDriverUtility.mouseHover(driver, budgetHomesPage.getShortListLink());
		Reporter.log("user is able to click on shortlist button", true);
	}

	@When("user should be able to click on the View your Shortlisted Properties link")
	public void user_should_be_able_to_click_on_the_view_your_shortlisted_properties_link() throws Exception {
		javaScriptUtil.jsClick(budgetHomesPage.getViewShortList());
		webDriverUtility.switchToTabOnUrl(driver, fileUtility.getDataFromPropertiesFiles("shortlisturl"));
		Thread.sleep(3000);
		Reporter.log("user is click on view your shortlist properties link", true);
	}

	@Then("user should be able see the flat in Shortlist page")
	public void user_should_be_able_see_the_flat_in_shortlist_page() {
		Assert.assertTrue(budgetHomesPage.getFlatName().isDisplayed());
		Reporter.log("user is able to see the flat in shortlist page", true);
	}

}
