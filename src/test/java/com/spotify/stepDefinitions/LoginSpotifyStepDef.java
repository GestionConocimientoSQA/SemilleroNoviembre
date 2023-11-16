package com.spotify.stepDefinitions;
/*
 * @(#) LoginSpotifyStepDef.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import com.spotify.steps.HomePageSteps;
import com.spotify.steps.LoginSteps;
import com.spotify.steps.ProfileSteps;
import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Steps;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
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
    @Given("user do click on button login")
    public void userDoClickOnButtonLogin() {
        homePageSteps.clickOnLogin();

    }
    @When("User insert credentials {string} {string} and click on login")
    public void userInsertCredentialsAndClickOnLogin(String user, String pssw) {
        loginSteps.sendCredencials(user,pssw);
        loginSteps.clickLogin();
    }
    @Then("User can view the profile button")
    public void userCanViewTheProfileButton() {
        profileSteps.valedateProfile();
    }
}
