package mobiotics.lco.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import mobiotics.lco.pageObjects.ModifyCustomer;
import mobiotics.lco.utilities.DemoExcelLibrary3;

public class TC_ModifyCustomer_016 extends BaseClass {
	@Test(priority=16)
	public void modifyCustomer() {
		
		logger.info("");
		logger.info("");
		logger.info("Modifiy Test Case");
		
	
		sp.clickSubscriber();
		ModifyCustomer modifycustomer=new ModifyCustomer(driver);
		modifycustomer.clicmodifyCustomer();
		
		if(modifycustomer.getmodifyCustomerText().equals("Modify Customer")) {
			Assert.assertTrue(true);
			
			String path=System.getProperty("user.dir")+"/src/test/java/mobiotics/lco/testData/TestData.xlsx";
			String can=DemoExcelLibrary3.getexcelData("modify CustomerModify", 1, 0, path);
			
			modifycustomer.enterCanForModify(can);
			
			modifycustomer.clickCheckBtn();
		}
		
		else {
			try {
				captureScreen(driver, "Modify Customer");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
