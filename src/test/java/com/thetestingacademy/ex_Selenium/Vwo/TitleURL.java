package com.thetestingacademy.ex_Selenium.Vwo;

import jdk.jfr.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TitleURL {

    @Description("Verify if the use login sucessfully")
    @Test

    public void Login() {

        WebDriver driver = new EdgeDriver();

        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();
        // Print title
        System.out.println(driver.getTitle());
        // Print URL
        System.out.println(driver.getCurrentUrl());
        if (driver.getPageSource().contains("Sign in to VWO platform")) {
            System.out.println("Verified");
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);

        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
