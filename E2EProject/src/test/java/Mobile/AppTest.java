package Mobile;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppTest {

	@Test
	
	public void Drag_and_down() throws MalformedURLException, InterruptedException
	{
		// TODO Auto-generated method stub
		
		
		File f= new File("src");
		File fs=new File(f,"ApiDemos-debug.apk");
		
		DesiredCapabilities cap=new DesiredCapabilities ();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Nexus");
		cap.setCapability(MobileCapabilityType.APP,fs.getAbsolutePath());
		AndroidDriver<?> driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		Thread.sleep(1500L);
		//return driver;
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Views\"));");
		driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Views\"]").click();
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Drag and Drop\"));");
		driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Drag and Drop\"]").click();
		TouchAction t=new TouchAction(driver);
		
		t.longPress(driver.findElementById("io.appium.android.apis:id/drag_dot_1"))
		.moveTo(driver.findElementById("io.appium.android.apis:id/drag_dot_2")).release().perform();
		System.out.println("app is connecting successfully");
}

	

}

