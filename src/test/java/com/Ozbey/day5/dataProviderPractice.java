package com.Ozbey.day5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderPractice {

    @Test(description = "Dataprovider Pratice",dataProvider = "testData")
    public void test1(String url, String title){
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        System.out.println(driver.getTitle());
    }

    @DataProvider(name = "testData")
    public Object [][] dataProvider(){
        return  new Object[][] {{"http://google.com","Google"},
                                {"http://facebook.com","Facebook - Log In or Sign Up"},
                                {"http://etsy.com","Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone"}};
    }
}
