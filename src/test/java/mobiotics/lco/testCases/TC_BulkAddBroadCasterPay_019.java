package mobiotics.lco.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import mobiotics.lco.pageObjects.Add_Broad_Cast_Pay_page;
import mobiotics.lco.pageObjects.DisconnectPage;
import mobiotics.lco.pageObjects.PlanePage;
import mobiotics.lco.pageObjects.SubscriberCornerPage;
import mobiotics.lco.utilities.DemoExcelLibrary3;

public class TC_BulkAddBroadCasterPay_019 extends BaseClass{

	@Test(priority=19)
	public void BulkAddBroadCaster() throws InterruptedException {
		
		logger.info("");
		logger.info("");
		logger.info("Add broadcaster pay in bulk");
		sp.clickSubscribeButton();
		sp.selectAddBroadCastOption();
		
		Add_Broad_Cast_Pay_page addbroadcast= new Add_Broad_Cast_Pay_page(driver);
		addbroadcast.clickBulkActive();
		
		logger.info("user is going data in bulk for add broacaster pay bouquet");
		String path=System.getProperty("user.dir")+"\\src\\test\\java\\mobiotics\\lco\\testData\\bulkactivatetemplate for Add Broadcaster.csv";
		addbroadcast.clickDownload();
		addbroadcast.enterFile(path);
		
		addbroadcast.clickUpload();
		addbroadcast.clickActivateButton();//(when the everything will get final than enable this code)
		Thread.sleep(2000);
		addbroadcast.clickcloseBtn();
		logger.info("user susseccfully added the bulk");
		
		Thread.sleep(2000);
		
         sp.selectPlane();
		
		logger.info("Plane Module has been selected for checking the weather the plane listed in disconnect page or not");
		PlanePage planepage= new PlanePage(driver);
		DisconnectPage disconnectpage= new DisconnectPage(driver);
		planepage.clickDisconnectLink();
		logger.info("disconnect link clicked");
		String disconnectPageTitle=disconnectpage.getDisconnectPageTitle();
		
		
		if(disconnectPageTitle.equals("Disconnect Plans"))
		{
			Assert.assertTrue(true);
			logger.info("user is in Disconnect page");
			
			String path1=System.getProperty("user.dir")+"/src/test/java/mobiotics/lco/testData/TestData.xlsx";
			String canNumber=DemoExcelLibrary3.getexcelData("bulkactivatetemplate for Add Br", 1, 0, path1);
			
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
		
		Thread.sleep(2000);
		sp.clickSubscriber();
		SubscriberCornerPage suscribercornerpage=new SubscriberCornerPage(driver);
		
		suscribercornerpage.clickSubscriberCorner();
		String path1=System.getProperty("user.dir")+"/src/test/java/mobiotics/lco/testData/TestData.xlsx";
		String canNumber=DemoExcelLibrary3.getexcelData("bulkactivatetemplate for Add Br", 1, 0, path1);
		suscribercornerpage.enterCan(canNumber);
		suscribercornerpage.clickGoBtn();
		String planecode=suscribercornerpage.getPlaneCode();
		String PlaneCodefromExel=DemoExcelLibrary3.getexcelData("bulkactivatetemplate for Add Br", 1, 1, path);
		if(planecode.equals(PlaneCodefromExel)) {
			logger.info("Plane is successfully configured in subscriber corner");
		}
		
		else {
			logger.info("plane is not successfully configured with the subscriber corner");
			
			try {
				captureScreen(driver, "Plane is not ion the subscriber corner");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	 
	
	

	}

