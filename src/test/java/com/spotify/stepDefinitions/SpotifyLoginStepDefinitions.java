package com.spotify.stepDefinitions;

import com.spotify.steps.LoginSteps;
import com.spotify.steps.PaginaInicialSteps;
import com.spotify.steps.PerfilPageSteps;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;

public class SpotifyLoginStepDefinitions {

    @Steps
    PaginaInicialSteps paginainicialsteps;

    @Steps
    LoginSteps loginsteps;

    @Steps
    PerfilPageSteps perfilpagesteps;

    @Dado("que el usuario abre el navegador")
    public void queElUsuarioAbreElNavegador() {
        paginainicialsteps.abrirNavegador();
    }
    @Dado("hace click en el boton login")
    public void haceClickEnElBotonLogin() {
        paginainicialsteps.clickLogin();
    }
    @Dado("el usuario ingresa sus credenciales {string} {string}")
    public void elUsuarioIngresaSusCredenciales(String usuario, String password) {
        loginsteps.ingresarCredenciales(usuario,password);
    }

    @Cuando("da click en inicio de sesion")
    public void daClickEnInicioDeSesion() {
        loginsteps.clicklogin();
    }
    @Entonces("puede visualizar el boton de perfil.")
    public void puedeVisualizarElBotonDePerfil() {
        perfilpagesteps.validarPerfil();
    }
}
