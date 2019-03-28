package mobiotics.lco.testCases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


import mobiotics.lco.pageObjects.Add_Broad_Cast_Pay_page;





public class Select_Broadcast_Plane_005 extends BaseClass {
	
	@Test(priority=5)
	
	
	public void add_BroadCast_Pay() throws InterruptedException {
		logger.info("");
		logger.info("");
		logger.info("This is select Broad Cast plane");
		Thread.sleep(2000);
	
		sp.clickSubscribeButton();
		
		sp.selectAddBroadCastOption();
		logger.info("user select Add pay BroadCaster pay");
		//EnterCanDetails enterCanDetails=new EnterCanDetails(addindigi, activateBasePack, driver,logger);
		enterCanDetails.enterCanDetails();
		logger.info("can details entered");
		Add_Broad_Cast_Pay_page addbroadcast= new Add_Broad_Cast_Pay_page(driver);
		Thread.sleep(1000);
		addbroadcast.selectTarifPeriod();
		logger.info("tarif period selected");
		Thread.sleep(1000);
		clickRadioButton();
		
		activateBasePack.clickConfirmButton();
		
		activateBasePack.clickSubscribeButton();//(when everything will be then enable this code)
		
		enterCanDetails.getSubscriptionStatus();
	
	}

}
