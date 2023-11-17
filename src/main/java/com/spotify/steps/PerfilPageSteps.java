package com.spotify.steps;

import com.spotify.pageObject.PerfilPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class PerfilPageSteps {

    @Page
    PerfilPage perfilpage;

    @Step
    public void validarPerfil(){
        perfilpage.getLnkPerfil();
    }

}
