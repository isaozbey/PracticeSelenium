
package gov.ozbey;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.utilities.configurationReader;

public class Driver {

    //1-Make constructor private
    private Driver(){
    }

    private static WebDriver driver;
    static DesiredCapabilities desiredCap=new DesiredCapabilities();

    public static WebDriver getDriver(){

        if (driver == null){
            String browser = configurationReader.getProperty("browser");

            switch (browser){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "remote-driver":
                    desiredCap.setCapability("platform", Platform.WINDOWS);
                    desiredCap.setCapability("browser","chrome");
            }
        }

        return driver;

    }


}