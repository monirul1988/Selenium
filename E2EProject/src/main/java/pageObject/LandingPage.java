package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver1;

	By login = By.xpath("//span[contains(text(),'Login')]");
	By validation = By.xpath("//h2[contains(text(),'Featured Courses')]");
	By popup = By.xpath("//button[contains(text(),'NO THANKS')]");

	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver1 = driver;
	}

	public WebElement QAlogin() {
		// TODO Auto-generated method stub
		return driver1.findElement(login);
	}

	public WebElement validation() {
		// TODO Auto-generated method stub
		return driver1.findElement(validation);
	}

	

	public WebElement popup() {
		// TODO Auto-generated method stub
		return driver1.findElement(popup);
	}
}
