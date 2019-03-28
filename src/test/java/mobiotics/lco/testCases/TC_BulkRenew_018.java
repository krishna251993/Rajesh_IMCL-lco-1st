package mobiotics.lco.testCases;

import org.testng.annotations.Test;

import mobiotics.lco.pageObjects.ActivationReportPage;
import mobiotics.lco.pageObjects.RenewPage;

public class TC_BulkRenew_018 extends BaseClass{
	@Test(priority=18)
	public void bulkRenew() {
		logger.info("");
		logger.info("");
		logger.info("renew the plane in bulk");

		RenewPage renewpage=new RenewPage(driver);
		renewpage.selectRenewOption();
		renewpage.selectRenewPlane();
		renewpage.clicBulkRenew();
		logger.info("user selected the bulk renew plane");
		renewpage.clickDownload();
		String filePath=System.getProperty("user.dir")+"\\src\\test\\java\\mobiotics\\lco\\testData\\bulkactivatetemplate (1).csv";
		renewpage.uploadPlane(filePath);
		renewpage.clickUploadButton();
		renewpage.clickOnRenewButton();
		renewpage.clickRenewClose();
		
		logger.info("now let's check in the Activation Report ");
		sp.selectReport();
		logger.info("user clicked on Report");
		ActivationReportPage activationreportpage=new ActivationReportPage(driver);
		activationreportpage.clickActivationReport();
		
		String Activation_Status= activationreportpage.getActivationStatus();
		
		logger.info("After Bulk Activation"+Activation_Status);
		
		
		
	}

}
