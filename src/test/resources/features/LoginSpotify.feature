Feature: Login Spotify

  Scenario Outline: Login successfully in Spotify
    Given User open the browser
    And User do click on button login
    When User insert credentials "<User>" "<Password>" and click on login
    Then User can view the profile button
    Examples:
      | User                            | Password    |  |
      | danielasegoviaperdomo@gmail.com | daniela1998 |  |