package org.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.Ignore;
import org.junit.runner.RunWith;
@Ignore
@RunWith(Cucumber.class)
@CucumberOptions(
        features ="@target/rerun.txt",
        glue = "org/step_definitions"
)

public class FailedTestRunner {


}
