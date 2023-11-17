package com.spotify.stepDefinitions;


import com.spotify.steps.HomeOpenSteps;
import com.spotify.steps.HomeUserSteps;
import com.spotify.steps.SearchSpotifySteps;
import com.spotify.steps.SongPageSteps;
import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Steps;

public class PlaySongStepDefinitions {
    @Steps
    HomeUserSteps homeUserSteps;
    @Steps
    HomeOpenSteps homeOpenSteps;
    @Steps
    SearchSpotifySteps searchSpotifySteps;
    @Steps
    SongPageSteps songPageSteps;

    @Given("User clicks on the search button")
    public void userClicksOnTheSearchButton() {
        homeUserSteps.openPageSpotify();
        homeOpenSteps.clickSearch();
    }
    @Given("the user enters the song {string} to play")
    public void theUserEntersTheSongToPlay(String song) {
        searchSpotifySteps.writterSongAndClick(song);
    }
    @When("User selects the most relevant option and clicks the play button")
    public void userSelectsTheMostRelevantOptionAndClicksThePlayButton() {
        searchSpotifySteps.playSong();
    }
    @Then("User can view the playback")
    public void userCanViewThePlayback() {
        songPageSteps.validatePlaySong();
    }

}
