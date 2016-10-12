package com.lux.tpr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class Initialization {

    public WebDriver driver;

    @BeforeClass
    public void launchBrowser() throws MalformedURLException {

        if (PropertyHolder.getProperty("seleniumServer").equals("on")) {
            driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome());
        } else {
            System.setProperty("webdriver.chrome.driver",PropertyHolder.getProperty("webdriverPath"));
            driver = new ChromeDriver();
        }

    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
