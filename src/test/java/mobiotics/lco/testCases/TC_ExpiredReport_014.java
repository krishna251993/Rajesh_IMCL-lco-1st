package mobiotics.lco.testCases;

import org.testng.annotations.Test;

import mobiotics.lco.pageObjects.ExpiredReportPage;

public class TC_ExpiredReport_014 extends BaseClass{
	
	@Test(priority=14)
	public void ecpiredReport() throws InterruptedException {
		
		logger.info("");
		logger.info("");
		logger.info("Expired Report Test Case");
		logger.info("üser is in expired page");
		sp.selectReport();
		ExpiredReportPage expiredreport=new ExpiredReportPage(driver);
		expiredreport.clickEcpiredReport();
		expiredreport.selectDropDown();
		
		scrollScript();
		if(expiredreport.clickDownload().isEnabled()==true)
		{
		expiredreport.clickDownload().click();
		}
		Thread.sleep(2000);
		
		
	}

}
