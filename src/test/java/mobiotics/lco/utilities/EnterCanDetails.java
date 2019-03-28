package mobiotics.lco.utilities;



import org.apache.log4j.Logger;

import org.openqa.selenium.WebDriver;


import mobiotics.lco.pageObjects.ActivateBasePackPage;
import mobiotics.lco.pageObjects.Add_Indigital_Pay_Bouquet;

public class EnterCanDetails {
	
	
	Add_Indigital_Pay_Bouquet addindigi;
     ActivateBasePackPage activateBasePack;
	WebDriver driver;
     Logger logger;
	
	public EnterCanDetails(Add_Indigital_Pay_Bouquet addindigi,ActivateBasePackPage activateBasePack,WebDriver driver, Logger logger) {
		this.addindigi=addindigi;
		this.driver=driver;
		this.activateBasePack=activateBasePack;
		this.logger=logger;
	}
	
	public String enterCanDetails() {
		String path=System.getProperty("user.dir")+"/src/test/java/mobiotics/lco/testData/TestData.xlsx";
		String canNumber=DemoExcelLibrary3.getexcelData("can.stb.smc", 1, 0, path);
		System.out.println(canNumber);
		
		activateBasePack.enterCanNumber(canNumber);
		logger.info("user entered "+canNumber+" for activate in degital pay Bouquet");
		
		activateBasePack.clickGoButton();
		
		System.out.println("can details has been entered");
		
		return canNumber;
	}
	
	public void getSubscriptionStatus() {
		
		String pack_name=addindigi.getPackName();
		System.out.println(pack_name);
		
		String tarifPeriod=addindigi.getTarifPeriodName();
		
		String subscription_status=addindigi.getSubscriptionStatus();
		
		String error_code=addindigi.getErrorCode();
		
		logger.warn(pack_name+" "+tarifPeriod+" "+subscription_status+" "+error_code);
		
		
	}
	
	
	
	

}
