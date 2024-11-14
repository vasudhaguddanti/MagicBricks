package com.elementRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[text()='Login'])[1]")
	private WebElement loginLink;

	public WebElement getLoginLink() {
		return loginLink;
	}

	@FindBy(xpath = "(//a[text()='Login'])[2]")
	private WebElement loginButton;

	public WebElement getLoginButton() {
		return loginButton;
	}

	@FindBy(xpath = "(//a[@class='mb-header__main__link js-menu-link'])[1]")
	private WebElement locationLink;

	public WebElement getLocationLink() {
		return locationLink;
	}

	@FindBy(id = "buyheading")
	private WebElement buyLink;

	public WebElement getBuyLink() {
		return buyLink;
	}

	@FindBy(xpath = "//ul[@class='city-drop-link-group']//a[text()='Bangalore']")
	private WebElement bangloreLink;

	public WebElement getBangloreLink() {
		return bangloreLink;
	}

	@FindBy(partialLinkText = "Ready to Move")
	private WebElement readyToMoveLink;

	public WebElement getReadyToMoveLink() {
		return readyToMoveLink;
	}

	@FindBy(xpath = "//a[text()='Flats in Bangalore']")
	private WebElement flatInBanglore;

	public WebElement getFlatInBanglore() {
		return flatInBanglore;
	}

	@FindBy(xpath = "//a[contains(text(),'Budget Homes')]")
	private WebElement budgetHomesLink;

	public WebElement getBudgetHomesLink() {
		return budgetHomesLink;
	}

	@FindBy(xpath = "//a[text()='Premium Homes']")
	private WebElement premiumHomesLink;

	public WebElement getPremiumHomesLink() {
		return premiumHomesLink;
	}

	@FindBy(xpath = "//div[@class='mb-header__main__login js-menu-container loggedin']")
	private WebElement profileLink;

	@FindBy(xpath = "//div[@class='onmodal__cross']")
	private WebElement popUpWrong;

	public WebElement getProfileLink() {
		return profileLink;
	}

	public WebElement getPopUpWrong() {
		return popUpWrong;
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
