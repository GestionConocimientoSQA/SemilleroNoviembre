package com.spotify.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class SongPagePage extends PageObject {

    private final By TXT_COMPARE1 = By.xpath("//span/a[starts-with (@href, '/intl-es/album')]");
    //private final By TXT_COMPARE2 = By.xpath("//div[@aria-rowindex = '1']//a[starts-with (@href, '/intl-es/track')]/div");
    private final By TXT_COMPARE2 = By.xpath("(//section[@aria-label = 'Canciones']//a[starts-with (@href, '/intl-es/track')])[1]");


    public By getTXT_COMPARE1() {
        return TXT_COMPARE1;
    }

    public By getTXT_COMPARE2() {
        return TXT_COMPARE2;
    }
}
