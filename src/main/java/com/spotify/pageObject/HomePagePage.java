package com.spotify.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePagePage extends PageObject {

    private final By linkInicioSesion = By.xpath("//a[@href = 'https://www" +
            ".spotify.com/co-es/login/?continue=%2Fco-es%2Fpremium%2F%3Futm_source%3Dco-es_br" +
            "and_contextual-desktop_text%26utm_medium%3Dpaidsearch%26utm_campaign%3Dalwayson_l" +
            "atam_co_premiumbusiness_core_brand%2Bcontextual-desktop%2Btext%2Bexact%2Bco-es%2B" +
            "google%26gad_source%3D1%26gclid%3DEAIaIQobChMI4KOGrZTHggMV20t_AB0lkAz1EAAYASAAEgI" +
            "OJfD_BwE%26gclsrc%3Daw.ds']");
    private final By BTN_INICIOSESION = By.xpath("//a[@data-ga-action = 'log-in']");

    public By getLinkInicioSesion() {
        return linkInicioSesion;
    }

    public By getBTN_INICIOSESION() {
        return BTN_INICIOSESION;
    }
}
