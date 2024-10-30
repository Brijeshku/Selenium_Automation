package com.thetestingacademy.ex_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownhandles {
    public static void main(String[] args) {

        WebDriver driver=new EdgeDriver();

        driver.get("https://the-internet.herokuapp.com/dropdown");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();

        WebElement element=driver.findElement(By.id("dropdown"));
        Select select=new Select(element);
        //select.selectByVisibleText("Option 1");
      //  select.selectByVisibleText("Option 2");
        select.selectByIndex(1);

    }
}
