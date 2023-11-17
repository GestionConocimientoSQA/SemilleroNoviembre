package com.spotify.steps;

import com.spotify.pageObject.HomeUserPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;

public class HomeUserSteps {

    @Page
    HomeUserPage homeUserPage;

    @Step("Validacion del boton de perfil")
    public void validatebutton(){
        Assert.assertTrue(homeUserPage.getDriver().findElement(homeUserPage.getBTN_PERFIL()).isDisplayed());
    }

    @Step("Ir a la pagina open spotify")
    public void openPageSpotify(){
        homeUserPage.getDriver().findElement(homeUserPage.getBTN_OPEN()).click();
    }


}
