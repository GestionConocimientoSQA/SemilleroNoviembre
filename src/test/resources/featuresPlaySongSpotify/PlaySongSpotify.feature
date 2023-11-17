Feature: Play song
  Background:
    Given User open the browser
    And user do click on button login
    When User insert credentials "daniel.duarte@sqasa.co" "Sqa1014283113" and click on login

  Scenario Outline: Play song successfully in Spotify
    Given User clicks on the search button
    And the user enters the song "<Song>" to play
    When User selects the most relevant option and clicks the play button
    Then User can view the playback
    Examples:
      | Song |
      | reinventing the wheel to run myself over     |