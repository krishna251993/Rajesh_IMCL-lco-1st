package mobiotics.lco.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RenewPage {
	WebDriver driver;
	
	public RenewPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//a[text()='Renew  ']")
	WebElement renewOption;
	
	@FindBy(xpath="//h1[@class='pull-leftinput']")
	WebElement RenewPageText;
	
	@FindBy(xpath="//a[text()='Renew Plans']")
	WebElement renewPlane;
	
	@FindBy(xpath="//h1[@class='pull-leftinput']")
	WebElement renewSubscription;
	
	@FindBy(xpath="//button[@class='btn btn-info' and text()='Close']")
	WebElement closeButton;
	
	@FindBy(xpath="//input[@placeholder='Enter CAN/SMC/STB']")
	WebElement canenter;
	
	@FindBy(xpath="//button[@class='btn btn-info']")
	WebElement errorPopUp;
	
	@FindBy(id="confirmcart")
	WebElement subscribeButton;
	
	@FindBy(id="bulkmodalsubscribe")
	WebElement bulkRenew;
	
	@FindBy(xpath="//a[@href='bulkactivatetemplatedownload.php?sample=1']")
	WebElement download;
	
	@FindBy(xpath="//input[@type='file']")
	WebElement planeupload;
	
	@FindBy(id="upload")
	WebElement upload;
	
	@FindBy(xpath="//button[text()='Renew']")
	WebElement Renew;
	
	@FindBy(id="renew-close")
	WebElement renewClose;
	
	public void selectRenewOption() {
		renewOption.click();
	}
	public void selectRenewPlane() {
		renewPlane.click();
	}
	public void getRenewSubscriptionText() {
		renewSubscription.getText();
	}
	public WebElement closeButton() {
		return closeButton;
	}
	
	public String getRenewPageText() {
		return RenewPageText.getText();
	}
	
	public void entercan(String canNum) {
		canenter.sendKeys(canNum);
	}
	
	public WebElement errorPopUp() {
		return errorPopUp;
	}
	
	public void clicBulkRenew() {
		bulkRenew.click();
	}
	
	public void clickSubscribeButton() {
		subscribeButton.click();
	}
	
	public void clickDownload() {
		download.click();
	}
	
	public void uploadPlane(String filePath) {
		planeupload.sendKeys(filePath);
	}
	
	public void clickUploadButton() {
		upload.click();
	}
	public void clickOnRenewButton() {
		Renew.click();
	}
	
	public void clickRenewClose() {
		renewClose.click();
	}

}
