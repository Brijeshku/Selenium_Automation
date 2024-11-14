package com.thetestingacademy.ex_Selenium.Task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Proxy {
    public static void main(String[] args) {

        EdgeOptions edgeOptions=new EdgeOptions();

        Proxy proxy=new Proxy();
        proxy.setHttpProxy("103.148.64.29");
        edgeOptions.setCapability("prxoy",proxy);
    }

    private void setHttpProxy(String s) {
    }

}

