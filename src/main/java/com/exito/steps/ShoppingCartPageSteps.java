package com.exito.steps;

import com.exito.models.LabelProduct;
import com.exito.pageObjects.ShoppingCartPagePage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static net.serenitybdd.core.Serenity.getDriver;

public class ShoppingCartPageSteps {


    @Page
    ShoppingCartPagePage shoppingCartPagePage;


    @Step("Validar existencia del producto en el carrito de compras")
    public void validateProductoInShoppingCart(){
        WebDriverWait espera = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
        espera.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(shoppingCartPagePage.getLABEL_NAMEPRODUCT2()));
        Assert.assertEquals(
                shoppingCartPagePage.getDriver().findElement(shoppingCartPagePage.getLABEL_NAMEPRODUCT2()).getText(),
                LabelProduct.getNameproduct()
        );
    }
}
