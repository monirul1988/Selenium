package Mobile;

import java.io.IOException;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BrowseTest {
	
	
	@BeforeSuite
	public void Browse() throws IOException, InterruptedException {
		
		Runtime.getRuntime().exec("cmd /c start C:\\appiumstart.bat");
		
		Thread.sleep(7000L);
		
		System.out.println("run the appium server successfully");
	}
	@Test
	public void Appium_Server_Started()
	{
		System.out.println("run the appium server successfully--Again");
	}

}
