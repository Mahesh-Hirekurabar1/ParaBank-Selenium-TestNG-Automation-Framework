package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	By username = By.name("username");
	By password = By.name("password");
	By login = By.xpath("//input[@value='Log In']");
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void login() {
		driver.findElement(username).sendKeys("mahesh123");
		driver.findElement(password).sendKeys("password");
		driver.findElement(login).click();
	}

}