package Mobile;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Academy.validationTest;

public class BrowseTest {
	private static Logger log=LogManager.getLogger(BrowseTest.class.getName());
	
	@BeforeSuite
	public void Browse() throws IOException, InterruptedException {
		
		Runtime.getRuntime().exec("cmd /c start C:\\appiumstart.bat");
		
		Thread.sleep(7000L);
		log.info("run the appium server successfully");
		
		//System.out.println("run the appium server successfully");
	}
	@Test
	public void Appium_Server_Started()
	{
		
		log.info("appium server started");
		//System.out.println("run the appium server successfully--Again");
	}

}
