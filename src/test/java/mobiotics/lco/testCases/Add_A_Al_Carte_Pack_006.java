package mobiotics.lco.testCases;


import org.testng.Assert;
import org.testng.annotations.Test;
import mobiotics.lco.pageObjects.Add_A_LA_CartePage;
import mobiotics.lco.utilities.EnterCanDetails;

//need to be test this test case when i will get fresh CAN number

public class Add_A_Al_Carte_Pack_006 extends BaseClass {
	
	@Test(priority=6)
	public void activateAddAlA_Carte() throws InterruptedException {
		
		logger.info("");
		logger.info("");
		logger.info("This is add al-A Carte Test Case");
		
		
		Thread.sleep(2000);
	
		sp.clickSubscribeButton();
		sp.select_Al_A_Carte_Option();
		
		Add_A_LA_CartePage addAlACarte=new Add_A_LA_CartePage(driver);
		String addAlACartePageTitle=addAlACarte.getAdd_A_LA_CartePage_Title();
		
		if(addAlACartePageTitle.equals("Add Ala-Carte")) {
			Assert.assertTrue(true);
			
			logger.info(addAlACartePageTitle);
			
			EnterCanDetails enterCanDetails=new EnterCanDetails(addindigi, activateBasePack, driver,logger);
			enterCanDetails.enterCanDetails();
			Thread.sleep(1000);
			clickRadioButton();
			Thread.sleep(1000);
			activateBasePack.clickConfirmButton();
			logger.info("confirm Button has been clicked");
			activateBasePack.clickSubscribeButton();
			enterCanDetails.getSubscriptionStatus();
			
			
		}
		
		
	
		
	}

}
