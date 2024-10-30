package com.thetestingacademy.ex_Selenium.ex_SVG;

import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class Project1 {

    EdgeDriver driver;

    @BeforeTest
    public void OpenBrowser(){
        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
    edgeOptions.addArguments("guest");
    driver=new EdgeDriver(edgeOptions);

    }

    @Description("Verify that after  search icon in flipkart")
    @Test

    public void flipkart_Search(){

        driver.manage().window().maximize();
        String URL="https://www.flipkart.com/";
        driver.get(URL);
        driver.manage().window().maximize();

       //Step 1 - Enter the "macnmini" in the inputbox.
        driver.findElement(By.name("q")).sendKeys("macmini");

        // Step 2 - Click on the svg element.

        List<WebElement> svgelements=driver.findElements(By.xpath("//*[name()='svg']"));
        svgelements.get(0).click();
        List<WebElement> find_title=driver.findElements(By.xpath("//div[contains(@data-id, 'CPU')]/div/a"));
        for (WebElement title:find_title){
            System.out.println(title.getText());
        }
    }
    @AfterTest
    public void CloseBrowser(){
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        driver.quit();

    }

}
