package com.thetestingacademy.ex_Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Alerts {
    public static void main(String[] args) {

          WebDriver driver=new EdgeDriver();
          driver.get("https://the-internet.herokuapp.com/javascript_alerts");
          System.out.println(driver.getTitle());
          driver.manage().window().maximize();
         
         ////button[@onclick='jsAlert()']
        ////button[text()='Click for JS Alert']

        //WebElement element= driver.findElement(By.cssSelector("button[onclick='jsAlert()']"));
       //WebElement elementConfirm= driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        WebElement elementPrompt= driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));

      elementPrompt.click();

        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Tony");
        alert.accept();

        String result=driver.findElement(By.id("result")).getText();
        Assert.assertEquals(result,"You entered: Tony");






         




    }
}
