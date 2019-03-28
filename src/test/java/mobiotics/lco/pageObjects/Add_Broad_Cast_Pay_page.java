package mobiotics.lco.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Add_Broad_Cast_Pay_page {
	
	WebDriver driver;
	
	public Add_Broad_Cast_Pay_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//select)[1]")
	WebElement selectOp_1;
	
	@FindBy(id="BQ00015PP")
	WebElement radioButton;
	
	@FindBy(id="bulkmodalsubscribe")
	WebElement bulkActive;
	
	@FindBy(xpath="//a[@href='bulkactivatetemplatedownload.php?sample=1']")
	WebElement download;
	
	@FindBy(xpath="//input[@type='file']")
	WebElement uploadFile;
	
	@FindBy(id="upload")
	WebElement upload;
	
	@FindBy(xpath="//button[text()='Activate']")
	WebElement activateButton;
	
	@FindBy(id="add-basepack-close")
	WebElement closeBtn;
	
	@FindBy(id="channel")
	WebElement channelList;
	
	
	public void selectTarifPeriod() {
		Select ssel= new Select(selectOp_1);
		
		ssel.selectByVisibleText("Monthly");
		
			
	}
	
	public WebElement clickOnRadioButton() {
		return radioButton;
		
	}
	
	public void clickBulkActive() {
		bulkActive.click();
	}
	public void clickDownload() {
		download.click();
	}
	
	public void enterFile(String filePath) {
		uploadFile.sendKeys(filePath);
	}
	
	public void clickUpload() {
		upload.click();
	}
	
	public void clickActivateButton() {
		activateButton.click();
	}
	
	public void clickcloseBtn() {
		closeBtn.click();
		
		
	}
	
	public void clickChannelList() {
		channelList.click();
	}
	
	
}
