package com.spotify.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/PlaySongSpotify.feature",
        //Guardo los métodos en StepDef
        glue = "com.spotify.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class PlaySongRunner {
}