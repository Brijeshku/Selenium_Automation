package com.thetestingacademy.ex_Selenium.Actions;

import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Action1 {
    EdgeDriver driver;

    @BeforeTest

    public void mouse_event(){
        EdgeOptions options=new EdgeOptions();
        options.addArguments("--guest");
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver=new EdgeDriver(options);
    }
    @Description("verify the actions and mouse event")
    @Test
public void mouse() throws InterruptedException {
        driver.manage().window().maximize();
        String URL="https://awesomeqa.com/practice.html";
        driver.get(URL);
        driver.manage().window().maximize();

        WebElement firstname= driver.findElement(By.name("firstname"));
        //Keyboard click , key down-> shift, send key -key up
        Actions actions=new Actions(driver); // create the an object of class and created paramenterized constructors
        actions.keyDown(Keys.SHIFT).sendKeys(firstname,"sending user name")
                .keyUp(Keys.SHIFT).build().perform();
        Thread.sleep(Long.parseLong("13000"));


    }

    @AfterTest
    public void close_brower(){
        try {
            Thread.sleep(Long.parseLong("3000"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
