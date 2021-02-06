package org.step_definitions;

import com.Ozbey.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class dataTable_StepDef {

    @Given("User is on the landing page")
    public void user_is_on_the_landing_page() {

        Driver.getDriver().get("http://google.com");


    }



    @When("User search {string}")
    public void user_search(String string) {

        WebElement search=Driver.getDriver().findElement(By.name("q"));

        search.sendKeys(string + Keys.ENTER);

    }

    @Then("User should see  title")
    public void user_should_see_title(List<String> dataTable) {

       dataTable.forEach(p -> {System.out.println(p);});



    }
}
