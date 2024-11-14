package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShortListPage {

	public ShortListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@class='mb-srp__list-shortlist__close']")
	private WebElement wrongOption;

	@FindBy(xpath = "//span[@class='mb-srp__list-shortlist__close']")
	private WebElement yesButton;

	public WebElement getWrongOption() {
		return wrongOption;
	}

	public WebElement getYesButton() {
		return yesButton;
	}

	@FindBy(xpath = "//div[@class='mb-srp__noshortlist__heading']")
	private WebElement removeText;

	public WebElement getRemoveText() {
		return removeText;
	}

	@FindBy(xpath = "//a[@class='mb-srp__card__society--name']")
	private WebElement flatNameInShortList;

	public WebElement getFlatNameInShortList() {
		return flatNameInShortList;
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
