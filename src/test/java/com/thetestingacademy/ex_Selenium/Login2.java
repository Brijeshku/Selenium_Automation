package com.thetestingacademy.ex_Selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Login2 {
    public static void main(String[] args) {


        FirefoxDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com");
    }
}
