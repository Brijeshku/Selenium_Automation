package com.thetestingacademy.ex_Selenium;

import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.function.Function;

public class fluentwait {

    @Description("Verify the popup with fluent wait")
    @Test

    public void popup_fluent(){

        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("incognito");
        edgeOptions.addArguments("--start maximized");

        WebDriver driver=new EdgeDriver(edgeOptions);
        driver.navigate().to("https://app.vwo.com");
        System.out.println(driver.getTitle());

        Assert.assertEquals(driver.getTitle(), "Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");

        WebElement emailInputBox = driver.findElement(By.id("login-username"));
        emailInputBox.sendKeys("bkbk854@gmail.com");
        WebElement passwordInputBox = driver.findElement(By.name("password"));
        passwordInputBox.sendKeys("Tony@1234");
        WebElement buttonSubmit = driver.findElement(By.id("js-login-btn"));
        buttonSubmit.click();


        FluentWait<WebDriver> wait=new FluentWait<>(driver)
                 .withTimeout(Duration.ofSeconds(10))
                 .pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);



        WebElement error_message  = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath("notification-box-description"));
            }
        });

        Assert.assertEquals(error_message.getText(),"your email and password ");




    }
}
