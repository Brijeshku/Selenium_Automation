package com.thetestingacademy.ex_Selenium;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.io.File;

public class extensions {
    public static void main(String[] args) {
        EdgeOptions edgeOptions=new EdgeOptions();

        EdgeDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://sdet.live");

    }
}





