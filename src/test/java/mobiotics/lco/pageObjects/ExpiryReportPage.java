package mobiotics.lco.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ExpiryReportPage {
	
	WebDriver driver;
	public ExpiryReportPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[text()='Expiry Report']")
	WebElement expiryreport;
	
	@FindBy(xpath="//select[@class='form-control filter']")
	WebElement selectDropDown;
	
	public void clickExpiryReport() {
		expiryreport.click();
		
	}
	
	public void selectDropDown() throws InterruptedException {
		Select ssel= new Select(selectDropDown);
		ssel.selectByIndex(0);
		Thread.sleep(1000);
		ssel.selectByIndex(1);
		Thread.sleep(1000);
		ssel.selectByIndex(2);
	}
	

}
