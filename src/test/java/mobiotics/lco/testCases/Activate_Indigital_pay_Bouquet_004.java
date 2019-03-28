package mobiotics.lco.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import mobiotics.lco.utilities.EnterCanDetails;

public class Activate_Indigital_pay_Bouquet_004 extends BaseClass {
	
	@Test(priority=4)
	public void Activate_Indigital_Plane() throws IOException, InterruptedException {
		
		logger.info("");
		logger.info("");
		
		logger.info("This is active in digital OPlane Bouquet");
		
		
		sp.clickSubscribeButton();
		sp.choseAddIndigitalPayOption();
		
		
		
		
		String pageTitle=addindigi.getpageTitle();
		System.out.println(pageTitle);
		if(pageTitle.equals("Activate Indigital Pay Bouquet")) {
			Assert.assertTrue(true);
			logger.info("user is in add digital pay Bouquet");
			
			
			EnterCanDetails enterCanDetails=new EnterCanDetails(addindigi, activateBasePack, driver,logger);
			enterCanDetails.enterCanDetails();
			Thread.sleep(1000);
			addindigi.selectTarifPlane();
			Thread.sleep(1000);
			addindigi.clickOnRadioButton_6();
			
			addindigi.clickChannelList();
			captureScreen(driver, "Add in digital channel list of plane code INB0002PP");
			
			addindigi.clickCrossButton();
			activateBasePack.clickConfirmButton();
			
			logger.info("confirm Button has been clicked");
			
			
			activateBasePack.clickSubscribeButton();
			
			enterCanDetails.getSubscriptionStatus();
			
			
			
			
		}
		
		else {
			logger.warn("user is not in Add Digital Pay Bouquet");
			try {
				captureScreen(driver, "Activate_Indigital_pay_Bouquet");
			} catch (IOException e) {
				
				System.out.println("unable to take screen shot "+e);
			}
		}
		
		
		
		
		
	}
	
	



}
