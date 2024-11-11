package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import elementRepository.BudgetHomesPage;
import elementRepository.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilPackage.DriverFactory;
import utilityClasses.FileUtility;
import utilityClasses.WebDriverUtility;

public class BudgetMaxOption {
	
	WebDriver driver=DriverFactory.getDriver();
	HomePage homePage=new HomePage(driver);
	WebDriverUtility webDriverUtility=new WebDriverUtility();
	FileUtility fileUtility=new FileUtility();
	BudgetHomesPage budgetHomesPage =new BudgetHomesPage(driver);
	public Integer maxBudget;
	
	@When("user should be able to click on BudgetHomes and navigated to the BudgetHomesPage")
	public void user_should_be_able_to_click_on_budget_homes_and_navigated_to_the_budget_homes_page() throws Exception {
	    homePage.getBudgetHomesLink().click();
	    webDriverUtility.switchToTabOnUrl(driver, fileUtility.getDataFromPropertiesFiles("budgethomesurl"));
	    Assert.assertTrue(driver.getCurrentUrl().contains(fileUtility.getDataFromPropertiesFiles("budgethomesurl")));
	    Reporter.log("user is able to click on BudgetHomes and naviagted to the BudgetHomes Page",true);
	}

	@When("user should be able to click on BudgetLink")
	public void user_should_be_able_to_click_on_budget_link() throws InterruptedException {
		
		budgetHomesPage.getBudgetButton().click();
		Reporter.log("User is able to click on BudgetLink",true);
	}

	@When("user should be able to select on the {int} in MaxOptions Dropdown")
	public void user_should_be_able_to_select_on_the_in_max_options_dropdown(Integer maxBudget) throws Exception
	{
		this.maxBudget=maxBudget;
		WebElement dropDown = budgetHomesPage.getMaxDropdown();    
		String text=fileUtility.getDataFromExcel("maxOptions",maxBudget,0);
		webDriverUtility.select(dropDown, text);
		Thread.sleep(2000);
		Reporter.log("user is able to select the "+text+" Option",true);
	}

	@Then("user should be navigate to that relavent Page")
	public void user_should_be_navigate_to_that_relavent_page() {
	    if(maxBudget==1)
	    {
	    	Assert.assertTrue(budgetHomesPage.getMaxBudget1().isDisplayed());
	    }
	    else if(maxBudget==2)
	    {
	    	Assert.assertTrue(budgetHomesPage.getMaxBudget2().isDisplayed());
	    }
	    else
	    {
	    	Assert.assertTrue(budgetHomesPage.getMaxBudget3().isDisplayed());
	    }
	    Reporter.log("User is navigate to the relavent page",true);
	    
	}

}
