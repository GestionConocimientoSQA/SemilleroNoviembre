package com.spotify.stepDefinitions;

import com.spotify.steps.HomePageSteps;
import com.spotify.steps.LoginSteps;
import com.spotify.steps.ProfileSteps;
import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Steps;

public class LoginSpotifyStepDef {

    @Steps
    HomePageSteps homePageSteps;

    @Steps
    LoginSteps loginSteps;

    @Steps
    ProfileSteps profileSteps;


    @Given("User open the browser")
    public void userOpenTheBrowser() {
        homePageSteps.openBrowser();
    }


    @Given("User do click on button login")
    public void userDoClickOnButtonLogin() {
        homePageSteps.clickOnLogin();
    }


    @When("User insert credentials {string} {string} and click on login")
    public void userInsertCredentialsAndClickOnLogin(String user, String pass) {
        loginSteps.sendCredentials(user,pass);
        loginSteps.clickOnLogin();
    }


    @Then("User can view the profile button")
    public void userCanViewTheProfileButton() {
        profileSteps.validateProfile();
    }
}
