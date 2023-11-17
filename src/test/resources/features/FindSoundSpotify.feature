#language:es

Característica: Buscar una cancion en Spotify
  Yo como usuario registrado en Spotify quiero buscar y reproducir una cancion

  Antecedentes: El usuario ha iniciado sesion
    Dado que el usuario abre el navegador y hace click en el boton login
    Cuando el usuario ingresa sus credenciales y da click en inicio de sesion


  Escenario:Buscar una cancion de manera exitosa en Spotify
    Dado que estoy en la pagina de Spotify como usuario logeado
    Cuando doy clic en el campo de busqueda
    Y ingreso el nombre de la cancion y presiono enter
    Entonces visualizo el nombre de la cancion buscada