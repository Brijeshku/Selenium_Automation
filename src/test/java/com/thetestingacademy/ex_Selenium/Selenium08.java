package com.thetestingacademy.ex_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;

public class Selenium08 {
    public static void main(String[] args) {
      WebDriver driver=new EdgeDriver();
      driver.get("https://katalon-demo-cura.herokuapp.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        if(driver.getPageSource().contains("CURA Healthcare Service")) {
            System.out.println("It exists ");

            Assert.assertTrue(true);

            } else {
            Assert.assertTrue(false);
        }
    }
}
