Feature: Play song
  Background:
    Given User open the browser and do click on button login
    When insert credentials and click on login
    Then can view the profile button
  Scenario: Play song successfully in Spotify
    Given User clicks on the search button
    And the user enters the song to play
    When User selects the most relevant option and clicks the play button
    Then User can view the playback