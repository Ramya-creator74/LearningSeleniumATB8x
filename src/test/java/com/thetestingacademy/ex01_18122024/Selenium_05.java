package com.thetestingacademy.ex01_18122024;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Selenium_05 {
    public static void main(String[] args) {
        EdgeOptions edgeOptions = new EdgeOptions();
       // edgeOptions.addArguments("--window-size=1920,1080");
        edgeOptions.addArguments("--headless");


        EdgeDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://google.com");
        System.out.println(driver.getTitle());
    }
}
