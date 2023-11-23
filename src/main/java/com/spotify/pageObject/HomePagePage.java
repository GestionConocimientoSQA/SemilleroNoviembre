package com.spotify.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePagePage extends PageObject {

    private final By BTN_INICIOSESION = By.xpath("//a[starts-with(text(),'Iniciar')]");

    public By getBTN_INICIOSESION() {
        return BTN_INICIOSESION;
    }
}
