package com.spotify.pageObject;
/*
 * @(#) ProfilePage.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class ProfilePage extends PageObject {
    private final By btnProfile = By.xpath("//button[@data-testid='user-widget-link']");

    public By getBtnProfile() {
        return btnProfile;
    }
}
