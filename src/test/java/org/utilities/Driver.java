package org.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
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

           case "chrome_headless":
                   WebDriverManager.chromedriver().setup();
                   driverThreadLocal.set(new ChromeDriver(new ChromeOptions().setHeadless(true)));
                   break;
           case "firefox_headless":
                   WebDriverManager.firefoxdriver().setup();
                   driverThreadLocal.set(new FirefoxDriver(new FirefoxOptions().setHeadless(true)));
                   break;

           case "firefox":
                   WebDriverManager.firefoxdriver().setup();
                   driverThreadLocal.set( new FirefoxDriver());
                   break;

           case "remote-chrome":

                   try {
                       DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
                       desiredCapabilities.setBrowserName(BrowserType.CHROME);
                       desiredCapabilities.setCapability("platform",Platform.ANY);
                       driverThreadLocal.set(new RemoteWebDriver(new URL("http://ec2-18-207-144-190.compute-1.amazonaws.com:4444/wd/hub"),desiredCapabilities));
                   } catch (Exception e) {
                       e.printStackTrace();
                   }
                   break;
               case "remote-firefox":

                   try {
                       DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
                       desiredCapabilities.setBrowserName(BrowserType.FIREFOX);
                       driverThreadLocal.set(new RemoteWebDriver(new URL("http://ec2-18-207-144-190.compute-1.amazonaws.com:4444/wd/hub"),desiredCapabilities));
                   } catch (Exception e) {
                       e.printStackTrace();
                   }
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
