package com.spotify.steps;

import com.spotify.pageObject.LoginPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class LoginSteps {

    @Page
    LoginPage loginPage;

    @Step
    public void sendCredentials(){
        loginPage.getDriver().findElement(loginPage.getTxtUserName()).
                sendKeys(
                "danielasegoviaperdomo@gmail.com"
        );
        loginPage.getDriver().findElement(loginPage.getTxtPass()).
                sendKeys("daniela1998");
    }

    @Step
    public void clickOnLogin(){
        loginPage.getDriver().findElement(loginPage.getBtnLogin()).click();
    }
}
