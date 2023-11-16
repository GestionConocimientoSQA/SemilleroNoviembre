package com.spotify.steps;

import com.spotify.pageObject.HomePagePage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

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
