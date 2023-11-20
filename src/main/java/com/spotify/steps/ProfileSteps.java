package com.spotify.steps;

import com.spotify.pageObject.ProfilePage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;

public class ProfileSteps {

    @Page
    ProfilePage profilePage;

    @Step("Validar boton de perfil")
    public void validateProfile(){
        Assert.assertTrue(
                profilePage.getDriver().findElement(profilePage.getBtnProfile()).isDisplayed());
    }
}
