package com.Ozbey.day3;

import com.Ozbey.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class JsExecutorExample {

    @Test
    public void test1() throws InterruptedException {

        Driver.getDriver().get("http://practice.cybertekschool.com/");

        WebElement link=Driver.getDriver().findElement(By.linkText("Cybertek School"));

       JavascriptExecutor js= ((JavascriptExecutor) Driver.getDriver());

       Thread.sleep(2000);

       js.executeScript("arguments[0].scrollIntoView(true)",link);

        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);



    }
}
