package com.thetestingacademy.ex_Selenium.Vwo;

import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Login {

    @Description("Verify the login screen")
    @Test
    public void Login() throws InterruptedException {

        WebDriver driver=new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();
        WebElement username= driver.findElement(By.id("login-username"));
        username.sendKeys("bkbk854@gmail.com");
        Thread.sleep(3000);
        WebElement password= driver.findElement(By.id("login-password"));
        password.sendKeys("Tony@1234");
        Thread.sleep(3000);
        WebElement click_login=driver.findElement(By.id("js-login-btn"));
        click_login.click();

    }
}
