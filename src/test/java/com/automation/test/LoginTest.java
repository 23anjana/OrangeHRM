package com.automation.test;

import com.automation.pages.LeavePage;
import com.automation.utils.ConfigReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public void verifyUserCanLoginWithValidCredentials() throws InterruptedException {
        loginPage.openWebsite();
        loginPage.doLogin(ConfigReader.getConfigValue("login.username"), ConfigReader.getConfigValue("login.password"));

        Assert.assertTrue(homePage.isHomePageDisplayed(), "Homepage is not loaded properly");
        Thread.sleep(1000);
    }
    @Test
    public void verifyAdminButtonIsWorking() throws InterruptedException {
        loginPage.openWebsite();
        loginPage.doLogin(ConfigReader.getConfigValue("login.username"), ConfigReader.getConfigValue("login.password"));
        homePage.clickAdminButton();
        Assert.assertTrue(homePage.verifyAdminPageIsDisplayed(), "Unable to go to Admin page");
        Thread.sleep(3000);
    }
    @Test
    public void verifySearchButton() throws InterruptedException {
        loginPage.openWebsite();
        loginPage.doLogin(ConfigReader.getConfigValue("login.username"), ConfigReader.getConfigValue("login.password"));
        homePage.clickAdminButton();
        adminPage.clickAdminUserRole();
        adminPage.clickSearchButton();
        Thread.sleep(3000);
    }
    @Test
    public void verifyGreaterThanOrEqualToOne() {
        loginPage.openWebsite();
        loginPage.doLogin(ConfigReader.getConfigValue("login.username"), ConfigReader.getConfigValue("login.password"));
        homePage.clickAdminButton();
        adminPage.clickAdminUserRole();
        adminPage.clickSearchButton();
        Assert.assertTrue(adminPage.verifyUsersGreaterThanOrEqualToOne() >= 1, "The users with admin as user role is not present");
    }
    @Test
    public void verifyLeavePageIsDisplayed() throws InterruptedException{
        loginPage.openWebsite();
        loginPage.doLogin(ConfigReader.getConfigValue("login.username"), ConfigReader.getConfigValue("login.password"));
        homePage.clickLeaveButton();
        Assert.assertTrue(homePage.verifyLeavePage(), "Leave page is not displayed");
        Thread.sleep(1000);
    }
    @Test
    public void selectionOptionsForApplyingLeave() {
        loginPage.openWebsite();
        loginPage.doLogin(ConfigReader.getConfigValue("login.username"), ConfigReader.getConfigValue("login.password"));
        homePage.clickLeaveButton();
        leavePage.clickApplyButton();
        leavePage.selectLeaveType();
        leavePage.selectFromDate();
        leavePage.selectToDate();
    }
}