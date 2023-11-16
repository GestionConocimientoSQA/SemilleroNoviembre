package com.spotify.steps;
/*
 * @(#) ProfileSteps.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import com.spotify.pageObject.ProfilePage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class ProfileSteps {
    @Page
    ProfilePage profilePage;

    @Step("Validacion del boton de perfil")
    public void valedateProfile(){

        Assert.assertTrue(
              profilePage.getDriver().findElement(profilePage.getBtnProfile()).isDisplayed()
        );

    }
}
