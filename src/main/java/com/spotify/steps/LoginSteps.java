package com.spotify.steps;
/*
 * @(#) LoginSteps.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import com.spotify.pageObject.LoginPage;
import com.spotify.utils.Data;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import java.util.ArrayList;
import java.util.Map;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class LoginSteps {

    @Page
    LoginPage loginPage;

    @Step
    public void sendCredencials(){
        ArrayList<Map<String, String>> credenciales = Data.extractTo();

        loginPage.getDriver().findElement(loginPage.getTxtUserName())
                .sendKeys(credenciales.get(0).get("Usuario"));

        loginPage.getDriver().findElement(loginPage.getTxtPassword())
                .sendKeys(credenciales.get(0).get("Clave"));
    }

    @Step
    public void clickLogin(){
        loginPage.getDriver().findElement(loginPage.getBtnLogin())
                .getText();

    }
}
