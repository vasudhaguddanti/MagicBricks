package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShortListPage {
	
	public ShortListPage(WebDriver driver)
	{
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
	

}
