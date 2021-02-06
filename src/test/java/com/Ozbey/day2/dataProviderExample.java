package com.Ozbey.day2;

import com.Ozbey.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class dataProviderExample {

    WebDriver driver= Driver.getDriver();



    @Ignore
    @Test(description = "dataProviderExample", dataProvider = "data")
    public void test1(String value1,String title){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://google.com");
        WebElement search=driver.findElement(By.name("q"));



        search.sendKeys(value1, Keys.ENTER);

         String expected=driver.getTitle();

        Assert.assertEquals(title,expected);

    }


    @DataProvider(name = "data")
    public Object[][] dataProvider(){

        return  new Object[][] {{"Sergen Yalcin","Sergen Yalcin"},{"Cenk Tosun","Cenk Tosun"},{"Cyle Larin","Cyle Larin"}};
    }


    @Test(description = "dataProvider2",dataProvider ="data2")
    public  void test2(String value){



        driver.get("https://google.com");
        WebElement search=driver.findElement(By.name("q"));

        search.sendKeys(value,Keys.ENTER);

    }

    @DataProvider(name = "data2")
    public Object[] dataProvider2(){
        return  new Object[] {"Sergen","Burak","Atiba"};
    }

   @Ignore
    @Test(description = "paramater" )
    @Parameters("test")
    public void test3(String test){

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://google.com");
        WebElement search=driver.findElement(By.name("q"));

        search.sendKeys(test,Keys.ENTER);
    }
}
