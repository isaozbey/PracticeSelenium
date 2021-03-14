package org.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.Driver2;

public class teamGoogle_stepDef {

    WebDriver driver= Driver2.getDriver();

    @Given("User is on the landing page for search")
    public void user_is_on_the_landing_page_for_search() {
        driver.get("http://google.com");
    }



    @When("User type {string} name on the search bar")
    public void user_type_name_on_the_search_bar(String string) {
        WebElement searchBar=driver.findElement(By.name("q"));
        searchBar.sendKeys(string, Keys.ENTER);

    }
    @Then("User able see team {string}")
    public void user_able_see_team(String string) {

        String actualTitle=driver.getTitle();

        Assert.assertEquals(actualTitle,string);


    }
}
