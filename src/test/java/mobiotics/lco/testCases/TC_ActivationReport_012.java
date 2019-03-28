package mobiotics.lco.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import mobiotics.lco.pageObjects.ActivationReportPage;
import mobiotics.lco.pageObjects.SubscriberCornerPage;
import mobiotics.lco.utilities.DemoExcelLibrary3;

public class TC_ActivationReport_012 extends BaseClass {
	
	@Test(priority=7)
	public void ActivationReport() throws InterruptedException {
		
		logger.info("");
		logger.info("");
		logger.info("Activation Test report Test Case");
		Thread.sleep(2000);
		sp.selectReport();
		logger.info("user click on report");
		
		ActivationReportPage activationreportpage=new ActivationReportPage(driver);
		activationreportpage.clickActivationReport();
		logger.info("user is in Activation report page");
		//activationreportpage.clickBeforeCalender();
		//activationreportpage.SelectDate();
		//activationreportpage.clickGoBtn();
		Thread.sleep(2000);
		scrollScript();
		Thread.sleep(4000);
		
		try {
			captureScreen(driver, "Activation Report");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sp.clickSubscriber();
		SubscriberCornerPage subscribercornerpage= new SubscriberCornerPage(driver);
		subscribercornerpage.clickSubscriberCorner();
		String path=System.getProperty("user.dir")+"/src/test/java/mobiotics/lco/testData/TestData.xlsx";
		String canNumber=DemoExcelLibrary3.getexcelData("can.stb.smc", 1, 0, path);
		
		subscribercornerpage.enterCan(canNumber);
		subscribercornerpage.clickGoBtn();
		Thread.sleep(2000);
		scrollScript();
		scrollScript();
		Thread.sleep(3000);
		
		try {
			captureScreen(driver, "subscriber Corner");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sp.selectPlane();
		
		
		
	}

}
