package com.thetestingacademy.ex_Selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium05 {
    public static void main(String[] args) {
        FirefoxDriver driver=new FirefoxDriver(); // It will converted in HTTP to create a session
        driver.get("https://app.vwo.com/");
    }
}
