package com.stepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.elementRepository.HomePage;
import com.elementRepository.SignUpPage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.FileUtility;
import com.utilityClasses.JavaScriptUtil;
import com.utilityClasses.WebDriverUtility;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SignUp {
	
	WebDriver driver = DriverFactory.getDriver();
	WebDriverUtility webDriverUtility = new WebDriverUtility();
	SignUpPage signUpPage = new SignUpPage(driver);
	FileUtility fileUtility=new FileUtility();
	HomePage homePage=new HomePage(driver);
	JavaScriptUtil javaScriptUtil=new JavaScriptUtil(driver);
	
	@When("user should be able to hover on login link")
	public void user_should_be_able_to_hover_on_login_link() throws InterruptedException {
		webDriverUtility.mouseHover(driver, homePage.getLoginLink());
		Thread.sleep(3000);
	}
	
	@When("Click on main sign up link")
	public void click_on_main_sign_up_link() throws Exception {
		javaScriptUtil.jsClick(signUpPage.getSignUpLink());
		webDriverUtility.switchToTabOnTitle(driver, fileUtility.getDataFromPropertiesFiles("loginTitle"));
	    //signUpPage.getMainSignUpLink().click();
		//signUpPage.clickElement(signUpPage.getMainSignUpLink());
		javaScriptUtil.jsClick(signUpPage.getMainSignUpLink());;
	}

	@When("Enter the valid credentials")
	public void enter_the_valid_credentials() throws Exception {
		//signUpPage.getRadioLink().click();
		signUpPage.clickElement(signUpPage.getRadioLink());
		//signUpPage.getNameTextField().sendKeys(fileUtility.getDataFromPropertiesFiles("signUpName"));
		signUpPage.sendKeysToElement(signUpPage.getNameTextField(), fileUtility.getDataFromPropertiesFiles("signUpName"));
		//signUpPage.getEmailTextField().sendKeys(fileUtility.getDataFromPropertiesFiles("signUpEmail"));
		signUpPage.sendKeysToElement(signUpPage.getEmailTextField(), fileUtility.getDataFromPropertiesFiles("signUpEmail"));
		//signUpPage.getPasswordTextField().sendKeys(fileUtility.getDataFromPropertiesFiles("signUpPassword"));
		signUpPage.sendKeysToElement(signUpPage.getPasswordTextField(), fileUtility.getDataFromPropertiesFiles("signUpPassword"));
		//signUpPage.getMobileTextField().sendKeys(fileUtility.getDataFromPropertiesFiles("signUpPhno"));
		signUpPage.sendKeysToElement(signUpPage.getMobileTextField(), fileUtility.getDataFromPropertiesFiles("signUpPhno"));
		//signUpPage.getCheckboxField().click();
		signUpPage.clickElement(signUpPage.getCheckboxField());
		//signUpPage.getCaptchaField().click();
		signUpPage.clickElement(signUpPage.getCaptchaField());
		Thread.sleep(3000);
	}

	@When("Click on sign up button")
	public void click_on_sign_up_button() {
		//signUpPage.getSignUpButton().click();
		signUpPage.clickElement(signUpPage.getSignUpButton());
	}

	@When("Enter the otp that is generated to the mobile number given")
	public void enter_the_otp_that_is_generated_to_the_mobile_number_given() throws InterruptedException {
		Thread.sleep(30000);
	}

	@Then("Click on continue button and user should be signed in")
	public void click_on_continue_button_and_user_should_be_signed_in() {
		//signUpPage.getContinueButton().click();
		signUpPage.clickElement(signUpPage.getContinueButton());
		Assert.assertTrue(homePage.getProfileLink().isDisplayed());
		Reporter.log("user is signed in",true);
	}

}