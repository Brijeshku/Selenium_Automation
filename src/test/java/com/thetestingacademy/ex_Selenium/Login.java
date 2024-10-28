package com.thetestingacademy.ex_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class Login {
    public static  void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://app.vwo.com/#/login");

        WebElement username= driver.findElement(By.id("login-username"));
        username.isDisplayed();
        username.isEnabled();
        username.sendKeys("bkbk854@gmail.com");
        WebElement password= driver.findElement(By.id("login-password"));
        password.isDisplayed();
        password.isEnabled();
        password.sendKeys("Tony@1234");

        WebElement loginbutton= driver.findElement(By.id("js-login-btn"));
        loginbutton.isDisplayed();
        loginbutton.isEnabled();
        loginbutton.click();
        String expected_title="SmartSode Introduction";
        String actual_title=driver.getTitle();
      if(expected_title.equals(actual_title)){
          System.out.println("login sucess");
//      }else {
//          System.out.println("failed");
      }

    }
}
