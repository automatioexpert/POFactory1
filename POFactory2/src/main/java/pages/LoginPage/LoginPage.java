package pages.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	// Page Object with Page Object Factory

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "input[name='user-name']")
	private WebElement username;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement loginBtn;

	public WebElement getUsername() {

		return this.username;
	}

	public WebElement getPassword() {

		return this.password;
	}

	public WebElement getLoginBtn() {

		return this.loginBtn;

	}
}
