package com.stepDefinition;

import org.openqa.selenium.WebDriver;
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

public class DetailsOfFlat {
	WebDriver driver=DriverFactory.getDriver();
	WebDriverUtility webDriverUtility=new WebDriverUtility();
	BudgetHomesPage budgetHomesPage=new BudgetHomesPage(driver);
	FileUtility fileUtility=new FileUtility();
	ShortListPage shortListPage=new ShortListPage(driver);
	JavaScriptUtil javaScriptUtil=new JavaScriptUtil(driver);
	String project;
	
	@When("user should be able to click on the flat link")
	public void user_should_be_able_to_click_on_the_flat_link() throws InterruptedException {
	    //budgetHomesPage.getFlatLink().click();
		budgetHomesPage.clickElement(budgetHomesPage.getFlatLink());
	    project=budgetHomesPage.getFlatName().getText();
	    webDriverUtility.switchToTabOnTitle(driver, project);
	    Thread.sleep(3000);
	    Reporter.log("user is able to click on flat link",true);
	 }
	
	@When("user should be able to remove the HouseOrVilla type in PropertyType")
	public void user_should_be_able_to_remove_the_HouseOrVilla_type_in_PropertyType() throws InterruptedException
	{
		javaScriptUtil.jsClick(budgetHomesPage.getPropertyType());
		//Thread.sleep(2000);
		javaScriptUtil.jsClick(budgetHomesPage.getHouseOrVillaButton());
		//Thread.sleep(2000);
		javaScriptUtil.jsClick(budgetHomesPage.getDoneButton());
		//Thread.sleep(2000);
	}

	@Then("user should be able to navigate the details of the flat page")
	public void user_should_be_able_to_navigate_the_details_of_the_flat_page() {
		Assert.assertTrue(budgetHomesPage.getProjectNameInProjectPage().isDisplayed());
	    Reporter.log("user is able to navigate the deatails of flat page");
	}

}
