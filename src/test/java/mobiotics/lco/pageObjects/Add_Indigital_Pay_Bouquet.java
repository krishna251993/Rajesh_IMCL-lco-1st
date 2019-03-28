package mobiotics.lco.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Add_Indigital_Pay_Bouquet {
	
	WebDriver driver;
	public Add_Indigital_Pay_Bouquet(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	String monthelyTarif1="fDJFMDhl";
	String monthelyTarif2="j3H1Ekly";
	String monthelyTarif3="t8Yw1JbO";
	String monthelyTarif4="WR7TdYRy";
	String monthelyTarif5="fnWNzsp5";
	String monthelyTarif6="rzdVWalC";
	String quaterlyTarif6="rzdVWqlC";
	
	
	
	
	@FindBy(xpath="//input[@placeholder='Enter CAN/STB/SMC']")
	WebElement enterCan;
	
	@FindBy(id="subscriberid")
	WebElement goButton;
	
	@FindBy(xpath="(//select)[5]")
	WebElement selectDropDown_6;
	
	@FindBy(id="INB0002PP")
	WebElement radioButton_6;
	
	@FindBy(xpath="//h1[@class='pull-leftinput']")
	WebElement inDigitalPayPage;
	
	@FindBy(xpath="(//tbody[@id='individual-progress']/tr/td)[1]")
	WebElement CAN_Status;
	
	@FindBy(xpath="(//tbody[@id='individual-progress']/tr//td)[2]")
	WebElement Pack_Name;
	
	@FindBy(xpath="(//tbody[@id='individual-progress']/tr//td)[3]")
	WebElement tarif_PeriodStatus;
	
	@FindBy(xpath="(//tbody[@id='individual-progress']/tr//td)[4]")
	WebElement status;
	
	@FindBy(xpath="(//tbody[@id='individual-progress']/tr//td)[5]")
	WebElement errorCode;
	
	@FindBy(id="channel")
	WebElement channelList;
	
	@FindBy(xpath="(//span[text()='×'])[6]")
	WebElement crossButton;
	
	public void enterCanNumber(String canNum) {
		enterCan.sendKeys(canNum);
	}
	
	public void clickGoButton() {
		goButton.click();
	}
	
	public void selectTarifPlane() {
		Select ssel= new Select(selectDropDown_6);
		ssel.selectByValue(quaterlyTarif6);
	}
	
	public void clickOnRadioButton_6() {
		radioButton_6.click();
	}
	
	public String getpageTitle() {
		return inDigitalPayPage.getText();
	}
	
	public String getSubscription_Can_Status() {
		return CAN_Status.getText();
	}
	
	
	public String getPackName() {
		return Pack_Name.getText();
	}
	
	public String getTarifPeriodName() {
		return tarif_PeriodStatus.getText();
	}
	public String getSubscriptionStatus() {
		return status.getText();
	}

	public String getErrorCode() {
		return errorCode.getText();
	}
	
	public void clickChannelList() {
		channelList.click();
	}
	
	public void clickCrossButton() {
		crossButton.click();
	}
}
