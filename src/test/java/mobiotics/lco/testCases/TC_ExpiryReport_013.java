package mobiotics.lco.testCases;

import org.testng.annotations.Test;

import mobiotics.lco.pageObjects.ExpiryReportPage;

public class TC_ExpiryReport_013 extends BaseClass{
	@Test(priority=13)
	public void expiryReport() throws InterruptedException {
		
		logger.info("");
		logger.info("");
		logger.info("Expiry Report Test Case");
		Thread.sleep(2000);
		sp.selectReport();
		ExpiryReportPage ecpiryreportPage=new ExpiryReportPage(driver);
		ecpiryreportPage.clickExpiryReport();
		ecpiryreportPage.selectDropDown();
		scrollScript();
		Thread.sleep(2000);
		
	}

}
