package com.spotify.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/featuresPlaySongSpotify/PlaySongSpotify.feature",
        glue = "com.spotify.stepDefinitions",
        snippets= CucumberOptions.SnippetType.CAMELCASE
)
public class PlaySongRunner {
    //getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    //WebDriverWait espera = new WebDriverWait(getDriver(), 4);
    // espera.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(txtUsuario));
    // wait.until(ExpectedConditions.visibilityOf(tuElemento));
    // Thread.sleep(0,1);   Thread.sleep(1000);

}
