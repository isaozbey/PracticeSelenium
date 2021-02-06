package com.Ozbey.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageExample {

    public PageExample(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "")
    public WebElement test;
}
