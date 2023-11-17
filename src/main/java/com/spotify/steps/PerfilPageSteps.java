package com.spotify.steps;

import com.spotify.pageObject.PerfilPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;

public class PerfilPageSteps {

    @Page
    PerfilPage perfilpage;

    @Step("validar boton perfil")
    public void validarPerfil(){
        Assert.assertTrue(
                perfilpage.getDriver().findElement(perfilpage.getLnkPerfil()).isDisplayed()
        );
    }

}
