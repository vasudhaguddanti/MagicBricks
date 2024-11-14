//package com.stepDefinition;
//
//import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
//import org.testng.Reporter;
//
//import com.elementRepository.BudgetHomesPage;
//import com.elementRepository.ShortListPage;
//import com.utilPackage.DriverFactory;
//import com.utilityClasses.FileUtility;
//import com.utilityClasses.JavaScriptUtil;
//import com.utilityClasses.WebDriverUtility;
//
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class BookingFlat {
//	WebDriver driver=DriverFactory.getDriver();
//	WebDriverUtility webDriverUtility=new WebDriverUtility();
//	BudgetHomesPage budgetHomesPage=new BudgetHomesPage(driver);
//	FileUtility fileUtility=new FileUtility();
//	ShortListPage shortListPage=new ShortListPage(driver);
//	JavaScriptUtil javaScriptUtil=new JavaScriptUtil(driver);
//	String flatName;
//	String project;
//	
//	@When("user should be click on the BHK link")
//	public void user_should_be_click_on_the_bhk_link() {
//	   webDriverUtility.waitForElementPresent(driver, budgetHomesPage.getBhkLink());
//	   budgetHomesPage.getBhkLink().click();
//	   Reporter.log("user is click on BHK link",true);
//	}
//
//	@When("user should be click on the 1BHK link")
//	public void user_should_be_click_on_the_1bhk_link() throws InterruptedException {
//		webDriverUtility.waitForElementPresent(driver, budgetHomesPage.getBhk1Button());
//		javaScriptUtil.jsClick(budgetHomesPage.getBhk1Button());
//	    Thread.sleep(5000);
//	    Reporter.log("user is click on 1bhk link",true);
//	}
//
//	@When("user should be able to click on the like button")
//	public void user_should_be_able_to_click_on_the_like_button() throws InterruptedException {
//		 budgetHomesPage.getLikeButton().click();
//		 Thread.sleep(5000);
//		 flatName=budgetHomesPage.getFlatName().getText();
//		 Reporter.log("user is click on like button",true);
//	}
//
//	@When("user should be able to click on the Shortlist button")
//	public void user_should_be_able_to_click_on_the_shortlist_button() {
//		
//	    webDriverUtility.mouseHover(driver, budgetHomesPage.getShortListLink());
//	    Reporter.log("user is able to mouse hover on shortlist button",true);
//	}
//
//	@When("user should be able to click on the View your Shortlisted Properties link")
//	public void user_should_be_able_to_click_on_the_view_your_shortlisted_properties_link() throws Exception {
//		budgetHomesPage.getViewShortList().click();
//		webDriverUtility.switchToTabOnUrl(driver, fileUtility.getDataFromPropertiesFiles("shortlisturl"));
//	    Thread.sleep(3000);
//	    Reporter.log("user is click on view your shortlist properties link",true);
//	}
//
//	@Then("user should be able see the flat in Shortlist page")
//	public void user_should_be_able_see_the_flat_in_shortlist_page() {
//		Assert.assertEquals(flatName, shortListPage.getFlatNameInShortList().getText());
//	    Reporter.log("user see the flat in shortlist page",true);
//	}
//
//	@When("user should be able to click on the wrong button and click on yes")
//	public void user_should_be_able_to_click_on_the_wrong_button_and_click_on_yes() throws InterruptedException {
//		shortListPage.getWrongOption().click();
//		shortListPage.getYesButton().click();
//		Thread.sleep(3000);
//	    Reporter.log("user removed the flat",true);
//	}
//
//	@Then("user should be able to remove the flat from the shortlist")
//	public void user_should_be_able_to_remove_the_flat_from_the_shortlist() {
//		Assert.assertTrue(shortListPage.getRemoveText().isDisplayed());
//		Reporter.log("user is able to remove the flat from the  shortlist",true);
//	    
//	}
//
//	@When("user should be able to click on the flat link")
//	public void user_should_be_able_to_click_on_the_flat_link() throws InterruptedException {
//	    budgetHomesPage.getFlatLink().click();
//	    project=budgetHomesPage.getFlatName().getText();
//	    webDriverUtility.switchToTabOnTitle(driver, project);
//	    Thread.sleep(3000);
//	    Reporter.log("user is able to click on flat link",true);
//	 }
//
//	@Then("user should be able to navigate the details of the flat page")
//	public void user_should_be_able_to_navigate_the_details_of_the_flat_page() {
//		//Assert.assertEquals(project, budgetHomesPage.getProjectNameInProjectPage().getText());
//		Assert.assertTrue(budgetHomesPage.getProjectNameInProjectPage().isDisplayed());
//	    Reporter.log("user is able to navigate the deatails of flat page");
//	}
//
//}
