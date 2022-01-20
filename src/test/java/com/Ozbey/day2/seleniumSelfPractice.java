package com.Ozbey.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class seleniumSelfPractice {


    @Test
    public void setup(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://etsy.com");
        driver.manage().window().maximize();
        //driver.navigate().back();
        System.out.println(driver.findElement(By.id("global-enhancements-search-query")).getAttribute("name"));



    }

    @Test
    public void test1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/dropdown");

        Select select=new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        select.selectByValue("1");
        System.out.println("select.getFirstSelectedOption() = " + select.getFirstSelectedOption().getText());

    }

    @Test
    public void test2() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.switchTo().alert().sendKeys("");
    }
}
