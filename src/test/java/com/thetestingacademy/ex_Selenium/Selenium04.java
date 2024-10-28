package com.thetestingacademy.ex_Selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class Selenium04 {
    public static void main(String[] args) {


        ChromiumDriver driver = new ChromeDriver(); // object created
        driver.get("https://app.vwo.com/"); // if run the program it will automatically a chrome browser will started
    }
}
