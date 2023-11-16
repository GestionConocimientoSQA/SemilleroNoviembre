package com.spotify.stepDefinitions;

import com.spotify.steps.HomePageSteps;
import com.spotify.steps.LoginSteps;
import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Steps;


public class LoginSpotifyStepDef {

    @Steps
    HomePageSteps homePageSteps;

    @Steps
    LoginSteps loginSteps;

    @Given("User open the browser")
    public void userOpenTheBrowser() {
        homePageSteps.openBrowser();

    }
    @Given("User do click on button login")
    public void userDoClickOnButtonLogin() {
        homePageSteps.clickOnLogin();

    }
    @When("User insert credentials and click  on login")
    public void userInsertCredentialsAndClickOnLogin() {
        loginSteps.sendCredencials();
        loginSteps.clickLogin();

    }
    @Then("User can view the profile button")
    public void userCanViewTheProfileButton() {

    }

}
