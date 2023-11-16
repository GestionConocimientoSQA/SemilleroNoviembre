Feature: Playing Song on Spotify

  Background:
    Given User open the browser
    And User do click on button login

  Scenario:Play a Song Successfully on Spotify
    When The user clicks on the search bar and writes the song
    And select the option to play the song
    Then the song should start playing
    And user can see playback controls including pause and next