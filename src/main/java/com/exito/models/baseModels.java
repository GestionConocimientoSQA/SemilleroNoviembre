package com.exito.models;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static net.serenitybdd.core.Serenity.getDriver;


public class baseModels {


    public void waitForElementToBeVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void waitForElementToBeClickable(By locator) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void hoverElements(By locator){
        Actions actions = new Actions(getDriver());
        actions.moveToElement(getDriver().findElement(locator)).perform();
    }


}
