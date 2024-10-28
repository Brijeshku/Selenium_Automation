package com.thetestingacademy.ex_Selenium;

import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium09 {
    @Description("Verify the invalid message with invalid credential  ")
    @Test
    public void _vwo_message () throws InterruptedException {

        //•	TC (Negative) - Invalid username, pass - Error message
        //•	Open the URL .app.vwo.com/#/login](https://app.vwo.com/#/login)
        //•	Find the Email id** and enter the email as admin@admin.com
        //•	Find the pass inputbox** and enter password as admin.
        //•	Find and Click on the submit button
        //•	Verify that the error message is shown "Your email, password,
        // IP address or location did not match".
        //<input type="email" class="text-input W(100%)" name="username" id="login-username" data-qa="hocewoqisi">
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");
      //  edgeOptions.addArguments("--guest"); // when we are not sign in

        // Find element -> 1 element means first web element
        // find elements -Which can find multiple elements
        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.navigate().to("https://app.vwo.com");
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");
        // find the email input box
        WebElement emailInputBox = driver.findElement(By.id("login-username"));
        emailInputBox.sendKeys("bkbk854@gmail.com");
        WebElement passwordInput=driver.findElement(By.name("password"));
        passwordInput.sendKeys("pass@1234");
        WebElement  buttonSubmit=driver.findElement(By.id("js-login-btn"));
        buttonSubmit.click();
        //After 3 seconds error message will come.
        Thread.sleep(3000);
        WebElement errorMessage=driver.findElement(By.className("notification-box-description"));
        Assert.assertEquals(errorMessage.getText(),"Your email, password, IP address or location did not match");

      driver.quit();
    }
}
