package com.spotify.steps;

import com.spotify.pageObject.HomeOpenPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class HomeOpenSteps {

    @Page
    HomeOpenPage homeOpenPage;

    @Step("Click en boton buscar")

    public void clickSearch(){
        homeOpenPage.getDriver().findElement(homeOpenPage.getBTN_BUSCAR()).click();
    }

}
