package com.spotify.steps;

import com.spotify.pageObject.PaginaInicialPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class PaginaInicialSteps {

    @Page
    PaginaInicialPage paginaprincipalpage;

    @Step
    public void abrirNavegador(){
        paginaprincipalpage.openUrl("https://open.spotify.com/");

    }

    @Step
    public void clickLogin(){
        paginaprincipalpage.getDriver().findElement(paginaprincipalpage.getLnkInicioSesion()).click();
    }

}
