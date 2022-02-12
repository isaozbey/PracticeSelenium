package com.Ozbey.day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderPractice {


    @Test(description = "Verify page title", dataProvider = "testData")
    public void test1(String url, String title){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        Assert.assertTrue(driver.getTitle().equals(title));

    }
    @DataProvider(name = "testData")
    public Object [][] dataProvider(){

        return new Object [][] {{"http://google.com","Google"},{"http://facebook.com","Facebook"},{"http://amazon.com","Amazon"}};
    }
}
