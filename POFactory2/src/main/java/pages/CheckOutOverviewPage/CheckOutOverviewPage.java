package pages.CheckOutOverviewPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutOverviewPage {

	public CheckOutOverviewPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath="//div[@class='summary_value_label']")
	private WebElement getPrice;
	
	@FindBy(css = "button#finish")
	private WebElement finishBtn;
	
	public WebElement getPrice() {
		
		return this.getPrice;
	}
	
	
	public WebElement getFinishBtn() {
		
		return this.finishBtn;
	}
	
	
	
	
	
	
	
}
