package com.thetestingacademy.ex_Selenium;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class SeleniumTestng {

    @Test
    public void testMethod() {


        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");
        edgeOptions.addArguments("--window-size=800,600");
        edgeOptions.addArguments("incognito");


        EdgeDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://google.com");


    }
}