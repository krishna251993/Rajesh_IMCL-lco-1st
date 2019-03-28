package mobiotics.lco.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HardwarePage {
	WebDriver driver;
	public HardwarePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(xpath="//h1[@class='pull-leftinput']")
	WebElement stbreplacement;
	
	@FindBy(xpath="//a[text()='STB Replacement']")
	WebElement stbReplacement;
	
	@FindBy(xpath="//input[@placeholder='Enter CAN/STB/SMC']")
	WebElement stbReplacementField;
	
	@FindBy(id="check")
	WebElement check;
	
	@FindBy(xpath="(//input[@type='radio'])[3]")
	WebElement radioBtn;
	
	@FindBy(id="newstbslno")
	WebElement newStbNo;
	
	@FindBy(xpath="(//button[text()='STB Replacement'])[2]")
	WebElement stbReplacementBtn;
	
	public String getSTBReplacementText() {
		return stbreplacement.getText();
	}
	
	public void clickSTBReplacement() {
		stbReplacement.click();
	}
	
	public void enterSTBNo(String stbNo) {
		stbReplacementField.sendKeys(stbNo);
	}
	
	public void clickCheckButton() {
		check.click();
	}
	
	public void clickRadioBtn() {
		radioBtn.click();
	}
	
	public void EnterNewSTB(String newSTB) {
		newStbNo.sendKeys(newSTB);
	}
	
	public void clickSTBReplacementBtn() {
		stbReplacementBtn.click();
	}
	

}
