package mobiotics.lco.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivationReportPage {
	
	WebDriver driver;
	public ActivationReportPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//a[@href='activations']")
	WebElement activationReport;

	@FindBy(xpath="(//i[@class='glyphicon glyphicon-calendar'])[1]")
	WebElement beforecal;
	
	@FindBy(id="refresh")
	WebElement goBtn;
	
	@FindBy(xpath="(//td[@data-day='4'])[1]")
	WebElement selectDate;
	
	@FindBy(xpath="((//tbody/tr[@class='2587780'])[1]/td)[1]")
	WebElement paymentNo;
	
	@FindBy(xpath="((//tbody/tr[@class='2587780'])[1]/td)[1]")
	WebElement canNo;
	
	@FindBy(xpath="((//tbody/tr[@class='2587780'])[1]/td)[3]")
	WebElement prise;
	
	@FindBy(xpath="((//tbody/tr[@class='2587780'])[1]/td)[4]")
	WebElement planename;
	
	@FindBy(xpath="((//tbody/tr[@class='2587780'])[1]/td)[5]")
	WebElement channel;
	
	@FindBy(xpath="((//tbody/tr[@class='2587780'])[1]/td)[7]")
	WebElement createddate;
	
	@FindBy(xpath="((//tbody/tr[@class='2587780'])[1]/td)[9]")
	WebElement status;
	
	public void clickActivationReport() {
		activationReport.click();
	}
	
	public void clickBeforeCalender() {
		beforecal.click();
	}
	
	
	public void SelectDate() {
		selectDate.click();
	}
	
	public void clickGoBtn() {
		goBtn.click();
	}
	

	public String getActivationStatus() {
	    String paymentNum= paymentNo.getText();
	    String canNum=canNo.getText();
	    String Prise=prise.getText();
	    String PlaneName=planename.getText();
	    String ChannelName=channel.getText();
	    String CreatedDate=createddate.getText();
	    String Status=status.getText();
	    String ActivationStatus=paymentNum+canNum+Prise+PlaneName+ChannelName+CreatedDate+Status;
	    return ActivationStatus;
		
	}
	
	public void getCanNo() {
		
	}
	
	public void getprise() {
		
	}
	
	public void getPlaneName() {
		
	}
	
	public void getChannelName() {
		
	}
	
	public void createdDate() {
		
	}
	
	public void getStatus() {
		
	}

}
