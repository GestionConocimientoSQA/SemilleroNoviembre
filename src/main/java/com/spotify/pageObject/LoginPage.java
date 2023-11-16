package com.spotify.pageObject;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    private final By txtUserName= By.id("login-username");
    private final By txtPass= By.id("login-password");
    private final By btnLogin= By.id("login-button");

    public By getBtnLogin() {
        return btnLogin;
    }

    public By getTxtPass() {
        return txtPass;
    }

    public By getTxtUserName() {
        return txtUserName;
    }
}
