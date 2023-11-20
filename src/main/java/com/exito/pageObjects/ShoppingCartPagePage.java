package com.exito.pageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ShoppingCartPagePage extends PageObject {

    private final By LABEL_NAMEPRODUCT2 = By.xpath("((//div[@class = 'exito-checkout-io-0-x-itemCartContainer']/div)[last()]//span)[2]");

    public By getLABEL_NAMEPRODUCT2() {
        return LABEL_NAMEPRODUCT2;
    }
}
