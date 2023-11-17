package com.spotify.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class SongPagePage extends PageObject {

    private final By TXT_COMPARE1 = By.xpath("//div[@role = 'contentinfo']//span/a[starts-with (@href, '/intl-es/album')] ");
    private final By TXT_COMPARE2 = By.xpath("//div[@aria-rowindex = '1']//a[starts-with (@href, '/intl-es/track')]/div");


    public By getTXT_COMPARE1() {
        return TXT_COMPARE1;
    }

    public By getTXT_COMPARE2() {
        return TXT_COMPARE2;
    }
}
