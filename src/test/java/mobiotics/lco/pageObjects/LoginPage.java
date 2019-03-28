package mobiotics.lco.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	 WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//input[@name='frcode'])[1]")
	WebElement fr_code;
	
	@FindBy(name="password")
	WebElement password_name;
	
	@FindBy(xpath="//button[text()='Proceed']")
	WebElement proced_Button;
	
	@FindBy(xpath="//div[@class='heading']/h3")
	WebElement LCO_Dashboard;
	
	
	
	public void setFrCode(String frcode) {
		fr_code.sendKeys(frcode);
	}
	
	public void setPassword(String password) {
		password_name.sendKeys(password);
	}
	public void clickproceed() {
		proced_Button.click();
	}
	
	public WebElement getLCO_DashboardText(){
		return LCO_Dashboard;
	}
	
	

}
