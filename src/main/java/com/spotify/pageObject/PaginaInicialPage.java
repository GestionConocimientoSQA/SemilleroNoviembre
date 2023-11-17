package com.spotify.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaInicialPage extends PageObject {

    private final By lnkInicioSesion = By.xpath("//*[contains(@data-testid,'login-button')]");

    public By getLnkInicioSesion() {
        return lnkInicioSesion;
    }
}
