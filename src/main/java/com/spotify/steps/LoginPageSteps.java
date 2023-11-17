package com.spotify.steps;

import com.spotify.pageObject.LoginPagePage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class LoginPageSteps {

    @Page
    LoginPagePage loginPagePage;

    @Step("digitar credenciales")

    public void writterCredentials(String User, String Password){
        loginPagePage.getDriver().findElement(loginPagePage.getTXT_USUARIO()).sendKeys(User);
        loginPagePage.getDriver().findElement(loginPagePage.getTXT_CONTRASENA()).sendKeys(Password);
    }

    @Step("click en iniciar sesion")
    public void click_SignUp(){
        loginPagePage.getDriver().findElement(loginPagePage.getBTN_INICIARSESION()).click();
    }


}
