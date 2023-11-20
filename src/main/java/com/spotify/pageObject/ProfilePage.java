package com.spotify.pageObject;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ProfilePage extends PageObject {

    private final By btnProfile = By.xpath("//button[@data-testid='user-widget-link']");

    public By getBtnProfile() {
        return btnProfile;
    }
}
