package mobiotics.lco.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Add_A_LA_CartePage {
	
	WebDriver driver;
	public Add_A_LA_CartePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//h1[@class='pull-leftinput']")
	WebElement a_La_CartePage_Tittle;
	
	@FindBy(xpath="(//select)[2]")
	WebElement select_2;
	
	@FindBy(id="ALA0239PP")
	WebElement radioButton_2;
	
	
	public String getAdd_A_LA_CartePage_Title() {
		return a_La_CartePage_Tittle.getText();
		
	}
	
	public void selectTerifPlane() {
		Select ssel= new Select(select_2);
		ssel.selectByIndex(1);
		
	}
	
	public WebElement clickradioButton() {
		return radioButton_2;
	}
	
	
	

}
