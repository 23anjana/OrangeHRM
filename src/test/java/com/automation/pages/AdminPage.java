package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class AdminPage extends BasePage{
    //div[@id="app"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/
    @FindBy(xpath = "//form/div[1]/div/div[2]/div/div[2]/div/div[1]")
    WebElement dropDown;

    @FindBy(xpath = "//button[text()=' Search ']")
    WebElement searchButton;

    @FindBy(xpath = "//div[@class='oxd-table-card']")
    List<WebElement> usersGreaterThanOrEqualToOne;

    public void clickAdminUserRole() {
        dropDown.click();
    }
    public void clickSearchButton() {
        searchButton.click();
    }
    public int verifyUsersGreaterThanOrEqualToOne() {
        return usersGreaterThanOrEqualToOne.size();
    }
}
