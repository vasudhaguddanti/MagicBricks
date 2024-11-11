package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import elementRepository.BudgetHomesPage;
import elementRepository.ShortListPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilPackage.DriverFactory;
import utilityClasses.FileUtility;
import utilityClasses.WebDriverUtility;

public class BookingFlat {
	WebDriver driver=DriverFactory.getDriver();
	WebDriverUtility webDriverUtility=new WebDriverUtility();
	BudgetHomesPage budgetHomesPage=new BudgetHomesPage(driver);
	FileUtility fileUtility=new FileUtility();
	ShortListPage shortListPage=new ShortListPage(driver);
	String s;
	String s1;
	
	@When("user should be click on the BHK link")
	public void user_should_be_click_on_the_bhk_link() {
	   budgetHomesPage.getBhkLink().click();
	   Reporter.log("user is click on BHK link",true);
	}

	@When("user should be click on the 1BHK link")
	public void user_should_be_click_on_the_1bhk_link() throws InterruptedException {
		budgetHomesPage.getBhk1Button().click();
	    Thread.sleep(5000);
	    Reporter.log("user is click on 1bhk link",true);
	}

	@When("user should be able to click on the like button")
	public void user_should_be_able_to_click_on_the_like_button() throws InterruptedException {
		budgetHomesPage.getLikeButton().click();
		 Thread.sleep(5000);
		 s=driver.findElement(By.xpath("//span[@class='mb-srp__card__developer--name--highlight']")).getText();
		 Reporter.log("user is click on like button",true);
	}

	@When("user should be able to click on the Shortlist button")
	public void user_should_be_able_to_click_on_the_shortlist_button() {
		
	    webDriverUtility.mouseHover(driver, budgetHomesPage.getShortListLink());
	    Reporter.log("user is able to mouse hover on shortlist button",true);
	}

	@When("user should be able to click on the View your Shortlisted Properties link")
	public void user_should_be_able_to_click_on_the_view_your_shortlisted_properties_link() throws Exception {
		budgetHomesPage.getViewShortList().click();
		webDriverUtility.switchToTabOnUrl(driver, fileUtility.getDataFromPropertiesFiles("shortlisturl"));
	    Thread.sleep(3000);
	    Reporter.log("user is click on view your shortlist properties link",true);
	}

	@Then("user should be able see the flat in Shortlist page")
	public void user_should_be_able_see_the_flat_in_shortlist_page() {
	    Assert.assertEquals(s, driver.findElement(By.xpath("//a[@class='mb-srp__card__society--name']")).getText());
	    Reporter.log("user see the flat in shortlist page",true);
	}

	@When("user should be able to click on the wrong button and click on yes")
	public void user_should_be_able_to_click_on_the_wrong_button_and_click_on_yes() throws InterruptedException {
		shortListPage.getWrongOption().click();
		webDriverUtility.switchToAlertAndAccept(driver);
		//shortListPage.getYesButton().click();
		Thread.sleep(3000);
	    Reporter.log("user removed the flat",true);
	}

	@Then("user should be able to remove the flat from the shortlist")
	public void user_should_be_able_to_remove_the_flat_from_the_shortlist() {
	    
	}

	@When("user should be able to click on the flat link")
	public void user_should_be_able_to_click_on_the_flat_link() throws InterruptedException {
	    budgetHomesPage.getFlatLink().click();
	    s1=driver.findElement(By.xpath("//h2[@class='mb-srp__card--title']")).getText();
	    webDriverUtility.switchToTabOnTitle(driver, s1);
	    Thread.sleep(3000);
	    Reporter.log("user is able to click on flat link",true);
	 }

	@Then("user should be able to navigate the details of the flat page")
	public void user_should_be_able_to_navigate_the_details_of_the_flat_page() {
	   Assert.assertTrue(driver.getTitle().contains(s1));
	   Reporter.log("user is able to navigate the deatails of flat page");
	}

}
