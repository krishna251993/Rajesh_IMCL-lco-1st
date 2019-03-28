package mobiotics.lco.testCases;



import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;


import mobiotics.lco.pageObjects.NavigateToAlertPage;

public class TC_NavigateToAlertPage_002 extends BaseClass {
	
	
	
	
	@Test(priority=2)
	public void alertPage() throws InterruptedException {
		
		logger.info("");
		logger.info("");
		logger.info("Navigete Alert Page Test Case");
		
		NavigateToAlertPage na= new NavigateToAlertPage(driver);
		na.clicKOnDashBoard();
		logger.info("DashBoard Button Clicked Successfully");
		na.clickOnAlertButton();
		logger.info("Alert button clicked");
		
		Thread.sleep(2000);
		
		String alertMessage=na.getAlertMsgWebElement().getText();
		if(alertMessage.equals("Alert Messages")) {
			Assert.assertTrue(true);
			logger.info("user is in the alert page");
		}
		else {
			logger.info("user is not in the alert page");
			try {
				captureScreen(driver, "alert Page test");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("unable to take the screenshot "+e);
			}
			Assert.assertTrue(false);
		}
		
		
	}
	
	
	
	

}
