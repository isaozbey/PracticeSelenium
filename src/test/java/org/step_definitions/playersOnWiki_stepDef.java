package org.step_definitions;


import com.Ozbey.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class playersOnWiki_stepDef {

    WebDriver driver= Driver.getDriver();

    @Given("User is  the wiki page")
    public void user_is_the_wiki_page() {

        driver.get("https://en.wikipedia.org/wiki/Main_Page");



    }



    @When("use search players {string}")
    public void use_search_players(String player) {

        WebElement wikiSearch=driver.findElement(By.xpath("//input[@type='search']"));
        wikiSearch.sendKeys(player+ Keys.ENTER);
    }
    @Then("user should be able see  {string}")
    public void user_should_be_able_see(String expected) {

        String actualTitle=driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertEquals(expected,actualTitle);

    }
}
