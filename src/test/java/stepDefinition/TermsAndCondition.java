package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import elementRepository.PremiumHomesPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilPackage.DriverFactory;
import utilityClasses.FileUtility;
import utilityClasses.WebDriverUtility;

public class TermsAndCondition {
	WebDriver driver=DriverFactory.getDriver();
	PremiumHomesPage premiumHomesPage=new PremiumHomesPage(driver);
	WebDriverUtility webDriverUtility=new WebDriverUtility();
	FileUtility fileUtility=new FileUtility();
	
	@When("user should be able to click on terms and conditions link")
	public void user_should_be_able_to_click_on_terms_and_conditions_link() throws InterruptedException {
		WebElement termsAndConditions=premiumHomesPage.getTermsAndConditionsPage();
		webDriverUtility.scrollToElementTop(driver, termsAndConditions);
		Thread.sleep(3000);
		termsAndConditions.click();
		Reporter.log("user is able to click on terms and conditions link",true);
	}

	@Then("user should be able to navigate to the terms and conditions page")
	public void user_should_be_able_to_navigate_to_the_terms_and_conditions_page() throws Exception {
		webDriverUtility.switchToTabOnTitle(driver, fileUtility.getDataFromPropertiesFiles("termsAndConditionsPage"));
		Assert.assertEquals(driver.getTitle(), fileUtility.getDataFromPropertiesFiles("termsAndConditionsPage"));
		Reporter.log("user is able to navigate the terms and conditions page",true);
	}

}
