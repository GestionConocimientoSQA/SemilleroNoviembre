Feature: Login Spotify
  Scenario: Login successfully in Spotify
    Given User open the browser
    And  user do click on button login
    When User insert credentials and click on login
    Then User can view the profile button
