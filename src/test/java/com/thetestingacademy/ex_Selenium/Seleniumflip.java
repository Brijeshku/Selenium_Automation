package com.thetestingacademy.ex_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

public class Seleniumflip {

    @Test
    public void flip_product_list() {


        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        edgeOptions.addArguments("--start maximized");
        EdgeDriver edgeDriver=new EdgeDriver(edgeOptions);
        edgeDriver.get("https://www.flipkart.com/search?q=iphone+15+pro&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_1_12_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_1_12_na_na_na&as-pos=1&as-type=RECENT&suggestionId=iphone+15+pro%7CMobiles&requestId=914e67cc-e511-4d91-83a6-1c1fa13753ea&as-backfill=on");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement Searchbox= edgeDriver.findElement(By.xpath("//input[@class='zDPmFV']"));
        Searchbox.sendKeys("iphone 15 pro");
        //WebElement ClickSearchButton=edgeDriver.findElement()


    }
}