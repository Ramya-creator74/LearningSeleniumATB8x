package com.thetestingacademy.ex01_18122024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Selenium_04 {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://sdet.live");
        driver = new InternetExplorerDriver();
        driver.get("https://sdet.live");
        driver.quit();
    }

}
