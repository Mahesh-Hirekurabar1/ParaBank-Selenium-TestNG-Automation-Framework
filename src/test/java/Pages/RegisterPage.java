package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

	WebDriver driver;

	By registerLink = By.linkText("Register");
	By firstName = By.id("customer.firstName");
	By lastName = By.id("customer.lastName");
	By address = By.id("customer.address.street");
	By city = By.id("customer.address.city");
	By state = By.id("customer.address.state");
	By zip = By.id("customer.address.zipCode");
	By phone = By.id("customer.phoneNumber");
	By ssn = By.id("customer.ssn");
	By username = By.id("customer.username");
	By password = By.id("customer.password");
	By confirmPassword = By.id("repeatedPassword");
	By registerBtn = By.xpath("//input[@value='Register']");
	
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
	}

	public void createUser() {
		driver.findElement(registerLink).click();
		driver.findElement(firstName).sendKeys("Mahesh");
		driver.findElement(lastName).sendKeys("Tester");
		driver.findElement(address).sendKeys("Pune");
		driver.findElement(city).sendKeys("Pune");
		driver.findElement(state).sendKeys("MH");
		driver.findElement(zip).sendKeys("411001");
		driver.findElement(phone).sendKeys("9999999999");
		driver.findElement(ssn).sendKeys("12345");
		driver.findElement(username).sendKeys("mahesh123");
		driver.findElement(password).sendKeys("password");
		driver.findElement(confirmPassword).sendKeys("password");
		driver.findElement(registerBtn).click();
	}

}