package com.automation.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

// Reusable class
public class ConfigReader {
    // made static to call it without creating an object, also it ensures that a single instance is used across the application
    static Properties prop;
    public static void initConfig() {  // Called only one time
        prop = new Properties();       // A space is created in the memory
        try {
            prop.load(new FileInputStream("src/test/resources/config/config.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static String getConfigValue(String key) {
        return prop.getProperty(key);   // Retrive the property using the key
    }
    // Two separate methods are created because the things written in initConfig is only used once, but getConfigValue is used multiple times.
}

