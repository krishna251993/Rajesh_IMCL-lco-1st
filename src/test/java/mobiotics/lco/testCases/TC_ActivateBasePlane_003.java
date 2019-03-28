package mobiotics.lco.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import mobiotics.lco.pageObjects.ActivateBasePackPage;
import mobiotics.lco.pageObjects.LoginPage;
import mobiotics.lco.pageObjects.SubscribePage;
import mobiotics.lco.utilities.DemoExcelLibrary3;
import mobiotics.lco.utilities.EnterCanDetails;

public class TC_ActivateBasePlane_003 extends BaseClass {
	
	@Test(priority=3)
	public void ActivateBasePlane() throws InterruptedException {
		logger.info("");
		logger.info("");
		logger.info("Active Base plane Test case");
		
		
		Thread.sleep(2000);
		
		sp.clickSubscribeButton();
		sp.clickAddBasePack();
		logger.info("Add Base Pack option selected");
		
		
		if(activateBasePack.getAddBasePackText().getText().equals("Activate Base Pack")) {
			Assert.assertTrue(true);
			logger.info("user in Add BasePack Package");
			
			EnterCanDetails entercan=new EnterCanDetails(addindigi, activateBasePack, driver, logger);
			
			String CanNum=entercan.enterCanDetails();
			Thread.sleep(2000);
			activateBasePack.clickGoButton();
			
			
			boolean radio_Button_status=activateBasePack.PlaneRadioButtonstatus().isEnabled();
			System.out.println(radio_Button_status);
			if(radio_Button_status==true){
				
				logger.warn(CanNum+" Don't Having any base plane");
				Thread.sleep(2000);
				
				activateBasePack.PlaneRadioButtonstatus().click();
				activateBasePack.clickConfirmButton();
				Thread.sleep(1000);
				activateBasePack.clickSubscribeButton();
				
				Thread.sleep(2000);
				entercan.getSubscriptionStatus();
				logger.info(CanNum+" is successfully subscribed");
				
			}
			else {
				logger.warn(CanNum+" Already having the base plane");
				
				
				}
				
				
			}
			
			
		}
		
			
		
	}

	


