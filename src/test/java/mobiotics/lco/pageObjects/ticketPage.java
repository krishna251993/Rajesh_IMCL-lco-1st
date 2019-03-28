package mobiotics.lco.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ticketPage {
	
	WebDriver driver;
	public ticketPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);

	}
	
	
	
	@FindBy(xpath="//a[text()='Tickets']")
	WebElement tickets;
	
	 @FindBy(xpath="//input[@placeholder='Search By Customer No.']")
	 WebElement canforTicket;
	 
	 @FindBy(xpath="//h1[text()='Tickets']")
	 WebElement ticketPage;
	 
	 public void enterCanForTicket(String canNum) {
			 canforTicket.sendKeys(canNum);
		}
	
	public void clickTicket() {
		tickets.click();
	}
	public String getTicketPagetext() {
		return ticketPage.getText();
	}
	
	
	
}
