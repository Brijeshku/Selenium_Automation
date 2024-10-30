package com.thetestingacademy.ex_Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Trip {


    @Description("Validate the correct popup in given wait coditions")
    @Test

    public void wait_popup(){

        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("incognito");
        edgeOptions.addArguments("--start maximized");
        WebDriver driver=new EdgeDriver(edgeOptions);

        driver.get("https://www.makemytrip.com/");
        System.out.println(driver.getTitle());

        //WebElement error_message= driver.findElement(By.class);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy='closeModal']")));
        WebElement CloseModal=driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
        CloseModal.click();

        try {
            Thread.sleep(10000);
        } catch (Exception e) {
            throw new RuntimeException(e);

        }
        driver.quit();

    }
}
