package com.spotify.pageObject;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class FindSoundPage extends PageObject {

    private By btnBuscar = By.xpath("//*[@href='/search']");

    private By txtCancionaABuscar =  By.xpath("//input[@data-testid='search-input']");

    private By txtCancionBuscada = By.xpath("(//div[text()='Maná'])[1]");

    public By getBtnBuscar() {
        return btnBuscar;
    }

    public By getTxtCancionaABuscar() {
        return txtCancionaABuscar;
    }

    public By getTxtCancionBuscada() {
        return txtCancionBuscada;
    }
}
