package com.spotify.steps;

import com.spotify.pageObject.FindSoundPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;

public class FindSoundSteps {

    @Page
    FindSoundPage findsoundpage;

    @Step
    public void clicBtnBusqueda(){
        findsoundpage.getDriver().findElement(findsoundpage.getBtnBuscar()).click();
    }

    @Step
    public void ingresarCancionABuscar(){
        findsoundpage.getDriver().findElement(findsoundpage.getTxtCancionaABuscar()).sendKeys("Maná");

    }

    @Step
    public void validarCancionBuscada(){
        Assert.assertEquals(
                findsoundpage.getDriver().findElement(findsoundpage.getTxtCancionBuscada()).getText(),"Maná"
        );

    }

}
