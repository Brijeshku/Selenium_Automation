package com.thetestingacademy.ex_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Seleniummultibrowsers08 {

    public static void main(String[] args) {

        WebDriver driver=new EdgeDriver();
        driver.get("https://app.vwo.com");

        WebDriver driver1=new FirefoxDriver();
        driver1.get("https://app.vwo.com");

        WebDriver driver2=new ChromeDriver();
        driver2.get("https://app.vwo.com");

    }
}
