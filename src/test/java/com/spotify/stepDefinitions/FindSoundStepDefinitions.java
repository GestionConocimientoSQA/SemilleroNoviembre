package com.spotify.stepDefinitions;

import com.spotify.steps.FindSoundSteps;
import com.spotify.steps.LoginSteps;
import com.spotify.steps.PaginaInicialSteps;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;

public class FindSoundStepDefinitions {

    @Steps
    FindSoundSteps findsoundsteps;

    @Cuando("doy clic en el campo de busqueda")
    public void doyClicEnElCampoDeBusqueda() throws InterruptedException {
        Thread.sleep(8000);
        findsoundsteps.clicBtnBusqueda();
    }
    @Cuando("ingreso el nombre de la cancion a buscar")
    public void ingresoElNombreDeLaCancionABuscar() {
        findsoundsteps.ingresarCancionABuscar();
    }


    @Entonces("visualizo el nombre de la cancion buscada")
    public void visualizoElNombreDeLaCancionBuscada() throws InterruptedException {
        Thread.sleep(2000);
        findsoundsteps.validarCancionBuscada();
    }

}
