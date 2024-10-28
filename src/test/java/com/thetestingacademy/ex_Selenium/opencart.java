package com.thetestingacademy.ex_Selenium;

import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class opencart {

    @Description("verify the tile")

    @Test

    public void open_registration(){

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");
        WebDriver driver = new EdgeDriver(edgeOptions);

        driver.navigate().to("https://www.opencart.com");
        System.out.println(driver.getTitle());
        //System.out.println(driver.getTitle());
        //Assert.assertEquals(driver.getTitle(), "Login - VWO");
       // Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");
        WebElement partiallinktext = driver.findElement(By.className("btn btn-black navbar-btn"));

   partiallinktext.click();
        driver.quit();

    }
}