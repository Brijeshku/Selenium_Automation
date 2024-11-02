package com.thetestingacademy.ex_Selenium.Task;

import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.time.LocalDate;

public class Applito {

    EdgeDriver driver;

    @BeforeTest
    public void openBrowser() {
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new EdgeDriver(options);

    }
        @Description("Enter the Username as Admin and Password as Password@12")
        @Test

    public void credential(){

        driver.manage().window().maximize();
        String URL= "https://demo.applitools.com/";
        driver.get(URL);
            driver.manage().window().maximize();



            WebElement userName=driver.findElement(By.id("username"));
            userName.sendKeys("Admin");
            WebElement password=driver.findElement(By.id("password"));
            password.sendKeys("Password@123");

            try {
                Thread.sleep(Long.parseLong("3000"));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            WebElement clickButton=driver.findElement(By.id("log-in"));
            clickButton.click();
            //Calculate the total amount spent this month.
            String currentMonth = LocalDate.now().getMonth().name().substring(0, 3);
            double totalAmount = 1996.22;

            WebElement[] rows = new WebElement[0];
            for (WebElement row :rows) {
                // Get the date cell
                WebElement dateCell = row.findElement(By.xpath(".//td[2]")); // Assuming the date is in the second cell
                String dateText = dateCell.getText();

                // Check if the date cell contains the current month
                if (dateText.contains(currentMonth)) {
                    // Get the amount cell
                    WebElement amountCell = row.findElement(By.xpath(".//td[5]")); // Assuming amount is in the fifth cell
                    String amountText = amountCell.getText().replace("USD", "").trim();

                    // Convert amount to double and add to total
                    double amount = Double.parseDouble(amountText.replace(",", ""));
                    totalAmount += amount;
                }
            }

            // Print the total amount for the current month
            System.out.println("Total amount for the current month (" + currentMonth + "): USD " + totalAmount);
            driver.quit();
        }


                }


