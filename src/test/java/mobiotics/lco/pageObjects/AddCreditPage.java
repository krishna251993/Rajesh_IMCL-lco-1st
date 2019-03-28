package mobiotics.lco.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddCreditPage {
	WebDriver driver;
	public AddCreditPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()=\"Add Credit\"]")
	WebElement addCreditLink;
	
	@FindBy(xpath="//h1[@class='pull-leftinput']")
	WebElement addcredit;
	
	@FindBy(name="amount")
	WebElement amountField;
	
	@FindBy(xpath="(//input[@type='radio'])[1]")
	WebElement dabitCardRadioButton;
	
	@FindBy(xpath="(//button[text()='Pay'])[1]")
	WebElement PayButton;
	
	@FindBy(xpath="//img[@src=\"https://staticgw-stage1.paytm.in/23.3.0/images/web/paytm_logo.png\"]")
	WebElement payTmSymbol;
	
	@FindBy(xpath="//input[@class='dcCardNumber  d text-input large-input cardInput type-tel card-field-selector']")
	WebElement cardNo;
	
	@FindBy(id="dcExpMonth")
	WebElement expiryMonth;
	
	@FindBy(id="dcExpYear")
	WebElement expYear;
	
	@FindBy(id="dcCvvBox")
	WebElement cvv;
	
	@FindBy(id="dcSubmit")
	WebElement payNow;
	
	@FindBy(id="OTP")
	WebElement otp;
	
	@FindBy(name="proceed")
	WebElement submit;
	
	@FindBy(xpath="//h2[text()='Payment Successfull']")
	WebElement paymentStatus;
	
	@FindBy(xpath="//a[text()='View Balance']")
	WebElement viewBalence;
	
	@FindBy(xpath="(//tbody[@id='paymentdata']//td)[1]")
	WebElement paymentId;
	
	@FindBy(xpath="(//tbody[@id='paymentdata']//td)[2]")
	WebElement amount;
	
	@FindBy(xpath="(//tbody[@id='paymentdata']//td)[3]")
	WebElement transectionID;
	
	@FindBy(xpath="(//tbody[@id='paymentdata']//td)[4]")
	WebElement paymentGateWay;
	
	@FindBy(xpath="(//tbody[@id='paymentdata']//td)[5]")
	WebElement purpose;
	
	@FindBy(xpath="(//tbody[@id='paymentdata']//td)[6]")
	WebElement datetime;
	
	@FindBy(xpath="(//tbody[@id='paymentdata']//td)[7]")
	WebElement status;
	
	public String getTransectionStatus() {
		String paymentID=paymentId.getText();
		String amt=amount.getText();
		String txID=transectionID.getText();
		String paymentGATEWay=paymentGateWay.getText();
		String prps=purpose.getText();
		String dateTime=datetime.getText();
		String Status=status.getText();
		String txtStatus=paymentID+" "+amt+" "+txID+" "+paymentGATEWay+" "+prps+" "+dateTime+" "+Status;
		return txtStatus;
	}
	

	
	public void clickAddCredit() {
		addCreditLink.click();
	}
	
	public String getAddcreditText() {
		return addcredit.getText();
	}
	
	public void enterAmount(String amount) {
		amountField.sendKeys(amount);
	}
	
	public void clickOnDebitCardRadioButton() {
		dabitCardRadioButton.click();
	}
	
	public void clickPayButton() {
		PayButton.click();
	}
	
	public boolean isPaytmSymboolDisplayed() {
		return payTmSymbol.isDisplayed();
	}
	
	public void enterCardNumber(String cardNum) {
		cardNo.sendKeys(cardNum);
	}
	
	public void selectExpiryMonth(String month) {
		expiryMonth.click();
		Select ssel= new Select(expiryMonth);
		ssel.selectByVisibleText(month);
		
	}
	
	public void selectExpYear(String year) {
		expYear.click();
		Select ssel= new Select(expYear);
		ssel.selectByVisibleText(year);
	}
	
	public void enterCVV(String cvvNo) {
		cvv.sendKeys(cvvNo);
	}
	
	public void clickPayNow() {
		payNow.click();
	}
	
	public void enterOTP(String OTP) {
		otp.sendKeys(OTP);
	}

	public String getPaymebtStatus() {
		return paymentStatus.getText();
	}
	
	public void  clicksubmit() {
		submit.click();
	}
	
	public void clickViewBalence() {
		viewBalence.click();
	}
	
	
}
