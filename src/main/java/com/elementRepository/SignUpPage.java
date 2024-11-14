package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	public SignUpPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='mb-header__main__login js-menu-container']/a[text()='Login']")
	private WebElement loginLink;

	@FindBy(xpath = "//a[text()='Sign Up']")
	private WebElement signUpLink;

	@FindBy(css = "div.signup__text a.signup__link")
	private WebElement mainSignUpLink;

	@FindBy(xpath = "//label[contains(text(),'Buyer/Owner/Tenant')]")
	private WebElement radioLink;

	@FindBy(id = "regName")
	private WebElement nameTextField;

	@FindBy(id = "regEmailid")
	private WebElement emailTextField;

	@FindBy(id = "regPassword")
	private WebElement passwordTextField;

	@FindBy(id = "regMobile")
	private WebElement mobileTextField;

	@FindBy(id = "chk-TNC")
	private WebElement checkboxField;

	@FindBy(id = "captchaCodeRegistration")
	private WebElement captchaField;

	@FindBy(xpath = "//button[contains(text(),'Sign Up')]")
	private WebElement signUpButton;

	@FindBy(xpath = "//button[@onclick='verifyOtp()']")
	private WebElement continueButton;

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getSignUpLink() {
		return signUpLink;
	}

	public WebElement getMainSignUpLink() {
		return mainSignUpLink;
	}

	public WebElement getRadioLink() {
		return radioLink;
	}

	public WebElement getNameTextField() {
		return nameTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getMobileTextField() {
		return mobileTextField;
	}

	public WebElement getCheckboxField() {
		return checkboxField;
	}

	public WebElement getCaptchaField() {
		return captchaField;
	}

	public WebElement getSignUpButton() {
		return signUpButton;
	}

	public WebElement getContinueButton() {
		return continueButton;
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
