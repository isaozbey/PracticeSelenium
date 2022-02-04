package com.Ozbey.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class checkBox_Pratice {

    @Test
    public void test1(){

        System.setProperty("Webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/checkboxes");

        WebElement checkbox= driver.findElement(By.cssSelector("input[type='checkbox']:nth-of-type(1)"));
        checkbox.click();

        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        //driver.close();
    }

    @Test
    public void tets2(){

        System.setProperty("Webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement radio=driver.findElement(By.xpath("//label[.='Red']/preceding-sibling::input"));
        radio.click();
        System.out.println(radio.isSelected());
    }

    @Test
    public void test3(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();



    }
}
