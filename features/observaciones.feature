# language: es
Característica: Gestión de observaciones

Escenario: Calcular media de observaciones
  Calcular valor medio de varias observaciones

    Dada una lista de observaciones:
      | country | indicator | value | 
      | Spain   | hdi       | 1,3   |
      | France  | hdi       | 1,5   |
      | Spain   | aids      | 4,2   |
      | Chile   | aids      | 1     |
    Cuando selecciono las observaciones con el indicador hdi
    Y calculo la nota media 
    Entonces obtengo el valor 1,4
    
Escenario: Calcular media de una observación
  Calcular valor medio de 1 observación

    Dada una observación del país Chile con indicador hdi y valor 3,2
    Cuando calculo la nota media
    Entonces obtengo el valor 3,2
    