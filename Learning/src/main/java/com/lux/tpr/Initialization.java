package com.lux.tpr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Initialization {

    public WebDriver driver;

    @BeforeClass
    public void launchBrowser() {

        driver = new FirefoxDriver();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
