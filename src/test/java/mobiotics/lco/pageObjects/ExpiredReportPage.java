package mobiotics.lco.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ExpiredReportPage {
	
	WebDriver driver;
	public ExpiredReportPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[text()='Expired Report']")
	WebElement expiredReport;
	
	@FindBy(xpath="//select[@name='expiry']")
	WebElement select;
	
	@FindBy(id="download")
	WebElement doenload;
	
	
	
	public void clickEcpiredReport() {
		expiredReport.click();
		
	}

	public void selectDropDown() throws InterruptedException {
		Select ssel= new Select(select);
		ssel.selectByIndex(0);
		Thread.sleep(1000);
		ssel.selectByIndex(1);
		Thread.sleep(1000);
		ssel.selectByIndex(2);
		Thread.sleep(1000);
		
		
	}
	
	public WebElement clickDownload() {
		return doenload;
	}
	
}
