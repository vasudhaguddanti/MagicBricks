package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BudgetHomesPage {
	
	public BudgetHomesPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//div[@class='filter__component__title selected'])[1]")
	private WebElement budgetButton;

	public WebElement getBudgetButton() {
		return budgetButton;
	}
	
	@FindBy(xpath = "(//select[@class='filter-budget__select'])[2]")
	private WebElement maxDropdown;

	public WebElement getMaxDropdown() {
		return maxDropdown;    
	}
	
	@FindBy(xpath = "//div[text()='5 Lacs - 80 Lacs']")
	private WebElement maxBudget1;
	
	@FindBy(xpath = "//div[text()='5 Lacs - 1 Crores']")
	private WebElement maxBudget2;
	
	@FindBy(xpath = "//div[text()='5 Lacs - 2 Crores']")
	private  WebElement maxBudget3;

	public WebElement getMaxBudget1() {
		return maxBudget1;
	}

	public WebElement getMaxBudget2() {
		return maxBudget2;
	}

	public WebElement getMaxBudget3() {
		return maxBudget3;
	}
	
	@FindBy(xpath = "//div[@class='title-ellipsis' and text()='BHK']")
	private WebElement bhkLink;
	
	@FindBy(xpath = "//label[text()='1 BHK']")
	private WebElement bhk1Button;
	
	@FindBy(xpath = "(//span[@class='mb-srp__card__sort--icon'])[1]")
	private WebElement likeButton;

	public WebElement getBhkLink() {
		return bhkLink;
	}

	public WebElement getBhk1Button() {
		return bhk1Button;
	}

	public WebElement getLikeButton() {
		return likeButton;
	}
	
	@FindBy(xpath = "//span[@class='mb-header__main__shortlist__cta']")
	private WebElement shortListLink;
	
	@FindBy(xpath = "//a[@class='shortlist-drop__link']")
	private WebElement viewShortList;

	public WebElement getShortListLink() {
		return shortListLink;
	}

	public WebElement getViewShortList() {
		return viewShortList;
	}
	
	@FindBy(xpath = "//h2[@class='mb-srp__card--title']")
	private WebElement flatLink;

	public WebElement getFlatLink() {
		return flatLink;
	}
	
	
	
}
