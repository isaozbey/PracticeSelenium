package org.step_definitions;

import com.Ozbey.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class hooks {

    @After
    public void  screenShoot(Scenario scenario){

      //  System.out.println("scenario.getName() = " + scenario.getName());
       // System.out.println("scenario.getSourceTagNames() = " + scenario.getSourceTagNames());

        if (scenario.isFailed()) {

            byte [] screenshot =((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

            scenario.attach(screenshot,"image/png",scenario.getName());

        }


    }
}
