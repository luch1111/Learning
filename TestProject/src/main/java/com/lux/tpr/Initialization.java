package com.lux.tpr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Initialization {

    public WebDriver driver;

    @BeforeClass
    public void launchBrowser() {

        //driver = new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver",PropertyHolder.getProperty("wevdriverPath_chrome"));
        driver = new ChromeDriver();

    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
