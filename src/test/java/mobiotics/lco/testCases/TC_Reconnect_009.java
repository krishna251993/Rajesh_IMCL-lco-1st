package mobiotics.lco.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import mobiotics.lco.pageObjects.ReconnectPage;
import mobiotics.lco.utilities.DemoExcelLibrary3;
import mobiotics.lco.utilities.EnterCanDetails;

public class TC_Reconnect_009 extends BaseClass{

	
	@Test(priority=9)
	public void reconnctPlane() throws InterruptedException {
		
		logger.info("");
		logger.info("");
		logger.info("Reconnect Plane Test case");
		
		
		Thread.sleep(2000);
		
		sp.selectPlane();
		
		sp.selectReconnectLink();
		ReconnectPage reconnectpage=new ReconnectPage(driver);
		String reconnectText=reconnectpage.getReconnectText();
		if(reconnectText.equals("Reconnect Plans")) {
			logger.info("reconnect Option Selected");
			Assert.assertTrue(true);
			
			//EnterCanDetails.enterCanDetails();
			
			
			String path=System.getProperty("user.dir")+"/src/test/java/mobiotics/lco/testData/TestData.xlsx";
			String canNumber=DemoExcelLibrary3.getexcelData("can.stb.smc", 1, 0, path);
			
			Thread.sleep(3000);
			System.out.println(canNumber);
			
			reconnectpage.enterCan(canNumber);
			
			logger.info("user entered "+canNumber+" for reconnect the plane");
			
			reconnectpage.clickGoBtn();
			
			String reconnectplane=reconnectpage.getReconnectPlane();
			
			reconnectpage.clickReconnectBtn();
			if(reconnectpage.getFailedStatus()==false) {
				logger.info(reconnectplane+" is successfully Re-connected");
				Assert.assertTrue(true);
			}
			
			else {
				logger.info(reconnectplane+" failed to Re-connect");
				
				
			}
			
			
			
			
		}
		
		else {
			Assert.assertTrue(false);
			
			try {
				captureScreen(driver, "Reconnect Plane");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
