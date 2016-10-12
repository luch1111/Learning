package com.lux.tpr.tests;

import com.lux.tpr.Initialization;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenGoogle extends Initialization {

    @Test
    public void openGoogle() {

        driver.get("http://google.com");
        Assert.assertTrue(driver.getTitle().contains("Google"));
    }
}
