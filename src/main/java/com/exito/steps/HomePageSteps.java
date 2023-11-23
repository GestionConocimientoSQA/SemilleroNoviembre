package com.exito.steps;


import com.exito.models.baseModels;
import com.exito.pageObjects.HomePagePage;
import net.serenitybdd.core.exceptions.NoSuchElementException;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;


public class HomePageSteps extends baseModels {

//extends waitModels
    @Page
    HomePagePage homePagePage;


    @Step("Abrir la pagina de Exito")
    public void openPage(){
        homePagePage.openUrl("https://www.exito.com/");
    }

    @Step("cerrar anuncio por si sale")
    public void closeAdd(){
        try{
            if(homePagePage.getDriver().findElement(homePagePage.getBTN_ADVERTISEMENT()).isDisplayed()){
                homePagePage.getDriver().findElement(homePagePage.getBTN_ADVERTISEMENT()).click();
            }
        }catch(NoSuchElementException ignored){

        }
    }

    @Step("seleccionar una categoria en el menu")
    public void categorieSelect(){
        homePagePage.getDriver().findElement(homePagePage.getBTN_MENU()).click();
        hoverElements(homePagePage.getBTN_CATEGORY());
    }

    @Step("seleccionar una subcategoria del menu")
    public void subcategorieSelect()  {
        waitForElementToBeVisible(homePagePage.getBTN_SUBCATEGORY());
        homePagePage.getDriver().findElement(homePagePage.getBTN_SUBCATEGORY()).click();
    }

}
