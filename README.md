# ParaBank Selenium TestNG Automation Framework

## Project Overview
This project is an End-to-End Automation Testing Framework developed for the ParaBank banking application using Selenium WebDriver, Java, TestNG, Maven, and Page Object Model (POM).
The framework automates key banking workflows with a reusable and maintainable structure following automation framework best practices.

Application URL:
https://parabank.parasoft.com/parabank/index.htm

## Technologies Used
- Java
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model (POM)
- Eclipse IDE
- Git & GitHub

## Project Structure
```text
ParaBankAutomation
│
├── src
│   └── test
│       │
│       ├── java
│       │   │
│       │   ├── Base
│       │   │   └── BaseTest.java
│       │   │
│       │   ├── Pages
│       │   │   ├── LoginPage.java
│       │   │   ├── RegisterPage.java
│       │   │   ├── AccountPage.java
│       │   │   ├── TransferPage.java
│       │   │   └── BillPaymentPage.java
│       │   │
│       │   └── TestCases
│       │       └── BankingTest.java
│       │
│       └── resources
│           └── config.properties
│
├── pom.xml
├── testng.xml
└── README.md
```
## File Description
### Base
**BaseTest.java**
- Initializes WebDriver
- Handles browser setup
- Contains common test configurations


### Pages (Page Object Model)
**LoginPage.java**
- Handles login page locators and actions

**RegisterPage.java**
- Handles user registration functionality

**AccountPage.java**
- Handles account creation and account related actions

**TransferPage.java**
- Handles fund transfer operations

**BillPaymentPage.java**
- Handles bill payment workflow

### TestCase
- Executing all TestCases

## Automated Test Scenarios
1. User Registration  
  - Create new user account
  - Validate registration flow

2. Login  
  - Login with valid credentials
  - Verify successful login

3. Account Creation  
  - Create new bank account
  - Validate account details

4. Fund Transfer  
  - Transfer money between accounts
  - Verify transfer functionality

5. Bill Payment  
  - Enter payee details
  - Enter account information
  - Submit payment


## Key Features
✔ Selenium WebDriver automation  
✔ TestNG framework integration  
✔ Page Object Model implementation  
✔ Reusable page classes  
✔ Maven dependency management  
✔ Properties file configuration  
✔ Maintainable automation framework structure  
