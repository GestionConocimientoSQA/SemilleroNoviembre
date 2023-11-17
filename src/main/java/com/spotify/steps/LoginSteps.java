package com.spotify.steps;

import com.spotify.pageObject.LoginPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class LoginSteps {

    @Page
    LoginPage loginPage;

    @Step
    public void ingresarCredenciales(String usuario,String password){
        loginPage.getDriver().findElement(loginPage.getTxtUserName()).sendKeys(usuario);

        loginPage.getDriver().findElement(loginPage.getTxtPassword()).sendKeys(password);

    }

    @Step
    public void clicklogin(){
        loginPage.getDriver().findElement(loginPage.getBtnLogin()).click();
    }

}
