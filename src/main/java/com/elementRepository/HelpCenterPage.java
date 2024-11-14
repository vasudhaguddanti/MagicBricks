package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HelpCenterPage {

	public HelpCenterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "explore87")
	private WebElement exploreMoreLink;

	@FindBy(linkText = "Manage Calls/ Alerts")
	private WebElement manageCallsAndAlertsLink;

	@FindBy(xpath = "(//div[@class='list-item__list']//li)[1]")
	private WebElement question1Link;

	@FindBy(xpath = "(//div[@class='list-item__list']//li)[2]")
	private WebElement question2Link;

	@FindBy(xpath = "(//div[@class='list-item__list']//li)[3]")
	private WebElement question3Link;

	public WebElement getExploreMoreLink() {
		return exploreMoreLink;
	}

	public WebElement getManageCallsAndAlertsLink() {
		return manageCallsAndAlertsLink;
	}

	public WebElement getQuestion1Link() {
		return question1Link;
	}

	public WebElement getQuestion2Link() {
		return question2Link;
	}

	public WebElement getQuestion3Link() {
		return question3Link;
	}

	@FindBy(xpath = "//a[@class='active']")
	private WebElement manageListLink;

	public WebElement getManageListLink() {
		return manageListLink;
	}

	@FindBy(id = "userPersonaPopupCloseAnchor")
	private WebElement helpCenterPopUp;

	public WebElement getHelpCenterPopUp() {
		return helpCenterPopUp;
	}

	// click operation
	public void clickElement(WebElement element) {
		element.click();
	}

	// sendKeys Operation
	public void sendKeysToElement(WebElement element, String keys) {
		element.sendKeys(keys);
	}

}
