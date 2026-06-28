package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BillPaymentPage {

    WebDriver driver;

    By billPay = By.linkText("Bill Pay");

    By payee = By.name("payee.name");
    By address = By.name("payee.address.street");
    By city = By.name("payee.address.city");
    By state = By.name("payee.address.state");
    By zip = By.name("payee.address.zipCode");
    By number = By.name("payee.phoneNumber");

    // Added account fields
    By account = By.name("payee.accountNumber");
    By verifyAccount = By.name("verifyAccount");

    By amount = By.name("amount");

    By sendPayment = By.xpath("//input[@value='Send Payment']");


    public BillPaymentPage(WebDriver driver) {
        this.driver = driver;
    }


    public void payBill() {

        driver.findElement(billPay).click();


        driver.findElement(payee)
              .sendKeys("Electricity");


        driver.findElement(address)
              .sendKeys("Mumbai Street");


        driver.findElement(city)
              .sendKeys("Mumbai");


        driver.findElement(state)
              .sendKeys("MH");


        driver.findElement(zip)
              .sendKeys("400001");


        driver.findElement(number)
              .sendKeys("9876543210");


        // Account details
        driver.findElement(account)
              .sendKeys("123456");


        driver.findElement(verifyAccount)
              .sendKeys("123456");


        driver.findElement(amount)
              .sendKeys("50");


        driver.findElement(sendPayment)
              .click();
    }
}