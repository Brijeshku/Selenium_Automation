package com.thetestingacademy.ex_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Selenium06 {



    @Test
    public void test001(){
        FirefoxDriver driver=new FirefoxDriver();
        driver.get("https://sdet.live");
        driver.quit();




    }
}
