package com.spotify.pageObject;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePagePage extends PageObject {

    private final By btnInicioSesion= By.xpath("//button[@data-testid='login-button']");

    public By getBtnInicioSesion() {
        return btnInicioSesion;
    }

}
