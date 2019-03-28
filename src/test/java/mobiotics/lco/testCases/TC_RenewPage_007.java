package mobiotics.lco.testCases;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import mobiotics.lco.pageObjects.RenewPage;
import mobiotics.lco.utilities.DemoExcelLibrary3;
import mobiotics.lco.utilities.EnterCanDetails;

public class TC_RenewPage_007 extends BaseClass {
	@Test(priority=7)
	public void renewPlane() throws InterruptedException, IOException {
		
		logger.info("");
		logger.info("");
		logger.info("renew Plane Test Case");
		
		
		
		Thread.sleep(2000);
		RenewPage renewpage=new RenewPage(driver);
		renewpage.selectRenewOption();
		
		renewpage.selectRenewPlane();
		
		if(renewpage.getRenewPageText().equals("Renew Subscriptions")) {
			Assert.assertTrue(true);
			logger.info("Renew Plane option has been selected");
			Thread.sleep(2000);
			String path=System.getProperty("user.dir")+"/src/test/java/mobiotics/lco/testData/TestData.xlsx";
			String canNumber=DemoExcelLibrary3.getexcelData("can.stb.smc", 1, 2, path);
			System.out.println(canNumber);
			
			renewpage.entercan(canNumber);
			logger.info("user entered "+canNumber+" for activate in degital pay Bouquet");
			
			activateBasePack.clickGoButton();
			
			System.out.println("can details has been entered");
			clickRadioButton();
			activateBasePack.clickConfirmButton();
			
			if(renewpage.errorPopUp().isDisplayed()==true) {
				renewpage.errorPopUp().click();
			}
			
			
			
			else {
				//renewpage.clickSubscribeButton();
				
			}
			
		}
		
		else {
			Assert.assertTrue(false);
			captureScreen(driver, "Renewal got fail");
		}
		
		
		
		
		
		
	}
	
	
	
	

}
