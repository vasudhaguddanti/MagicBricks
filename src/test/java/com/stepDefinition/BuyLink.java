package com.stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.elementRepository.HomePage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.FileUtility;
import com.utilityClasses.JavaScriptUtil;
import com.utilityClasses.WebDriverUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuyLink {
	WebDriver driver = DriverFactory.getDriver();
	HomePage homePage = new HomePage(driver);
	WebDriverUtility webDriverUtility = new WebDriverUtility();
	FileUtility fileUtility = new FileUtility();
	JavaScriptUtil javaScriptUtil = new JavaScriptUtil(driver);

	@Given("Browser should be open and url should be navigated")
	public void browser_should_be_open_and_url_should_be_navigate() throws Exception {
		Assert.assertEquals(driver.getCurrentUrl(), fileUtility.getDataFromPropertiesFiles("url"));
		Reporter.log("Browser is opened", true);
	}

	@When("user should be hover on location and click on BangloreLink")
	public void user_should_be_hover_on_location_and_click_on_banglore_link() throws InterruptedException {
		webDriverUtility.mouseHover(driver, homePage.getLocationLink());
		Thread.sleep(3000);
		javaScriptUtil.jsClick(homePage.getBangloreLink());
		Thread.sleep(3000);
		Reporter.log("User is hover on the location and click on banglore", true);
	}

	@When("user should be able to mouse hover on the Buy Link")
	public void user_should_be_able_to_mouse_hover_on_the_buy_link() throws InterruptedException {
		webDriverUtility.mouseHover(driver, homePage.getBuyLink());
		Thread.sleep(2000);
		Reporter.log("user is mouse hover on the buy link");
	}

	@Then("The Ready to Move link should be displayed")
	public void the_ready_to_move_link_should_be_displayed() throws Exception {

		Assert.assertEquals(homePage.getReadyToMoveLink().getText(),
				fileUtility.getDataFromPropertiesFiles("readytomoveText"));
		Reporter.log("Budget Homes is displayed", true);
	}

}
