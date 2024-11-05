package com.thetestingacademy.ex_Selenium.Dom;

import jdk.jfr.Description;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class webtable3 {
    EdgeDriver driver;
            @BeforeTest
    public void table3(){

                EdgeOptions options=new EdgeOptions();
                options.addArguments("guest");
                options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                driver=new EdgeDriver(options);
            }

            @Description("Verify the table")
    @Test
    public void table_name(){
        driver.manage().window().maximize();
        String URL="https://awesomeqa.com/webtable.html";
        driver.get(URL);
        driver.manage().window().maximize();

            }
}
