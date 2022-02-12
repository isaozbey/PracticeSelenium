package com.Ozbey.day4;

import com.Ozbey.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class selectPractice {

    @Test
    public void test1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/dropdown");
        WebElement dropdown=driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select select=new Select(dropdown);
        select.selectByVisibleText("Option 1");
        select.selectByValue("2");
        System.out.println(select.getFirstSelectedOption().getAttribute("value"));
    }

    @Test
    public void test2(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/dropdown");
        Select select=new Select(driver.findElement(By.name("Languages")));
        List<WebElement> options =select.getOptions();
        for (WebElement each :options) {
            select.selectByVisibleText(each.getText());
        }
    }
}
