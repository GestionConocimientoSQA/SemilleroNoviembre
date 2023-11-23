package com.exito.steps;

import com.exito.models.LabelProduct;
import com.exito.models.baseModels;
import com.exito.pageObjects.ShoppingCartPagePage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;

public class ShoppingCartPageSteps extends baseModels {


    @Page
    ShoppingCartPagePage shoppingCartPagePage;


    @Step("Validar existencia del producto en el carrito de compras")
    public void validateProductoInShoppingCart(){
        ShoppingCartPagePage.updateLABEL_NAMEPRODUCT2();
        Assert.assertEquals(
                shoppingCartPagePage.getDriver().findElement(shoppingCartPagePage.getLABEL_NAMEPRODUCT2()).getText(),
                LabelProduct.getNameproduct()
        );
        System.out.println(shoppingCartPagePage.getDriver().findElement(shoppingCartPagePage.getLABEL_NAMEPRODUCT2()).getText());
    }
}
