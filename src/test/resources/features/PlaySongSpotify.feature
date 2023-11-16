Feature: Play song on Spotify

  Background:
    Given User open the browser
    And User do click on button login
    When User insert credentials and click on login

  Scenario: Play song on Spotify with user logged
    When User do click on search button
    And User enter the name of the song in the search field and the User do click on the play button
    Then User can view song name of the searched song in the play bar


