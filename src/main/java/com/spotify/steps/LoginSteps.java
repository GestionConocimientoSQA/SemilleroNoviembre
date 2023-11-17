package com.spotify.steps;

import com.spotify.pageObject.LoginPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class LoginSteps {

    @Page
    LoginPage loginPage;

    @Step
    public void ingresarCredenciales(){
        loginPage.getDriver().findElement(loginPage.getTxtUserName()).sendKeys("cahernandez34@misena.edu.co");

        loginPage.getDriver().findElement(loginPage.getTxtPassword()).sendKeys("5051Crusto2009$");

    }

    @Step
    public void clicklogin(){
        loginPage.getDriver().findElement(loginPage.getBtnLogin()).click();
    }

}
