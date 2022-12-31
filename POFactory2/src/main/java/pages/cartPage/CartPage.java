package pages.cartPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "div.inventory_item_name")
	private WebElement getItemName;

	@FindBy(css = "div.inventory_item_desc")
	private WebElement getItemDescription;

	@FindBy(id = "checkout")
	private WebElement goToCheckOutPage;

	public WebElement getItemName() {

		return this.getItemName;

	}

	public WebElement getItemDescription() {

		return this.getItemDescription;

	}

	public WebElement goToCheckOutPage() {

		return this.goToCheckOutPage;

	}

}
