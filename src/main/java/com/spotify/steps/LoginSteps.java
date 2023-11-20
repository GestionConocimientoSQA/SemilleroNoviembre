package com.spotify.steps;

import com.spotify.pageObject.LoginPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class LoginSteps {

    @Page
    LoginPage loginPage;

    @Step
    public void sendCredentials(String user, String pass){
        loginPage.getDriver().findElement(loginPage.getTxtUserName()).
                sendKeys(user);
        loginPage.getDriver().findElement(loginPage.getTxtPass()).sendKeys(pass);
    }

    @Step
    public void clickOnLogin(){
        loginPage.getDriver().findElement(loginPage.getBtnLogin()).click();
    }
}
