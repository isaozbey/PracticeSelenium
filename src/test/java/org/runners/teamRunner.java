package org.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
  features = "src/test/resources/feature",
  glue = "org/step_definitions",
  dryRun = false,
  plugin = "html:target/teamCucumberReports.html"  ,
  tags = "test"
)

public class teamRunner {


}
