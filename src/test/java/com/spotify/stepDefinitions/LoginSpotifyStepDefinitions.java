package com.spotify.stepDefinitions;

import com.spotify.steps.HomePageSteps;
import com.spotify.steps.HomeUserSteps;
import com.spotify.steps.LoginPageSteps;
import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Steps;;

public class LoginSpotifyStepDefinitions {
   @Steps
   HomePageSteps homePageSteps;
   @Steps
   LoginPageSteps loginPageSteps;
   @Steps
   HomeUserSteps homeUserSteps;
   @Given("User open the browser")
   public void userOpenTheBrowser() {
       homePageSteps.openTheBrowser();
   }
    @Given("user do click on button login")
    public void userDoClickOnButtonLogin() {
        homePageSteps.clickSignUp();
    }
    @When("User insert credentials {string} {string} and click on login")
    public void userInsertCredentialsAndClickOnLogin(String User, String Password) {
        loginPageSteps.writterCredentials(User, Password);
        loginPageSteps.click_SignUp();
    }
    @Then("User can view the profile button")
    public void userCanViewTheProfileButton() {
       homeUserSteps.validatebutton();
    }
}
