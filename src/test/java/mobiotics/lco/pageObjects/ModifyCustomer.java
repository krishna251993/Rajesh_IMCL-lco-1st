package mobiotics.lco.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModifyCustomer {
	
	WebDriver driver;
	public ModifyCustomer(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h1[@class='pull-leftinput']")
	WebElement modifyCusttext;

	@FindBy(xpath="//a[text()='Modify Customer']")
	WebElement modifycustomer;
	
	@FindBy(id="customerno")
	WebElement canNo;
	
	@FindBy(id="check")
	WebElement checkBtn;
	
	public void clicmodifyCustomer() {
		modifycustomer.click();
	}
	
	public void enterCanForModify(String can)
	{
		canNo.sendKeys(can);
	}
	public void clickCheckBtn() {
		checkBtn.click();
	}
	
	public String getmodifyCustomerText() {
		return modifyCusttext.getText();
	}
	
	
}
