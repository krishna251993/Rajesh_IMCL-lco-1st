package mobiotics.lco.pageObjects;

import javax.swing.text.StyledEditorKit.BoldAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DisconnectPage {
	
	
	WebDriver driver;
	public DisconnectPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//h1[@class='pull-leftinput']")
	WebElement disconnectPageTitle;
	
	@FindBy(xpath="//input[@placeholder='Enter CAN/SMC/STB']")
	WebElement canEnter;
	
	@FindBy(id="subscriberid")
	WebElement goBtn;
	
	@FindBy(xpath="(//button[text()=\"DISCONNECT\"])[1]")
	WebElement disconnectBtn;
	
	@FindBy(xpath="//h4[text()='Failed To Disconnect Plan.']")
	WebElement failed_Status;
	
	public String getDisconnectPageTitle() {
		return disconnectPageTitle.getText();
	}
	
	public void enterCan(String cannum) {
		canEnter.sendKeys(cannum);
	}
	
	public void clicGoBtn() {
		goBtn.click();
	}
	
	public void clickDiconnectBtn() {
		disconnectBtn.click();
	}
	
	
	public boolean failedStatus() {
		return failed_Status.isDisplayed();
		
	}
	
}
