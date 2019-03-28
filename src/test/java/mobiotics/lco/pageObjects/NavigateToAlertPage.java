package mobiotics.lco.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigateToAlertPage {
	
	WebDriver driver;
	public NavigateToAlertPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Dashboard ']")
	WebElement dashboard;
	
	@FindBy(xpath="//a[@href='lcoalertmessage.php']")
	WebElement AlertButton;
	
	@FindBy(xpath="//th")
	WebElement alertmsgText;
	
	
	public void clicKOnDashBoard() {
		dashboard.click();
	}
	
	public void clickOnAlertButton() {
		AlertButton.click();
	}
	
	public WebElement getAlertMsgWebElement() {
		return alertmsgText;
	}

}
