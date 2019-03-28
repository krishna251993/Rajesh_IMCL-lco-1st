package mobiotics.lco.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReconnectPage {
	
	
	WebDriver driver;
	 public ReconnectPage(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
		
	}
	 
	 @FindBy(xpath="//input[@placeholder='Enter CAN/SMC/STB']")
	 WebElement enterCan;
	 
	 @FindBy(xpath="//h1[@class=\"pull-leftinput\"]")
	 WebElement reconnectText;
	 
	 @FindBy(id="subscriberid")
	 WebElement goBtn;
	 
	 @FindBy(xpath="(//button[text()='RECONNECT'])[1]")
	 WebElement reconnectBtn;
	 
	 @FindBy(xpath="(//tr[@id='58186907']/td)[1]")
	 WebElement reconnectPack;
	 
	 @FindBy(xpath="//h4[text()='Failed To Reconnect Plan.']")
	 WebElement failedStatus;
	 
	 public void enterCan(String cannum)
	 {
		 enterCan.sendKeys(cannum);
	 }
	 
	 public String getReconnectText() {
		 return reconnectText.getText();
		 
	 }
	 
	 public void clickGoBtn() {
		 goBtn.click();
	 }
	  public void clickReconnectBtn() {
		  reconnectBtn.click();
	  }
	 
	  public String getReconnectPlane() {
		  return reconnectPack.getText();
	  }
	 public boolean getFailedStatus() {
		 return failedStatus.isDisplayed();
	 }
	

}
