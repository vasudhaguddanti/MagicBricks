package com.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.elementRepository.HomePage;
import com.elementRepository.PremiumHomesPage;
import com.elementRepository.SbiHomeLoanEmiCalculatorPage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.FileUtility;
import com.utilityClasses.JavaScriptUtil;
import com.utilityClasses.WebDriverUtility;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmiCalculator {
	WebDriver driver=DriverFactory.getDriver();
	HomePage homePage=new HomePage(driver);
	WebDriverUtility webDriverUtility=new WebDriverUtility();
	PremiumHomesPage premiumHomesPage=new PremiumHomesPage(driver);
	FileUtility fileUtility=new FileUtility();
	JavaScriptUtil javaScriptUtil=new JavaScriptUtil(driver);
	SbiHomeLoanEmiCalculatorPage sbiHomeLoanEmiCalculatorPage=new SbiHomeLoanEmiCalculatorPage(driver);
	
	@When("user should be able to click on Premium Homes Link and navigate to the premium homes Page")
	public void user_should_be_able_to_click_on_premium_homes_link_and_navigate_to_the_premium_homes_page() throws Exception {
	    //homePage.getPremiumHomesLink().click();
		homePage.clickElement(homePage.getPremiumHomesLink());
	    webDriverUtility.switchToTabOnTitle(driver, fileUtility.getDataFromPropertiesFiles("premiumHomesTitle"));
	    Assert.assertEquals(driver.getTitle(), fileUtility.getDataFromPropertiesFiles("premiumHomesTitle"));
	    Reporter.log("User is able to navigte the Premium Homes Page",true);
	}

	@When("user should be able to mouse hover on HomeLoans Link")
	public void user_should_be_able_to_mouse_hover_on_home_loans_link() {
	    webDriverUtility.mouseHover(driver, premiumHomesPage.getHomeLoanLink());
	    Reporter.log("user is able to mouse hover on HomeLoans Link",true);
	}

	@When("user should be able to click on the SBIHomeLoanEMICalculator Link and navigate to the SBIHomeLoanEMICalculator Page")
	public void user_should_be_able_to_click_on_the_sbi_home_loan_emi_calculator_link_and_navigate_to_the_sbi_home_loan_emi_calculator_page() throws Exception {
		javaScriptUtil.jsClick(premiumHomesPage.getSBIHomeLoanEmiCalculator());
		webDriverUtility.switchToTabOnUrl(driver, fileUtility.getDataFromPropertiesFiles("sbiHomeLoanEmiCalculatorUrl"));
		Assert.assertEquals(driver.getCurrentUrl(), fileUtility.getDataFromPropertiesFiles("sbiHomeLoanEmiCalculatorUrl"));
		Reporter.log("user is click on the SBIHomeLoanEMICalculator Link and navigate to the SBIHomeLoanEMICalculator Page",true);
	}

	@When("user should be able to change the LoanTenure Years")
	public void user_should_be_able_to_change_the_loan_tenure_years() {
		//sbiHomeLoanEmiCalculatorPage.getLoanTenureLink().click();
		sbiHomeLoanEmiCalculatorPage.clickElement(sbiHomeLoanEmiCalculatorPage.getLoanTenureLink());
		//sbiHomeLoanEmiCalculatorPage.getTenYears().click();
		sbiHomeLoanEmiCalculatorPage.clickElement(sbiHomeLoanEmiCalculatorPage.getTenYears());
		Reporter.log("user is able to change the LoanTenure Years",true);
	}

	@Then("user should be click on RecalculateYourEMI button and calculate EMI amount")
	public void user_should_be_click_on_recalculate_your_emi_button_and_calculate_emi_amount() throws InterruptedException {
		//sbiHomeLoanEmiCalculatorPage.getRecalculatorYourEmiButton().click();
		sbiHomeLoanEmiCalculatorPage.clickElement(sbiHomeLoanEmiCalculatorPage.getRecalculatorYourEmiButton());
		Thread.sleep(3000);
		Assert.assertTrue(sbiHomeLoanEmiCalculatorPage.getEmiAmount().isDisplayed());
		Reporter.log("user is click on RecalculateYourEMI button and EMI amount is displayed",true);
	    
	}




}
