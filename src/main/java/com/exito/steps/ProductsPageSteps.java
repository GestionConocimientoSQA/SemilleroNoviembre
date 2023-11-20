package com.exito.steps;

import com.exito.models.LabelProduct;
import com.exito.pageObjects.ProductsPagePage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static net.serenitybdd.core.Serenity.getDriver;

public class ProductsPageSteps {


    @Page
    ProductsPagePage productsPagePage;


    @Step("guardar nombre del producto")

    public void engraveProductName(){
        WebDriverWait espera = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
        espera.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(productsPagePage.getLABEL_NAMEPRODUCT()));
        LabelProduct.setNameproduct(productsPagePage.getDriver().findElement(productsPagePage.getLABEL_NAMEPRODUCT()).getText());
    }



    @Step("agregar el producto al carrito")
    public void addProdctCart(){
        productsPagePage.getDriver().findElement(productsPagePage.getBTN_ADDCART()).click();
    }

    @Step("click en la seccion del carrito")
    public void clickCartPage(){
        WebDriverWait espera = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
        espera.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(productsPagePage.getBTN_CART()));
        productsPagePage.getDriver().findElement(productsPagePage.getBTN_CART()).click();
    }

}
