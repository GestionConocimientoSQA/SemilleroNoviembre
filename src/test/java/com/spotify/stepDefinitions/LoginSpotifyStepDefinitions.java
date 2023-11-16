package com.spotify.stepDefinitions;


import com.spotify.steps.HomePageSteps;
import com.spotify.steps.LoginPageSteps;
import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Steps;

public class LoginSpotifyStepDefinitions {

    @Steps
    HomePageSteps homePageSteps;
    @Steps
    LoginPageSteps loginPageSteps;

    @Given("User open the browser")
    public void userOpenTheBrowser() {
        homePageSteps.openTheBrowser();
    }
    @Given("user do click on button login")
    public void userDoClickOnButtonLogin() {
        homePageSteps.clickSignUp();
    }
    @When("User insert credentials and click on login")
    public void userInsertCredentialsAndClickOnLogin() {
        loginPageSteps.writterCredentials();
        loginPageSteps.click_SignUp();
    }
    @Then("User can view the profile button")
    public void userCanViewTheProfileButton() {

    }


}
