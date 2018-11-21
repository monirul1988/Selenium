package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.Loginpage;

public class loginvalidationTest extends base {
	
	private static Logger log=LogManager.getLogger(loginvalidationTest.class.getName());
	
	
	@Test(dataProvider="getdata",priority=0)
	

	public void Login_in_Account(String email, String password) throws IOException, InterruptedException

	{

		driver = initializeDriver();

		// driver.get("http://gooogle.com/");
		driver.get(prop.getProperty("url"));

		LandingPage l = new LandingPage(driver);
		//Thread.sleep(6000);

		
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'NO THANKS')]")));
		 
		l.popup().click();
		
		log.info("clicked done successfully");
		
        l.QAlogin().click();

		Loginpage lp = new Loginpage(driver);
		lp.enteremail().sendKeys(email);
		lp.enterpassword().sendKeys(password);
		lp.enterlogin().click();

		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText(),
				"Invalid email or password.");
		driver.quit();
		
		
	}

	@DataProvider

	public Object[][] getdata() {

		Object[][] data = new Object[2][2];
		data[0][0] = "monirul@gmail.com";
		data[0][1] = "ibm";
		
		data[1][0] = "test@gmail.com";
		data[1][1] = "ibm";
		return data;
	}
	
	
	/*@AfterTest
	public void teardown()
	{
		driver.quit();
		driver=null;
		
	}*/
	
	
	
}
