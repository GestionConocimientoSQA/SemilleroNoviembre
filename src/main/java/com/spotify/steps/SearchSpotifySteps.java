package com.spotify.steps;

import com.spotify.pageObject.SearchSpotifyPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.Keys;

public class SearchSpotifySteps {

    @Page
    SearchSpotifyPage searchSpotifyPage;

    @Step("Escribir cancion y click en buscar")
    public void writterSongAndClick(String song){
        searchSpotifyPage.getDriver().findElement(searchSpotifyPage.getTXT_BUSCAR()).sendKeys(song, Keys.ENTER);
    }
    @Step("Reproducir cancion")
    public void playSong(){
        searchSpotifyPage.getDriver().findElement(searchSpotifyPage.getBTN_PLAY()).click();
    }
}
