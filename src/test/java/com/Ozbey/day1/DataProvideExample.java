package com.Ozbey.day1;

import com.Ozbey.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class DataProvideExample {


    @Test(description = "Open web page", dataProvider="testData")
    public void test1(String url){
        WebDriver driver=Driver.getDriver();
        driver.get(url);

    }


    @DataProvider(name = "testData")
    public Object[] dataProvider(){

        return new Object[] {"https://google.com","https://facebook.com","https://amazon.com"};
    }
}
