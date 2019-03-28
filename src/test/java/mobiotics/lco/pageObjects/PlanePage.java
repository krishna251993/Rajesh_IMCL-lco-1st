package mobiotics.lco.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlanePage {
	
	WebDriver driver;
	public PlanePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='disconnect']")
	WebElement disconnect;
	
	@FindBy(xpath="//a[@href='reconnect']")
	WebElement reconnect;
	
	@FindBy(xpath="//a[@href='changebase']")
	WebElement changeBasePack;
	
	
	public void clickDisconnectLink() {
		disconnect.click();
	}
	
	public void clickReconnectLink() {
		reconnect.click();
	}
	
	public void clicChangeBasePackLink() {
		changeBasePack.click();
	}

}
