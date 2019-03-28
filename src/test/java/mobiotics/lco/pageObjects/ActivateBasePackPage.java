package mobiotics.lco.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivateBasePackPage {
	
	WebDriver driver;
	public ActivateBasePackPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//h1[@class='pull-leftinput']")
	WebElement addBasePackElement;
	
	@FindBy(xpath="//input[@placeholder='Enter CAN/STB/SMC']")//input[@placeholder='Enter CAN/SMC/STB']
	WebElement enterCan;
	
	@FindBy(xpath="(//div[@class='alert alert-danger top-error text-center'])[1]")
	WebElement dengerAlert;
	
	@FindBy(id="subscriberid")
	WebElement goButton;
	
	@FindBy(id="BST0001PP")
	WebElement planeRadioButton;
	
	
	
	@FindBy (id="confirm-subscribe")
	WebElement confirmButton;
	
	@FindBy(id="confirmcart")
	WebElement subscribeButton;
	
	@FindBy(id="failure-number")
	WebElement failedstatus;
	public WebElement getAddBasePackText() {
		return addBasePackElement;
	}
	
	public void enterCanNumber(String cannum) {
		enterCan.sendKeys(cannum);
	}
	
	public WebElement getAlertElement() {
		return dengerAlert;
	}
	
	public void clickGoButton() {
		goButton.click();
	}
	
	public WebElement PlaneRadioButtonstatus() {
		return planeRadioButton;
	}
	
	public void clickConfirmButton() {
		confirmButton.click();
	}
	
	public void clickSubscribeButton() {
		subscribeButton.click();
	}
	
	public int getFailedStatus() {
		String failed_status=failedstatus.getText();
		int failed_Status_Num=Integer.valueOf(failed_status);
		return failed_Status_Num;
}

}