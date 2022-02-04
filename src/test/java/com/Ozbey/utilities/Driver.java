package com.Ozbey.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Driver {

   private static ThreadLocal<WebDriver> driverThreadLocal=new ThreadLocal<>();

   private Driver(){

    }

    public synchronized static WebDriver getDriver(){
       if(driverThreadLocal.get()==null){
          String browser= configurationReader.getProperty("browser");
           switch (browser){
               case "chrome":
                   WebDriverManager.chromedriver().setup();
                   driverThreadLocal.set( new ChromeDriver());
                   break;

           case "firefox":
                   WebDriverManager.firefoxdriver().setup();
                   driverThreadLocal.set( new FirefoxDriver());
                   break;
               case "remote-chrome" :
                   ChromeOptions chromeOptions=new ChromeOptions();
                   chromeOptions.setCapability("platform", Platform.ANY);
                   DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
                   desiredCapabilities.setBrowserName(BrowserType.CHROME);
                   try {
                       driverThreadLocal.set(new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),desiredCapabilities));
                   } catch (MalformedURLException e) {
                       e.printStackTrace();
                   }
               default:
                   throw new RuntimeException("Unimplemet driver type!");
           }


       }

       return driverThreadLocal.get();
    }


    public synchronized static void closeDriver(){
       if (driverThreadLocal.get()!=null){
           driverThreadLocal.get().quit();
           driverThreadLocal.remove();
       }
    }
}
