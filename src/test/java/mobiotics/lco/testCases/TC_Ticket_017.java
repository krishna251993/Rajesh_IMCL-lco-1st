package mobiotics.lco.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import mobiotics.lco.pageObjects.ticketPage;
import mobiotics.lco.utilities.DemoExcelLibrary3;

public class TC_Ticket_017 extends BaseClass {
	@Test(priority=17)
	public void Ticket() {
		
		logger.info("");
		logger.info("");
		logger.info("Ticket Test Case");
		sp.clickSubscriber();
		
		ticketPage ticketpage= new ticketPage(driver);
		ticketpage.clickTicket();
		if(ticketpage.getTicketPagetext().equals("Tickets")) {
			
			
			Assert.assertTrue(true);
			logger.info("user is in Ticket Page");
			
			String path=System.getProperty("user.dir")+"/src/test/java/mobiotics/lco/testData/TestData.xlsx";
			String canNum=DemoExcelLibrary3.getexcelData("Ticket", 1, 0, path);
			ticketpage.enterCanForTicket(canNum);
		}
		
		else {
			Assert.assertTrue(false);
			try {
				captureScreen(driver, "Tickets");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}

}
