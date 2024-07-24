package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeavePage extends BasePage{
    @FindBy(xpath = "//a[text()='Apply']")
    WebElement applyButton;

    @FindBy(xpath = "//form/div[1]/div/div[1]/div/div[2]/div/div/div[1]")
    WebElement leaveTypeButton;

    @FindBy(xpath = "//div[@class='oxd-select-option'][2]")
    WebElement leaveTypeDropDownSelect;

    @FindBy(xpath = "//div/div[1]/div/div[2]/div/div/i")
    WebElement fromDate;

    @FindBy(xpath = "//div[@class='oxd-calendar-selector-month-selected']")
    WebElement monthSelectButton;

    @FindBy(xpath = "//li[@class='oxd-calendar-dropdown--option'][8]")
    WebElement monthChoose;

    @FindBy(xpath = "//div[@class='oxd-calendar-date-wrapper'][2]//div[@class='oxd-calendar-date']")
    WebElement datePicking;

    @FindBy(xpath = "//div[2]/div/div[2]/div/div/i")
    WebElement toMonthSelect;

    @FindBy(xpath = "//div[@class='oxd-calendar-date-wrapper'][6]")
    WebElement toDateChoose;

    public void clickApplyButton() {
        applyButton.click();
    }
    public void selectLeaveType() {
        leaveTypeButton.click();
        leaveTypeDropDownSelect.click();
    }
    public void selectFromDate() {
        fromDate.click();
        monthSelectButton.click();
        monthChoose.click();
        datePicking.click();
    }
    public void selectToDate() {
        toMonthSelect.click();
        toDateChoose.click();
    }
}
