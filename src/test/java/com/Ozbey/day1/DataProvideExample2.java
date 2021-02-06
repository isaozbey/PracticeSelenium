package com.Ozbey.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvideExample2 {


    @Test(description = "Open web page", dataProvider="testData")
    public void test1(String url){

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

      driver.get(url);




    }


    @DataProvider(name = "testData")
    public Object[] dataProvider(){

        return new Object[] {"https://google.com","https://facebook.com","https://amazon.com"};
    }
}
