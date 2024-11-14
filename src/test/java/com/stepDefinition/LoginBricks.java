package com.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.elementRepository.HomePage;
import com.elementRepository.LoginPage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.FileUtility;
import com.utilityClasses.WebDriverUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginBricks {

	WebDriver driver = DriverFactory.getDriver();
	HomePage homePage = new HomePage(driver);
	WebDriverUtility webDriverUtility = new WebDriverUtility();
	FileUtility fileUtility = new FileUtility();
	LoginPage loginPage = new LoginPage(driver);

	@Given("user should be able to logged in")
	public void user_should_be_able_to_logged_in() throws Exception {
		webDriverUtility.mouseHover(driver, homePage.getLoginLink());
		Thread.sleep(3000);
		// homePage.getLoginButton().click();
		homePage.clickElement(homePage.getLoginButton());
		Thread.sleep(3000);
		webDriverUtility.switchToTabOnTitle(driver, fileUtility.getDataFromPropertiesFiles("loginTitle"));
		Thread.sleep(3000);
		// loginPage.getEmailOrPhoneTextFeild().sendKeys(fileUtility.getDataFromPropertiesFiles("phno"));
		loginPage.sendKeysToElement(loginPage.getEmailOrPhoneTextFeild(),
				fileUtility.getDataFromPropertiesFiles("phno"));
		Thread.sleep(7000);
		// loginPage.getNextButton().click();
		loginPage.clickElement(loginPage.getNextButton());
		Thread.sleep(40000);
		// loginPage.getContinueButton().click();
		loginPage.clickElement(loginPage.getContinueButton());
		// homePage.getPopUpWrong().click();
		homePage.clickElement(homePage.getPopUpWrong());
		Assert.assertTrue(homePage.getProfileLink().isDisplayed());
		Reporter.log("User is logged in", true);
	}

//	@When("user should be able to hover on login link")
//	public void user_should_be_able_to_hover_on_login_link() throws InterruptedException {
//		webDriverUtility.mouseHover(driver, homePage.getLoginLink());
//		Thread.sleep(3000);
//	}
//
//	@When("user should be able to click on login button and navigate to the login page")
//	public void user_should_be_able_to_click_on_login_button_and_navigate_to_the_login_page() throws Exception {
//		homePage.getLoginButton().click();
//		Thread.sleep(3000);
//		webDriverUtility.switchToTabOnTitle(driver, fileUtility.getDataFromPropertiesFiles("loginTitle"));
//		Thread.sleep(3000);
//	}
//
//	@When("user should be able to enter valid credentails and click on next button")
//	public void user_should_be_able_to_enter_valid_credentails_and_click_on_next_button() throws Exception {
//	    loginPage.getEmailOrPhoneTextFeild().sendKeys(fileUtility.getDataFromPropertiesFiles("phno"));
//	    Thread.sleep(7000);
//	    loginPage.getNextButton().click();
//	    Thread.sleep(10000);
//	}
//
//	@When("user should be able to click on continue")
//	public void user_should_be_able_to_click_on_continue() throws InterruptedException {
//	   loginPage.getContinueButton().click();
//	   driver.findElement(By.xpath("//div[@class='onmodal__cross']")).click();
//	}
//
//	@Then("user should be logged in")
//	public void user_should_be_logged_in() {
//		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='mb-header__main__login js-menu-container loggedin']")).isDisplayed());
//	    Reporter.log("User is logged in",true);
//	}
}
