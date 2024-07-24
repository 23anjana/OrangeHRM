package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    @FindBy(tagName = "h6")
    WebElement dashBoard;

    @FindBy(xpath = "//span[text()='Admin']")
    WebElement adminBtn;

    @FindBy(xpath = "//span[@class='oxd-topbar-header-breadcrumb']")
    WebElement adminOrUserManagementDisplay;

    @FindBy(xpath = "//span[text()='Leave']")
    WebElement leaveButton;

    @FindBy(tagName = "h6")
    WebElement verifyLeaveButton;

    public boolean isHomePageDisplayed() {
        return dashBoard.isDisplayed();
    }
    public void clickAdminButton() {
        adminBtn.click();
    }
    public boolean verifyAdminPageIsDisplayed() {
        return adminOrUserManagementDisplay.isDisplayed();
    }
    public void clickLeaveButton() {
        leaveButton.click();
    }
    public boolean verifyLeavePage() {
        return verifyLeaveButton.isDisplayed();
    }
}
