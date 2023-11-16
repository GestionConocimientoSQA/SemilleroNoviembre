package com.spotify.steps;

import com.spotify.pageObject.HomePagePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class HomePageSteps {

    //Abrir el navegador y hacer clic
    HomePagePage homePagePage = new HomePagePage();

    //Iniciar paso a paso
    @Step
    public void openBrowser(){
        homePagePage.openUrl("https://open.spotify.com/");
    }

    @Step
    public void clickOnLogin(){
        homePagePage.getDriver().findElement(homePagePage.getBtnInicioSesion()).click();
    }


}
