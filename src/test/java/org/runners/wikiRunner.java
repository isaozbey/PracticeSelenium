package org.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.Ignore;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/feature",
        glue  = "org/step_definitions",
        dryRun = false,
        plugin = {"html:target/cucumberWiki.html","rerun:target/rerun.txt"},
        tags = "@smoke"

)
public class wikiRunner {
}
