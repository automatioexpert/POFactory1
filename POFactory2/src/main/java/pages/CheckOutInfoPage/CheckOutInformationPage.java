package pages.CheckOutInfoPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutInformationPage {

	public CheckOutInformationPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	
	// Locators

	@FindBy(name = "firstName")
	private WebElement getFirstName;

	@FindBy(name = "lastName")
	private WebElement getLastName;

	@FindBy(name = "postalCode")
	private WebElement getPostalCode;

	@FindBy(css = "input#continue")
	private WebElement continueButton;

	public WebElement getFirstName() {
		return this.getFirstName;

	}

	public WebElement getLastName() {

		return this.getLastName;

	}

	public WebElement getPostalCode() {

		return this.getPostalCode;
	}

	public WebElement getContinue() {
		
		return continueButton;

	}
}
