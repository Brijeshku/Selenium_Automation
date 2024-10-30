package com.thetestingacademy.ex_Selenium;

import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Ebay {


    @Description("verify the ebay print the all price list")
    @Test
    public void print_all_price_list(){

        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        edgeOptions.addArguments("--start maximized");
        EdgeDriver edgeDriver=new EdgeDriver(edgeOptions);
        edgeDriver.get("https://www.ebay.com/b/Desktops-All-In-One-Computers/171957/bn_1643067");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement Search_box= edgeDriver.findElement(By.id("gh-ac"));
        Search_box.sendKeys("macmini");

        WebElement  clickButton=edgeDriver.findElement(By.id("gh-btn"));
        clickButton.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        }
// Print all titles
        List<WebElement> item_list=edgeDriver.findElements(By.xpath("//div[@class='s-item__title']/span"));
        List<WebElement> price_list=edgeDriver.findElements(By.xpath("//span[@class='s-item__price']"));

      int size= Math.min(item_list.size(),price_list.size());
        for (int i = 0; i <size ; i++) {
            System.out.println("Title: "+item_list.get(i).getText()+ "||"+"Price:"+price_list.get(i).getText());
            System.out.println();
            // Min and max price


        }


    }
}
