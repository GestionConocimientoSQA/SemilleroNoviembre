package screenplay.com.amazon.stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class addToCartStepDefinitions {

    @Managed
    WebDriver driver;

    Actor toby = Actor.named("Toby");

    @Before
    public void setupActor(){
        toby.can(BrowseTheWeb.with(driver));
    }

    @Given("that user open page Amazon and search any product")
    public void thatUserOpenPageAmazonAndSearchAnyProduct() {
        toby.attemptsTo(Open.url("https://www.amazon.com/"));
    }
    @When("user click on producttittle and user click on add to cart")
    public void userClickOnProducttittleAndUserClickOnAddToCart() {

    }
    @Then("user can read a message added to cart.")
    public void userCanReadAMessageAddedToCart() {

    }

}
