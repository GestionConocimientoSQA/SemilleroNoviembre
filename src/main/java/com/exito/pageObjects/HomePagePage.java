package com.exito.pageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePagePage extends PageObject {

    private final By BTN_ADVERTISEMENT = By.xpath("//*[@id='wps-overlay-close-button']");
    private final By BTN_CATEGORY = By.xpath("//li[@id ='undefined-nivel2-Tecnología']");
    private final By BTN_MENU = By.xpath("//div[@class = 'exito-category-menu-3-x-button']/button");
    private final By BTN_SUBCATEGORY = By.xpath("//a[@href='/tecnologia/drones']");

    public By getBTN_CATEGORY() {
        return BTN_CATEGORY;
    }

    public By getBTN_SUBCATEGORY() {
        return BTN_SUBCATEGORY;
    }

    public By getBTN_MENU() {
        return BTN_MENU;
    }

    public By getBTN_ADVERTISEMENT() {
        return BTN_ADVERTISEMENT;
    }
}
