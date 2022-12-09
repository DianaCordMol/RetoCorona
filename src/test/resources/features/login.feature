#language: es
  Característica: Login

    @Login

    Escenario: Login exitoso

      Dado Que el usuario se encuentra en la pagina web
      Cuando  El desee loguearse e ingrese con sus credenciales
      Entonces Se visualizara el mensaje de bienvenida con su nombre
