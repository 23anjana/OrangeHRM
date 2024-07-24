package com.automation.pages;

import com.automation.utils.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    WebDriver driver;
    public BasePage() {
        this.driver = DriverManager.getDriver();       // initializing the driver which is used by multiple classes
        PageFactory.initElements(driver,this);
    }
}
