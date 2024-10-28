package com.thetestingacademy.ex_Selenium;

import jdk.jfr.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v127.page.model.WebAppManifest;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Project1 {

    @Description("To verify the title of the page")
    @Test
    public void main_vwo_login_tile(){

        EdgeOptions edgeOptions=new EdgeOptions();
        //edgeOptions.addArguments("--start-maximized");
        WebDriver driver=new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com/");
        driver.manage().window().maximize();
        Assert.assertEquals(driver.getTitle(),"Login - VWO");
        // Verify the URL
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");

        driver.quit();

    }
}
