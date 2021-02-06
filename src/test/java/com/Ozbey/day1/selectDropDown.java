package com.Ozbey.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class selectDropDown {


    @Test
    public void testSelect() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/dropdown");

        Select select =new Select(driver.findElement(By.id("dropdown")));
        select.selectByVisibleText("Option 1");

        Thread.sleep(2000);

        Select selectState=new Select(driver.findElement(By.id("state")));
        selectState.selectByVisibleText("District Of Columbia");

        String expected="District Of Columbia";
        String actual=selectState.getFirstSelectedOption().getText();

        System.out.println("expected = " + expected);
        System.out.println("actual = " + actual);


    }
}
