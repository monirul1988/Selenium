package Academy;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import pageObject.LandingPage;
import pageObject.Loginpage;

public class validationTest extends base {
	
	private static Logger log=LogManager.getLogger(validationTest.class.getName());

	@Test
	public void Text_Validation() throws IOException, InterruptedException

	{

		try {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		LandingPage l = new LandingPage(driver);
		log.info("page loaded successfully");
		

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'NO THANKS')]")));
		log.info("waiting for pop up discard msg");

		l.popup().click();
		log.info("pop up msg clicked successfully");
	//	System.out.println(l.validation().getText());
		log.info(l.validation().getText());
		
		
		Assert.assertEquals(l.validation().getText(), "FEATURED COURSES1");}
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			//System.out.println("check the code in validation.java");
			log.info("check the code in validation.java");
		}
		
		finally
		{
			driver.close();
		}
		
		}
		
		
		
	
		
	/*@AfterTest
		public void teardown()
		{
			driver.close();
			driver=null;
			
		}*/
	
}
