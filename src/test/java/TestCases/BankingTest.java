package TestCases;

import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.*;

public class BankingTest extends BaseTest {

	@Test

	public void bankingWorkflow() {
		RegisterPage register = new RegisterPage(driver);
		register.createUser();
		LoginPage login = new LoginPage(driver);
		login.login();
		AccountPage account = new AccountPage(driver);
		account.openAccount();
		account.checkBalance();
		TransferPage transfer = new TransferPage(driver);
		transfer.transferMoney();
		BillPaymentPage bill = new BillPaymentPage(driver);
		bill.payBill();

	}

}