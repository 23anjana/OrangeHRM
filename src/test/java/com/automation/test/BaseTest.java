package com.automation.test;

import com.automation.pages.AdminPage;
import com.automation.pages.HomePage;
import com.automation.pages.LeavePage;
import com.automation.pages.LoginPage;
import com.automation.utils.ConfigReader;
import com.automation.utils.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    LoginPage loginPage;                     // instance variable
    HomePage homePage;
    AdminPage adminPage;
    LeavePage leavePage;
    @BeforeMethod
    public void setUp() {
        ConfigReader.initConfig();          // If this is not done, we will get a null pointer exception
        DriverManager.createDriver();
        loginPage = new LoginPage();        // object of instance variable
        homePage = new HomePage();
        adminPage = new AdminPage();
        leavePage = new LeavePage();
    }
    @AfterMethod
    public void cleanUp() {
        DriverManager.getDriver().quit();
    }
}
