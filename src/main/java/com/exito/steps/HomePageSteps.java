package com.exito.steps;


import com.exito.pageObjects.HomePagePage;
import net.serenitybdd.core.exceptions.NoSuchElementException;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static net.serenitybdd.core.Serenity.getDriver;


public class HomePageSteps  {



    @Page
    HomePagePage homePagePage;



    @Step("Abrir la pagina de Exito")
    public void openPage(){
        homePagePage.openUrl("https://www.exito.com/");
    }

    @Step("cerrar anuncio por si sale")
    public void closeAdd(){
        try{
            WebElement add = homePagePage.getDriver().findElement(homePagePage.getBTN_ADVERTISEMENT());
            if(add.isDisplayed()){
                add.click();
            }
        }catch(NoSuchElementException ignored){

        }
    }

    @Step("seleccionar una categoria en el menu")
    public void categorieSelect(){
        Actions actions = new Actions(getDriver());
        homePagePage.getDriver().findElement(homePagePage.getBTN_MENU()).click();
        actions.moveToElement(homePagePage.getDriver().findElement(homePagePage.getBTN_CATEGORY())).perform();
    }

    @Step("seleccionar una subcategoria del menu")
    public void subcategorieSelect()  {
        WebDriverWait espera = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
        espera.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(homePagePage.getBTN_SUBCATEGORY()));
        homePagePage.getDriver().findElement(homePagePage.getBTN_SUBCATEGORY()).click();
    }

}
