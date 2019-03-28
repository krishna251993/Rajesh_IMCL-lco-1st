package mobiotics.lco.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangBasePackPage {
	WebDriver driver;
	public  ChangBasePackPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h1[@class='pull-leftinput']")
	WebElement changeBasePackText;
	
	@FindBy(xpath="//input[@placeholder='Enter CAN/SMC/STB']")
	WebElement enterCan;
	
	@FindBy(id="subscriberid")
	WebElement goBtn;
	
	@FindBy(xpath="(//tr[@class='BST0001PP']/td)[1]")
	WebElement changePack;
	
	@FindBy(id="BST0001PP")
	WebElement radioButton;
	
	@FindBy(id="confirm-subscribe")
	WebElement confirmBtn;
	
	@FindBy(id="confirmcart")
	WebElement subscribeBtn;
	
	
	
	public String getChangeBasePackText() {
		return changeBasePackText.getText();
	}
	
	public void enterCanNum(String canNum) {
		enterCan.sendKeys(canNum);
	}
	
	public void clickGoBtn() {
		goBtn.click();
	}
	
	public String getChangePackText() {
		return changePack.getText();
	}
	
	public void selectRadioButton() {
		radioButton.click();
	}
	
	public void clickConfirmBtn() {
		confirmBtn.click();
	}
	
	public void clickSubscribeBtn() {
		subscribeBtn.click();
	}

}
