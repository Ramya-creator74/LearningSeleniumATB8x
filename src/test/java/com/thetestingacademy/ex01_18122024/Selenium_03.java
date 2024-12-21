package com.thetestingacademy.ex01_18122024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;


public class Selenium_03 {

    @Test
    public void test_Selenium(){

        //EdgeDriver driver = new EdgeDriver();
        // generally we will write like this ,
        // WebDriver driver = new EdgeDriver(); we will like this also WebDriver is daddy and
        // all these are like children.this concept is call dynamic dispatch.
        WebDriver driver = new EdgeDriver();
        WebDriver driver2 = new ChromeDriver();
        WebDriver driver3 = new InternetExplorerDriver();
        WebDriver driver4 = new SafariDriver();
        WebDriver driver5 = new FirefoxDriver();


//        driver.get("https://app.vwo.com");
//        driver.quit();


    }


}
