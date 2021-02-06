package com.Ozbey.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class waitExample {

    @Test
    public void test1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();

        WebDriverWait wait=new WebDriverWait(driver,10);


    }
}
