package com.spotify.stepDefinitions;

import com.spotify.steps.LoginSteps;
import com.spotify.steps.PaginaInicialSteps;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;

public class SpotifyLoginStepDefinitions {

    @Steps
    PaginaInicialSteps paginainicialsteps;

    @Steps
    LoginSteps loginsteps;

    @Dado("que el usuario abre el navegador")
    public void queElUsuarioAbreElNavegador() {
        paginainicialsteps.abrirNavegador();
    }
    @Dado("hace click en el boton login")
    public void haceClickEnElBotonLogin() {
        paginainicialsteps.clickLogin();
    }
    @Dado("el usuario ingresa sus credenciales cahernandez34@misena.edu.co 5051Crusto2009$")
    public void elUsuarioIngresaSusCredencialesCahernandez34MisenaEduCo5051Crusto2009$() {

    }
    @Cuando("da click en inicio de sesion")
    public void daClickEnInicioDeSesion() {

    }
    @Entonces("puede visualizar el boton de perfil.")
    public void puedeVisualizarElBotonDePerfil() {

    }
}
