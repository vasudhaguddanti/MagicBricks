package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlatInBanglorePage {
	
	public FlatInBanglorePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='mb-header__main__hamburger']")
	private WebElement menuBarLink;

	public WebElement getMenuBarLink() {
		return menuBarLink;
	}
	
	@FindBy(xpath = "//span[text()='Help']")
	private WebElement helpLink;

	public WebElement getHelpLink() {
		return helpLink;
	}
	
	@FindBy(xpath = "(//span[text()='Sales Enquiry'])[2]")
	private WebElement salesEnquiry;

	public WebElement getSalesEnquiry() {
		return salesEnquiry;
	}
	
}
