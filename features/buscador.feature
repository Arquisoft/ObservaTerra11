# language: es
Característica: Buscar en página Web

  Como un usuario común
  Quiero poder ir a una página de búsqueda
  Para poder encontrar información

Escenario: Realizar una búsqueda en Universidad de Oviedo

    Dado que estoy en la página http://www.uniovi.es
    Cuando voy al campo cabecera_keywords y tecleo Gobierno
    Entonces obtengo una página que contiene Rector
    