package com.Ozbey.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionExample {

    @Test
    public void test1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/drag_and_drop");

        Actions actions=new Actions(driver);

        WebElement a=driver.findElement(By.id("column-a"));
        WebElement b=driver.findElement(By.id("column-b"));

        actions.clickAndHold(a).moveToElement(b).perform();

    }


    @Test
    public void hoverOver(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/hovers");

        WebElement person1=driver.findElement(By.xpath("(//img[@src='/img/avatar-blank.jpg'])[1]"));

        Actions actions=new Actions(driver);

        actions.moveToElement(person1).perform();



    }
}
