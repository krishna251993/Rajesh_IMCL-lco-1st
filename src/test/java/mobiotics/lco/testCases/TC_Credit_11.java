package mobiotics.lco.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import mobiotics.lco.pageObjects.AddCreditPage;
import mobiotics.lco.utilities.DemoExcelLibrary3;

public class TC_Credit_11 extends BaseClass{
	
	@Test(priority=11)
	public void addCredit() {
		logger.info("");
		logger.info("");
		logger.info("Add credit Test Case");
		
		
		sp.selectCredit();
		AddCreditPage addcredit=new AddCreditPage(driver);
		addcredit.clickAddCredit();
		
		if(addcredit.getAddcreditText().equals("Add Credits"))	{
			Assert.assertTrue(true);
			logger.info("user is in Add Credit Page");
			
			String path=System.getProperty("user.dir")+"/src/test/java/mobiotics/lco/testData/TestData.xlsx";
			int amount=DemoExcelLibrary3.getexcelDatanumber("cardDetails", 1, 3, path);
			String amt=String.valueOf(amount);
			System.out.println(amount);
			addcredit.enterAmount(amt);
			logger.info("user entered the amount");
			addcredit.clickOnDebitCardRadioButton();
			logger.info("user select the Debit card option");
			addcredit.clickPayButton();
			if(addcredit.isPaytmSymboolDisplayed()==true) {
				//int cardNO=DemoExcelLibrary3.getexcelDatanumber("cardDetails", 1, 0, path);
				//String cardNum=String.valueOf(cardNO);
				addcredit.enterCardNumber("4786790015682931");
				logger.info("user entered 4786790015682931");
				int monthNum=DemoExcelLibrary3.getexcelDatanumber("cardDetails", 1, 1, path);
				String monthstr=String.valueOf(monthNum);
				addcredit.selectExpiryMonth(monthstr);
				logger.info("user entered "+monthstr);
				int yearNum=DemoExcelLibrary3.getexcelDatanumber("cardDetails", 1, 2, path);
				String yearstr=String.valueOf(yearNum);
				addcredit.selectExpYear(yearstr);
				logger.info("user entered "+yearstr);
				int cvvNo=DemoExcelLibrary3.getexcelDatanumber("cardDetails", 1, 2, path);
				String cvvStr=String.valueOf(cvvNo);
				addcredit.enterCVV(cvvStr);
				logger.info("user entered "+cvvStr);
				addcredit.clickPayNow();
				logger.info("payment entry entered and pay button has clicked");
				addcredit.enterOTP("123123");
				logger.info("OTP has been entered");
				addcredit.clicksubmit();
				
				String paymentStatus=addcredit.getPaymebtStatus();
				System.out.println(paymentStatus);
				addcredit.clickViewBalence();
				
				logger.info(addcredit.getTransectionStatus());
				
				try {
					captureScreen(driver, "Transection Done");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
	}
	
	

}
