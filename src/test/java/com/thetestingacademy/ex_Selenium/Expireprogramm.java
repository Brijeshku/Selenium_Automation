package com.thetestingacademy.ex_Selenium;

import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;

public class Expireprogramm {

    @Description("Verify the the free trial message expire in 7 days in idrive360.com")

    @Test
    public void message_verify() throws InterruptedException {

        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        edgeOptions.addArguments("--start maximized");
        EdgeDriver driver=new EdgeDriver(edgeOptions);
        driver.get("https://www.idrive360.com/enterprise/login");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //username

         //WebElement username_Input= driver.findElement(By.id("username")); for id
//        WebElement username_Input= driver.findElement(By.cssSelector("#username"));
//        WebElement username_Input_xpath= driver.findElement(By.xpath("//input[@id='username']"));
//        WebElement username_Input_cssslector= driver.findElement(By.cssSelector("input[id='username']"));
//        WebElement username_Input_name= driver.findElement(By.name("username"));
        WebElement Username=driver.findElement(By.id("username"));
        Username.sendKeys("bkumar9983@yahoo.in");
        WebElement password= driver.findElement(By.id("password"));
        password.sendKeys("Tony@1234");
        WebElement checkbox=driver.findElement(By.className("id-checkmark"));
        checkbox.click();
        WebElement buttonClick =driver.findElement(By.id("frm-btn"));
        buttonClick.click();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // //div[@id='upgrade']//span[1]
        //WebElement error_message=driver.findElement(By.xpath("//div[@id=\"upgrade\"]//span"));
        //Assert.assertEquals(error_message.getText(),"Your free trial expires in");
//        System.out.println(driver.err);
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement error_message=driver.findElement(By.xpath("//h1[@class='id-plan-title']"));
        Assert.assertEquals(error_message.getText(),"Choose the plan that works best for you");
        driver.quit();
    }
}
