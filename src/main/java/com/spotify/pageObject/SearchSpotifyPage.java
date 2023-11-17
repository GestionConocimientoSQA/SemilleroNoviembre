package com.spotify.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class SearchSpotifyPage extends PageObject {

    private final By TXT_BUSCAR = By.xpath("//input[@data-testid = 'search-input']");

    private final By BTN_PLAY = By.xpath("//div[@role = 'row' and @aria-rowindex = '1']//img");



    public By getTXT_BUSCAR() {
        return TXT_BUSCAR;
    }

    public By getBTN_PLAY() {
        return BTN_PLAY;
    }


}
