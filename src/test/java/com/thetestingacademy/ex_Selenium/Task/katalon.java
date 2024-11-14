package com.thetestingacademy.ex_Selenium.Task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class katalon {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        if (driver.getPageSource().contains("Make Appointment")){
            System.out.println("It exists");
        }else {
            System.out.println("Does not exists");
        }
        driver.quit();
    }
}
