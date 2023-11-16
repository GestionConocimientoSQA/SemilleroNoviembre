package com.spotify.stepDefinitions;
/*
 * @(#) LoginSpotifyStepDef.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import com.spotify.steps.HomePageSteps;
import com.spotify.steps.LoginSteps;
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

    @Given("User open the browser")
    public void userOpenTheBrowser() {
        homePageSteps.openBrowser();

    }
    @Given("user do click on button login")
    public void userDoClickOnButtonLogin() {
        homePageSteps.clickOnLogin();

    }
    @When("User insert credentials and click on login")
    public void userInsertCredentialsAndClickOnLogin() {
        loginSteps.sendCredencials();
        loginSteps.clickLogin();
    }
    @Then("User can view the profile button")
    public void userCanViewTheProfileButton() {

    }
}
