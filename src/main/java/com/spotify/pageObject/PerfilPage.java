package com.spotify.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class PerfilPage extends PageObject {

    private final By lnkPerfil = By.xpath("//button[@data-testid='user-widget-link']");

    public By getLnkPerfil() {
        return lnkPerfil;
    }
}
