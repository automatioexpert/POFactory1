package pages.LoginPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import pages.LoginPage.locators.HomePageLocators;

public class HomePage extends TestBase{

	//Create constructor to initialize the Page Factory elements 
	
	public HomePageLocators home;
	
	
	public HomePage() {
		
		this.home= new HomePageLocators();
		PageFactory.initElements(driver, this.home);
	}
	
	
	
	/**
	@FindBy(css = "div.app_logo")
	private WebElement logo;

	@FindBy(xpath = "(//button[text()='Add to cart'])[1]")
	private WebElement addToCart;

	@FindBy(css = "a.shopping_cart_link")
	private WebElement goToCartPage;

	public WebElement getLogo() {
		return this.logo;
	}
	**/
	

	public WebElement getAddProductToCart() {

		return home.addToCart;

	}

	public WebElement goToCartPage() {

		return home.goToCartPage;
	}

	
	
}
