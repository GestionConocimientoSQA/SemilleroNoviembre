package com.exito.steps;

import com.exito.models.LabelProduct;
import com.exito.models.baseModels;
import com.exito.pageObjects.ProductsPagePage;
import com.exito.utils.RandomNum;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebElement;
import java.util.List;

public class ProductsPageSteps extends baseModels {



    @Page
    ProductsPagePage productsPagePage;


    @Step("guardar nombre del producto")

    public void engraveProductName(){
        waitForElementToBeVisible(productsPagePage.getLABEL_NAMEPRODUCT());
        List<WebElement> nameProduct = productsPagePage.getDriver().findElements(productsPagePage.getLABEL_NAMEPRODUCT());
        LabelProduct.setNameproduct(nameProduct.get(RandomNum.randomNumberInRange(0, nameProduct.size())).getText());
    }



    @Step("agregar el producto al carrito")
    public void addProdctCart(){
        ProductsPagePage.updateBTN_ADDCART(LabelProduct.getNameproduct());
        productsPagePage.getDriver().findElement(productsPagePage.getBTN_ADDCART()).click();
    }

    @Step("click en la seccion del carrito")
    public void clickCartPage(){
        waitForElementToBeClickable(productsPagePage.getBTN_CART());
        productsPagePage.getDriver().findElement(productsPagePage.getBTN_CART()).click();
    }

}
