package com.thetestingacademy.ex_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class Login {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://app.vwo.com");

        WebElement username= driver.findElement(By.id("login-username"));
        username.isDisplayed();
        username.isEnabled();
        username.sendKeys("admin");
        WebElement password= driver.findElement(By.id("login-password"));
        password.isDisplayed();
        password.isEnabled();
        password.sendKeys("admin123");

        WebElement loginbutton= driver.findElement(By.id("Sign in"));
        loginbutton.isDisplayed();
        loginbutton.isEnabled();
        loginbutton.click();
    }
}
