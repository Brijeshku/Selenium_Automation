package com.thetestingacademy.ex_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class inputtype {
    public static void main(String[] args) {

        EdgeDriver driver=new EdgeDriver();
        driver.get("https://awesomeqa.com/practice.html");
        //Input box

        driver.findElement(By.name("firstname")).sendKeys("Enter new  name");
        driver.findElement((By.name("lastname"))).sendKeys("lastname enter");
        driver.findElement((By.id("sex-0"))).click();
        driver.findElement((By.id("exp-1"))).click();
        driver.findElement((By.id("profession-0"))).click();
        driver.findElement((By.className("input-xlarge"))).sendKeys("India");





    }
}
