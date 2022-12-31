 package pages.LoginPage.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {


	@FindBy(css = "div.app_logo")
	public WebElement logo;

	@FindBy(xpath = "(//button[text()='Add to cart'])[1]")
	public WebElement addToCart;

	@FindBy(css = "a.shopping_cart_link")
	public WebElement goToCartPage;
	
	
	 
	
}
