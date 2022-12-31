package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage.LoginPage;

public class LoginTest {

	@Test
	public void loginTest() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		LoginPage login = new LoginPage(driver);
		login.getUsername().sendKeys("standard_user");
		login.getPassword().sendKeys("secret_sauce");
		login.getLoginBtn().click();
		System.out.println("Logged in the App successfully");
		Thread.sleep(1200);
		driver.close();
		System.out.println("Thank You Vishwakarma Bhagwan!!!!");

	}
}
