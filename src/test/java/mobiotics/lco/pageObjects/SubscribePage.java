package mobiotics.lco.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubscribePage {
	
	WebDriver driver;
	public SubscribePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[text()='Subscribe  ']")
	WebElement subscribeButton;
	
	
	@FindBy(xpath="//a[text()='Add Base Pack']")
	WebElement addBasePack;
	
	@FindBy(xpath="//a[@href='lcoaddindigital' and text()='Add Indigital Pay Bouquet']")
	WebElement AddIndigitalPayButton;
	
	@FindBy(xpath="//a[text()='Add Broadcaster Pay Bouquet']")
	WebElement addBroadCastOption;
	
	@FindBy(xpath="//a[@href='lcoaddalacarte']")
	WebElement al_A_CarteOption;
	
	
	@FindBy(xpath="//a[text()='Plans']")
	WebElement plans;
	
	@FindBy(xpath="//input[@placeholder='Enter CAN/STB/SMC']")//input[@placeholder='Enter CAN/SMC/STB']
	WebElement enterCan;
	
	
	@FindBy(xpath="//a[text()='Credit  ']")
	WebElement credit;
	
	
	@FindBy(xpath="//a[@href='reconnect']")
	WebElement reconnectLink;
	
	@FindBy(xpath="//a[text()='Report  ']")
	WebElement report;
	
	@FindBy(xpath="//a[text()='Hardware ']")
	WebElement hardware;
	
	@FindBy(xpath="//a[text()='Subscriber ']")
	WebElement subscriber;
	
	public void clickSubscribeButton() {
		subscribeButton.click();
	}
	
	public void clickAddBasePack() {
		addBasePack.click();
	}
	
	public void choseAddIndigitalPayOption() {
		AddIndigitalPayButton.click();
	}
	
	public void selectAddBroadCastOption() {
		addBroadCastOption.click();
	}
	
	public void select_Al_A_Carte_Option() {
		al_A_CarteOption.click();
	}
	
	public void selectPlane() {
		plans.click();
	}
	
	
	public void enterCanNumber(String cannum) {
		enterCan.sendKeys(cannum);
	}
	
	public void selectReconnectLink() {
		reconnectLink.click();
	}
	
	public void selectCredit() {
		credit.click();
	}
	
	public void selectReport() {
		report.click();
		
	}
	public void clickHardware() {
		hardware.click();
	}
	
	public void clickSubscriber() {
		subscriber.click();
	}

}
