package com.thetestingacademy.ex_Selenium;

import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium010 {
    @Description("Verify the invalid message with invalid credential  ")
    @Test
    public void _vwo_message () throws InterruptedException {


        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.navigate().to("https://app.vwo.com");
        System.out.println(driver.getTitle());
      //  WebElement linktext = driver.findElement(By.linkText("Start a free trial"));
        WebElement partiallinktext = driver.findElement(By.partialLinkText("free trial"));

partiallinktext.click();

        Thread.sleep(3000);
        driver.quit();
    }
}
