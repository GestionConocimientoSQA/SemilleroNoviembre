#language:es

Característica: Buscar una cancion en Spotify
  Yo como usuario registrado en Spotify quiero buscar y reproducir una cancion

  Antecedentes: Inicio de sesion exitoso en Spotify
    Dado que el usuario abre el navegador
    Y hace click en el boton login
    Y el usuario ingresa sus credenciales "cahernandez34@misena.edu.co" "5250Crusto2009$"
    Cuando da click en inicio de sesion



  Escenario:Buscar una cancion de manera exitosa en Spotify
    Cuando doy clic en el campo de busqueda
    Y ingreso el nombre de la cancion a buscar
    Entonces visualizo el nombre de la cancion buscada