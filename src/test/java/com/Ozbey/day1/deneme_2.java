package com.Ozbey.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class deneme_2 {

    public static void main(String[] args) {

        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("username"));


    }

    @Test
    public void test1() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver =new ChromeDriver();
        driver.get("http://google.com");
        driver.manage().window().fullscreen();
        //driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
        Thread.sleep(4000);


        driver.navigate().to("http://facebook.com");

        System.out.println(driver.getTitle());
        driver.close();
    }

    @Test
    public void test2(){

        WebDriverManager.chromedriver().setup();

        WebDriver driver =new ChromeDriver();
        driver.get("http://google.com");

    }
}
