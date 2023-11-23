package com.spotify.steps;

import com.spotify.pageObject.SongPagePage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;

public class SongPageSteps {

    @Page
    SongPagePage songPagePage;

    @Step("Validar reproduccion cancion")
    public void validatePlaySong(){
        Assert.assertEquals(
                songPagePage.getDriver().findElement(songPagePage.getTXT_COMPARE1()).getText(),
                songPagePage.getDriver().findElement(songPagePage.getTXT_COMPARE2()).getText()
        );
    }

}