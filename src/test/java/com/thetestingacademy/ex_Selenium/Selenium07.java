package com.thetestingacademy.ex_Selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class Selenium07 {

    public static void main(String[] args) {
          ChromiumDriver driver=new ChromeDriver();
        driver.get("https://app.vwo.com");
    }
}