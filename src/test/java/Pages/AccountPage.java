package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage {

	WebDriver driver;
	By openAccount = By.linkText("Open New Account");
	By openBtn = By.xpath("//input[@value='Open New Account']");
	By accountOverview = By.linkText("Accounts Overview");
	public AccountPage(WebDriver driver) {
		this.driver = driver;
	}

	public void openAccount() {
		driver.findElement(openAccount).click();
		driver.findElement(openBtn).click();
	}

	public void checkBalance() {
		driver.findElement(accountOverview).click();
	
	}

}