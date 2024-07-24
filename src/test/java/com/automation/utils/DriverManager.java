package com.automation.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

// Reusable class
public class DriverManager {
    // The webDriver is made static so that it belongs to the class and can be directly called using the class name
    static WebDriver driver;
    public static void createDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    }
    public static WebDriver getDriver() {
        // return the object of driver. Allow other parts of the code to use it for browser interaction
        return driver;
    }
}
