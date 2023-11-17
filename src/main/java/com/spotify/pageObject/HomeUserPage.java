package com.spotify.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomeUserPage extends PageObject {


    private final By BTN_PERFIL = By.xpath("//span[contains(text(), 'Perfil')]");
    private final By BTN_OPEN = By.xpath("//a[@href = 'https://www.spotify.com/co-es/' and starts-with(@class, 'mh-header')]");


    public By getBTN_PERFIL() {
        return BTN_PERFIL;
    }
    public By getBTN_OPEN() {

        return BTN_OPEN;
    }



}
