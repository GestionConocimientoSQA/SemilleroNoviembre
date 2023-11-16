package com.spotify.steps;
/*
 * @(#) LoginSteps.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import com.spotify.pageObject.LoginPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class LoginSteps {

    @Page
    LoginPage loginPage;

    @Step
    public void sendCredencials(String user, String pssw){
        loginPage.getDriver().findElement(loginPage.getTxtUserName())
                .sendKeys(user);

        loginPage.getDriver().findElement(loginPage.getTxtPassword())
                .sendKeys(pssw);
    }

    @Step
    public void clickLogin(){
        loginPage.getDriver().findElement(loginPage.getBtnLogin())
                .click();

    }
}
