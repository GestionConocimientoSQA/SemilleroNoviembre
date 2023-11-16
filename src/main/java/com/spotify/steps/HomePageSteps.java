package com.spotify.steps;
/*
 * @(#) PaginaInicialSteps.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import com.spotify.pageObject.HomePagePage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class HomePageSteps {
    @Page
    HomePagePage homePagePage;

    @Step
    public void openBrowser(){
        homePagePage.openUrl("https://open.spotify.com/");
    }

    @Step
    public void clickOnLogin(){
        homePagePage.getDriver().findElement(homePagePage.getBtnInicioSesion())
                .click();

    }
}
