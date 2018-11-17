package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
	
	
public WebDriver driver1;

By email=By.xpath("//input[@id='user_email']");

By password=By.xpath("//input[@id='user_password']");
By login=By.xpath("//input[@value='Log In']");


public Loginpage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver1=driver;
}

public WebElement  enteremail()
{
	return driver1.findElement(email);
}


public WebElement enterpassword() 
{
	// TODO Auto-generated method stub
	return driver1.findElement(password);
}
public WebElement enterlogin() 
{
	// TODO Auto-generated method stub
	return driver1.findElement(login);
}

}
