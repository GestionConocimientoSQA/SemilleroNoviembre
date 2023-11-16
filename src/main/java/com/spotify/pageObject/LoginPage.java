package com.spotify.pageObject;
/*
 * @(#) LoginPage.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class LoginPage extends PageObject {
    private final By txtUserName = By.id("login-username");
    private final By txtPassword = By.id("login-password");
    private final By btnLogin = By.id("login-button");

    public By getTxtUserName() {
        return txtUserName;
    }

    public By getTxtPassword() {
        return txtPassword;
    }

    public By getBtnLogin() {
        return btnLogin;
    }
}
