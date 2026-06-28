package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TransferPage {

	WebDriver driver;

	By transferFunds = By.linkText("Transfer Funds");
	By amount = By.id("amount");
	By transferBtn = By.xpath("//input[@value='Transfer']");
	public TransferPage(WebDriver driver) {
		this.driver = driver;
	}

	public void transferMoney() {
		driver.findElement(transferFunds).click();
		driver.findElement(amount).sendKeys("5");
		driver.findElement(transferBtn).click();
	}
}