package Academy;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;

public class base {

	public static WebDriver driver;
	public Properties prop;

	
	
	public WebDriver initializeDriver() throws IOException
	{
		 prop=new Properties();
		
		FileInputStream fis=new FileInputStream("C:\\Users\\IBM_ADMIN\\Selenium\\E2EProject\\src\\main\\java\\\\Resources\\base.properties");
		prop.load(fis);
		
		String browsername=prop.getProperty("browser");
		
		if(browsername.equalsIgnoreCase("firefox"))
		{
			
			System.setProperty("webdriver.gecko.driver", "C:\\selenium\\webdriver\\geckodriver.exe");
	          driver =new FirefoxDriver();
		}
		
		else if (browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\selenium\\webdriver\\chromedriver.exe");
	          driver =new ChromeDriver();
		}
		else  
		{
			System.setProperty("webdriver.ie.driver", "C:\\selenium\\webdriver\\IEDriverServer.exe");
	          driver =new InternetExplorerDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		return driver;
		
		}

         public void getScreenshot(String result) throws IOException {
		// TODO Auto-generated method stub
        	 try {
        	 TakesScreenshot scrShot = ((TakesScreenshot) driver);
 
        	 
		//File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File("C:/test/"+result+"_screenshot.png");
		FileUtils.copyFile(SrcFile,DestFile );
		}
        	 catch (IOException e) {
        		 e.printStackTrace();
             }
        	 
        		 
        	 }
		
		
	}

		
	
	

