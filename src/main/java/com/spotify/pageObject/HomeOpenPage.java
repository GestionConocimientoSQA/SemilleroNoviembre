package com.spotify.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomeOpenPage extends PageObject {

    private final By BTN_BUSCAR = By.xpath("//a[@aria-label='Buscar']");

    public By getBTN_BUSCAR() {
        return BTN_BUSCAR;
    }
}
