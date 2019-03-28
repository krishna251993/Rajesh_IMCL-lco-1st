package mobiotics.lco.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import mobiotics.lco.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	@Test(priority=1)
	public void loginTest() throws InterruptedException {
		
		logger.info("");
		logger.info("");
		logger.info("Login Test Case");
		
		
		System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseURL);
		logger.info("URL Passed successfully");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		LoginPage lp= new LoginPage(driver);
		//logger.info("URL Has opened");
		
		
		lp.setFrCode(FrCode);
		logger.info("FrCode sent successfully");
		lp.setPassword(password);
		
		logger.info("password sent successfully");
		
		lp.clickproceed();
		
		scrollScript();
		logger.info("page is scrolled by 1000 Pixel");
		
		Thread.sleep(2000);
		
		
		if(lp.getLCO_DashboardText().getText().equals("LCO DASHBOARD")) {
			Assert.assertTrue(true);
			
			logger.info("logger entered into LCO Dashboard");
		
		}
		else
		{
			logger.warn("logger is not in LCO DashBoard");
			try {
				captureScreen(driver, "loginTest");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Assert.assertTrue(false);
	
			
		}
		
		
		
		
		
		
	}

}
