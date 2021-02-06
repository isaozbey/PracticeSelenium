package org.step_definitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.utilities.*;



public class playersOnGoogle_stepDef {


    WebDriver driver= Driver.getDriver();
    @Given("User is on the google page")
    public void user_is_on_the_google_page() {
        driver.get(configurationReader.getProperty("url"));
    }


    @When("User type soccer players {string}")
    public void user_type_soccer_players(String player) {
        WebElement search=driver.findElement(By.name("q"));
        search.sendKeys(player+ Keys.ENTER);
    }
    @Then("User should be able to player {string}")
    public void user_should_be_able_to_player(String expected) {
        String actualTitle=driver.getTitle();

        Assert.assertEquals(expected,actualTitle);

    }

}
