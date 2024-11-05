package com.thetestingacademy.ex_Selenium.Dom;

import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class table4 {
    EdgeDriver driver;

    @BeforeTest
    public void table4_name(){
        EdgeOptions options=new EdgeOptions();
        options.addArguments("guest");
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver=new EdgeDriver(options);
    }
    @Description("Verify the table")
    @Test
    public void Verify_table(){

        driver.manage().window().maximize();
        String URL= "https://awesomeqa.com/webtable1.html";
        driver.get(URL);
        driver.manage().window().maximize();

        // table- //table[@summary="Sample Table"]/tbody ---->xpath
        // >CSS selector
        //table[summary="Sample Table"]
        //table[summary="Sample Table"] tbody
      WebElement table= driver.findElement(By.xpath("//table[@summary=\"Sample Table\"]/tbody"));
      //Rows and columns
        List<WebElement> rows=driver.findElements(By.tagName("tr"));
        for (int i = 0; i < rows.size(); i++) {
            //System.out.println(rows);

            List<WebElement> col=rows.get(i).findElements(By.tagName("td"));
            for (WebElement c:col){
                System.out.println(c.getText());

            }


        }


    }
}
