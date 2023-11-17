#language:es

Característica: Inicio de Sesion Spotify
  Como usuario quiero loguearme en Spotify para reproducir una cancion


  Esquema del escenario: Inicio de sesion exitoso en Spotify
    Dado que el usuario abre el navegador
    Y hace click en el boton login
    Y el usuario ingresa sus credenciales <usuario> <password>
    Cuando da click en inicio de sesion
    Entonces puede visualizar el boton de perfil.
    Ejemplos:
      | usuario                    | password        |
      |cahernandez34@misena.edu.co | 5051Crusto2009$ |



#Feature: Login Spotify
  #Scenario: Login on spotify success

    #Given user start in homepage
    #And user on click button login
    #When user insert credentials and click on login
    #Then user can view the  profile
