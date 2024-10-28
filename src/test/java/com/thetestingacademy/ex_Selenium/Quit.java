package com.thetestingacademy.ex_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Quit {
    public static void main(String[] args) {

    EdgeDriver driver=new EdgeDriver();
        driver.get("driver.get(https://app.vwo.com");
        driver.quit();
        // Means close the window
    }
}
