package mobiotics.lco.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import mobiotics.lco.pageObjects.DisconnectPage;
import mobiotics.lco.pageObjects.PlanePage;
import mobiotics.lco.utilities.DemoExcelLibrary3;

public class TC_DisconnectPlane_008 extends BaseClass {
	
	
	@Test(priority=8)
	public void DisconnectPlane() throws InterruptedException {
		logger.info("");
		logger.info("");
		logger.info("Disconnect Plane Test Case");
		
		
		Thread.sleep(2000);
		
		sp.selectPlane();
		
		logger.info("Plane Module has been selected");
		
		PlanePage planepage= new PlanePage(driver);
		DisconnectPage disconnectpage= new DisconnectPage(driver);
		planepage.clickDisconnectLink();
		logger.info("disconnect link clicked");
		
		String disconnectPageTitle=disconnectpage.getDisconnectPageTitle();
		
		if(disconnectPageTitle.equals("Disconnect Plans"))
		{
			Assert.assertTrue(true);
			logger.info("user is in Disconnect page");
			
			String path=System.getProperty("user.dir")+"/src/test/java/mobiotics/lco/testData/TestData.xlsx";
			String canNumber=DemoExcelLibrary3.getexcelData("can.stb.smc", 1, 0, path);
			
			Thread.sleep(3000);
			System.out.println(canNumber);
			
			disconnectpage.enterCan(canNumber);
			
			logger.info("user entered "+canNumber+" for disconnect the plane");
			
			disconnectpage.clicGoBtn();
			
			System.out.println("can details has been entered");
			
			disconnectpage.clickDiconnectBtn();
			
			if(disconnectpage.failedStatus()==false)
			{
				Assert.assertTrue(true);
				logger.info("Dissconnection Successfully");
			}
			
			else {
				logger.info("Disconnection Failed");
				//Assert.assertTrue(false);
				
			}
			
			
		}
		
		else {
			Assert.assertTrue(false);
			try {
				captureScreen(driver, "Reconnect");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
