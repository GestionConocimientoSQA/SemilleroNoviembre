package com.spotify.steps;

import com.spotify.pageObject.HomePagePage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class HomePageSteps {
    //instaciamos la clase de una forma diferente
    @Page
    HomePagePage paginaInicialPage;

    @Step
    public void openTheBrowser(){

        paginaInicialPage.openUrl("https://www.spotify.com/co-es/premium");
    }

    @Step
    public void clickSignUp(){

        paginaInicialPage.getDriver().findElement(paginaInicialPage.getBTN_INICIOSESION()).click();
    }


}
