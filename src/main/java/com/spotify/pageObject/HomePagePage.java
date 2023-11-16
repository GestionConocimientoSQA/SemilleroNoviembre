package com.spotify.pageObject;
/*
 * @(#) PaginaInicialPage.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class HomePagePage extends PageObject {
    private final By btnInicioSesion = By.xpath("//button[@data-testid='login-button']");

    public By getBtnInicioSesion() {
        return btnInicioSesion;
    }
}
