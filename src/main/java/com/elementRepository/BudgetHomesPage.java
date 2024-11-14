package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BudgetHomesPage {

	public BudgetHomesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//div[@class='filter__component__title selected'])[1]")
	private WebElement budgetButton;

	@FindBy(xpath = "(//select[@class='filter-budget__select'])[2]")
	private WebElement maxDropdown;

	@FindBy(xpath = "//div[text()='5 Lacs - 80 Lacs']")
	private WebElement maxBudget1;

	@FindBy(xpath = "//div[text()='5 Lacs - 1 Crores']")
	private WebElement maxBudget2;

	@FindBy(xpath = "//div[text()='5 Lacs - 2 Crores']")
	private WebElement maxBudget3;

	@FindBy(xpath = "//div[@class='title-ellipsis' and text()='BHK']")
	private WebElement bhkLink;

	@FindBy(xpath = "//label[text()='1 BHK']")
	private WebElement bhk1Button;

	@FindBy(xpath = "(//span[@class='mb-srp__card__sort--icon'])[1]")
	private WebElement likeButton;

	@FindBy(xpath = "//span[@class='mb-header__main__shortlist__cta']")
	private WebElement shortListLink;

	@FindBy(xpath = "//a[@class='shortlist-drop__link']")
	private WebElement viewShortList;

	@FindBy(xpath = "//h2[@class='mb-srp__card--title']")
	private WebElement flatLink;

	@FindBy(xpath = "(//h2[@class='mb-srp__card--title'])[1]")
	private WebElement flatName;

	@FindBy(xpath = "//span[@class='mb-srp__card__developer--name--highlight']")
	private WebElement projectName;

	@FindBy(xpath = "(//a[@class='mb-ldp__dtls__body__list--link'])[2]")
	private WebElement ProjectNameInProjectPage;

	@FindBy(xpath = "//div[text()='Flat +1']")
	private WebElement propertyType;

	@FindBy(xpath = "//label[text()='House/Villa']")
	private WebElement houseOrVillaButton;

	@FindBy(xpath = "(//div[text()='Done'])[4]")
	private WebElement doneButton;

	public WebElement getMaxDropdown() {
		return maxDropdown;
	}

	public WebElement getBudgetButton() {
		return budgetButton;
	}

	public WebElement getMaxBudget1() {
		return maxBudget1;
	}

	public WebElement getMaxBudget2() {
		return maxBudget2;
	}

	public WebElement getMaxBudget3() {
		return maxBudget3;
	}

	public WebElement getBhkLink() {
		return bhkLink;
	}

	public WebElement getBhk1Button() {
		return bhk1Button;
	}

	public WebElement getLikeButton() {
		return likeButton;
	}

	public WebElement getShortListLink() {
		return shortListLink;
	}

	public WebElement getViewShortList() {
		return viewShortList;
	}

	public WebElement getFlatLink() {
		return flatLink;
	}

	public WebElement getFlatName() {
		return flatName;
	}

	public WebElement getProjectName() {
		return projectName;
	}

	public WebElement getProjectNameInProjectPage() {
		return ProjectNameInProjectPage;
	}

	public WebElement getPropertyType() {
		return propertyType;
	}

	public WebElement getHouseOrVillaButton() {
		return houseOrVillaButton;
	}

	public WebElement getDoneButton() {
		return doneButton;
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
