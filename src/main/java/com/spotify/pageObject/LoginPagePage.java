package com.spotify.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPagePage extends PageObject {

    private final By TXT_USUARIO = By.id("login-username");
    private final By TXT_CONTRASENA = By.id("login-password");

    private final By BTN_INICIARSESION = By.xpath("//button[@id = 'login-button']");

    public By getTXT_USUARIO() {
        return TXT_USUARIO;
    }

    public By getTXT_CONTRASENA() {
        return TXT_CONTRASENA;
    }

    public By getBTN_INICIARSESION() {
        return BTN_INICIARSESION;
    }
}
