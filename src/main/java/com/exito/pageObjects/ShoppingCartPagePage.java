package com.exito.pageObjects;

import com.exito.models.LabelProduct;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ShoppingCartPagePage extends PageObject {

    private static By LABEL_NAMEPRODUCT2;

    private final By BTN_ALLPRODUCTS = By.xpath("//button[.='Ver todos']");

    public static void updateLABEL_NAMEPRODUCT2() {
        LABEL_NAMEPRODUCT2 = By.xpath("//div[@class = 'exito-checkout-io-0-x-itemCartContainer']//span[text()='" + LabelProduct.getNameproduct() + "']");
    }

    public By getLABEL_NAMEPRODUCT2() {
        return LABEL_NAMEPRODUCT2;
    }

    public By getBTN_ALLPRODUCTS() {
        return BTN_ALLPRODUCTS;
    }
}
