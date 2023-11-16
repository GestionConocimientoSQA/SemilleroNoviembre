package com.spotify.steps;

import com.spotify.pageObject.LoginPagePage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class LoginPageSteps {

    @Page
    LoginPagePage loginPagePage;

    @Step

    public void writterCredentials(){
        loginPagePage.getDriver().findElement(loginPagePage.getTXT_USUARIO()).sendKeys("daniel.duarte@sqasa.co");
        loginPagePage.getDriver().findElement(loginPagePage.getTXT_CONTRASENA()).sendKeys("Sqa1014283113");
    }

    @Step
    public void click_SignUp(){
        loginPagePage.getDriver().findElement(loginPagePage.getBTN_INICIARSESION()).click();
    }


}
