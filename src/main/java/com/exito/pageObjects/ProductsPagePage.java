package com.exito.pageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ProductsPagePage extends PageObject {
    private final By LABEL_NAMEPRODUCT = By.xpath("//div[@id = 'gallery-layout-container']/div//h3/span");
    private static By BTN_ADDCART;
    private final By BTN_CART = By.xpath("//a[@class = 'exito-header-3-x-minicartLink']");

    public By getLABEL_NAMEPRODUCT() {
        return LABEL_NAMEPRODUCT;
    }

    public By getBTN_ADDCART() {
        return BTN_ADDCART;
    }

    public By getBTN_CART() {
        return BTN_CART;
    }

    public static void updateBTN_ADDCART(String productName) {
        BTN_ADDCART = By.xpath("(//div[@id = 'gallery-layout-container']/div//h3/span[text()='" + productName + "']/ancestor::article//button)[last()]");
    }
}