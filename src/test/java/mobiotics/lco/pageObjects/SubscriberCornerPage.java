package mobiotics.lco.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubscriberCornerPage {
	
	WebDriver driver;
	public SubscriberCornerPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Subscriber Corner']")
	WebElement subscriberCorner;
	
	@FindBy(xpath="//input[@placeholder='Enter CAN/SMC/STB']")
	WebElement enterCan;
	
	@FindBy(id="subscriberid")
	WebElement goBtn;
	
	@FindBy(xpath="(((//tbody)[2]/tr)[1]/td)[1]")
	WebElement planecode;
	
	public void clickSubscriberCorner() {
		subscriberCorner.click();
	}
	
	public void enterCan(String canNum) {
		enterCan.sendKeys(canNum);
	}
	
	public void clickGoBtn() {
		goBtn.click();
	}
	
	public String getPlaneCode() {
		return planecode.getText();
	}
	

}
