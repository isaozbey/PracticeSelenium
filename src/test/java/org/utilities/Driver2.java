package org.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver2 {

   private static ThreadLocal<WebDriver> driverThreadLocal=new ThreadLocal<>();

   private Driver2(){

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
               default:
                   throw new RuntimeException("Unimplemet driver type!");
           }


       }

       return driverThreadLocal.get();
    }


    public synchronized static void closeDriver(){
       if (driverThreadLocal.get()!=null){
           driverThreadLocal.get().quit();
           driverThreadLocal.get().close();
       }
    }
}
