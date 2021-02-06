package com.Ozbey.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class JsExecutorExample {

    @Test
    public void test1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/");

        WebElement link=driver.findElement(By.linkText("Cybertek School"));


      JavascriptExecutor js= (JavascriptExecutor) driver;
      js.executeScript("arguments[0].scrollIntoView(true);" + "arguments[0].click",link);

    }
}
