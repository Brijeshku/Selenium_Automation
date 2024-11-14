package com.thetestingacademy.ex_Selenium.Actions;

import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class spicejet {
    EdgeDriver driver;
    @BeforeTest
    public void Spice_Jet(){
        EdgeOptions options=new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("guest");
        driver=new EdgeDriver(options);

    }
    @Description("Veriy the mouse event")
    @Test
    public void mmouseactions() throws InterruptedException {
        driver.manage().window().maximize();
        String URL="https://www.spicejet.com/";
        driver.get(URL);
        driver.manage().window().maximize();

         //div[@data-testid="to-testID-origin"]/div/div/input
        WebElement source= driver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]/div/div/input"));
        Actions actions=new Actions(driver);
        actions.moveToElement(source).click().build().perform();

        Thread.sleep(Long.parseLong("5000"));
        source.sendKeys("BLR");
        Thread.sleep(Long.parseLong("3000"));
        WebElement source2=driver.findElement(By.xpath("//div[@data-testid=\"to-testID-destination\"]/div/div/input"));
        Actions actions1=new Actions(driver);
        actions1.moveToElement(source2).click().build().perform();
        Thread.sleep(Long.parseLong("3000"));
 

        source2.sendKeys("DEL");



    }


}
