package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage.HomePage;
import pages.LoginPage.LoginPage;
import pages.cartPage.CartPage;

public class CartPageTest {

	@Test
	public void cartTest() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		LoginPage login = new LoginPage(driver);
		login.getUsername().sendKeys("standard_user");
		login.getPassword().sendKeys("secret_sauce");
		login.getLoginBtn().click();
		System.out.println("Logged in the App successfully");
		Thread.sleep(5000);

		HomePage home = new HomePage();
		//Assert.assertTrue(home.getLogo().isDisplayed());
		home.getAddProductToCart().click();
		home.goToCartPage().click();
		Thread.sleep(10000);
		
		CartPage cart = new CartPage(driver);
		cart.getItemName().getText();
		cart.getItemDescription().getText();
		cart.goToCheckOutPage().click();
		Thread.sleep(10000);
		System.out.println("CheckOut Passed");
		
		
		

		
		
	}

}
