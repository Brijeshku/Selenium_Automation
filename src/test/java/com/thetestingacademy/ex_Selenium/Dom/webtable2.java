package com.thetestingacademy.ex_Selenium.Dom;

import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.util.List;

public class webtable2 {

    EdgeDriver driver;

    @BeforeTest
    public void table_record(){

        EdgeOptions options=new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver=new EdgeDriver(options);
    }
    @Description("verify the total rows and column")
    @Test
    public void tabel_QA_table(){
        driver.manage().window().maximize();
        String URL="https://awesomeqa.com/webtable.html";
        driver.get(URL);
        driver.manage().window().maximize();

        WebElement table_record= driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody"));

        List<WebElement> rows_table=driver.findElements(By.tagName("tr"));

        for (int i = 0; i <rows_table.size() ; i++) {

            List<WebElement> col=rows_table.get(i).findElements(By.tagName("td"));
            for (WebElement c:col){
                System.out.println(c.getText());
                System.out.println(rows_table);
                System.out.println(col);

            }

        }
        }






    }









