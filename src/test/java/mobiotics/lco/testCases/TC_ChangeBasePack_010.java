package mobiotics.lco.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import mobiotics.lco.pageObjects.ChangBasePackPage;
import mobiotics.lco.pageObjects.PlanePage;
import mobiotics.lco.utilities.DemoExcelLibrary3;
import mobiotics.lco.utilities.EnterCanDetails;

public class TC_ChangeBasePack_010 extends BaseClass{
	
	@Test(priority=10)
	public void changeBasePack() throws InterruptedException {
		
		logger.info("");
		logger.info("");
		logger.info("change the base pack otest case");
		Thread.sleep(2000);
		sp.selectPlane();
		PlanePage planepage= new PlanePage(driver);
		planepage.clicChangeBasePackLink();
		logger.info("user select the change base pack Option");
		
		ChangBasePackPage changebasepack=new ChangBasePackPage(driver);
		
		String changeBasePackText=changebasepack.getChangeBasePackText();
		
		if(changeBasePackText.equals("Change Base Pack")) {
			Assert.assertTrue(true);
			logger.info("user is in change base pack page");
			
			String path=System.getProperty("user.dir")+"/src/test/java/mobiotics/lco/testData/TestData.xlsx";
			String canNumber=DemoExcelLibrary3.getexcelData("can.stb.smc", 1, 0, path);
			
			Thread.sleep(3000);
			System.out.println(canNumber);
			
			changebasepack.enterCanNum(canNumber);
			logger.info("user entered "+canNumber+" for change the Base Pack");
			
			changebasepack.clickGoBtn();
			
			changebasepack.selectRadioButton();
			Thread.sleep(2000);
			changebasepack.clickConfirmBtn();
			
			changebasepack.clickSubscribeBtn();
			
			
			EnterCanDetails entercandetails=new EnterCanDetails(addindigi, activateBasePack, driver, logger);
			entercandetails.getSubscriptionStatus();
			
		}
		
		else {
			logger.warn("user is navigate to the wrong page");
			Assert.assertTrue(false);
		}
		
		
		
		
	}
	
	

}
