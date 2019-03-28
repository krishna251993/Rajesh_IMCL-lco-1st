package mobiotics.lco.testCases;

import org.testng.annotations.Test;

import mobiotics.lco.pageObjects.HardwarePage;
import mobiotics.lco.utilities.DemoExcelLibrary3;

public class TC_STBReplacement_015 extends BaseClass {
	
	
	@Test(priority=15)
	public void stbReplacement() throws InterruptedException {
		
		logger.info("");
		logger.info("");
		logger.info("STB Replacement Test Case");
		
		Thread.sleep(2000);
		sp.clickHardware();
		HardwarePage hardwarepage= new HardwarePage(driver);
		hardwarepage.clickSTBReplacement();
		if(hardwarepage.getSTBReplacementText().equals("STB Replacement")) {
			
			
			logger.info("user is in STB Replacement Page");
			String path=System.getProperty("user.dir")+"/src/test/java/mobiotics/lco/testData/TestData.xlsx";
		
			String STBNo=DemoExcelLibrary3.getexcelData("STB Replacement", 1, 0, path);
			System.out.println(STBNo);
			hardwarepage.enterSTBNo(STBNo);
			logger.info("user entered the STb number");
			hardwarepage.clickCheckButton();
			logger.info("user clicked the check button");
			
			hardwarepage.clickRadioBtn();
			logger.info("user select the radio Button");
			String newSTBNo=DemoExcelLibrary3.getexcelData("STB Replacement", 1, 1, path);
			
			hardwarepage.EnterNewSTB(newSTBNo);
			logger.info("user entered new Stb number for replacement");
			hardwarepage.clickSTBReplacementBtn();
			
		}
	}

}
