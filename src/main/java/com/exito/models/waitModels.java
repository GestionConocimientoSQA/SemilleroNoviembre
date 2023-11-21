package com.exito.models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class waitModels {

    protected WebDriver driver;
    private final WebDriverWait wait;


    public waitModels(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void waitElementVisible(WebElement elemento) {
        wait.until(ExpectedConditions.visibilityOf(elemento));
    }


    public void waitElementClickable(WebElement elemento) {
        wait.until(ExpectedConditions.elementToBeClickable(elemento));
    }

    //WebDriverWait espera = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
    //espera.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(shoppingCartPagePage.getLABEL_NAMEPRODUCT2()));

}
