# language: es
Característica: Gestión de observaciones

Escenario: Calcular media de observaciones
  Calcular valor medio de varias observaciones

    Dada una lista de observaciones:
      | country | value |
      | Spain   | 1,3   |
      | France  | 1,5   |
      | Italy   | 4,2   |
      | Chile   | 1     |
    Cuando calculo la nota media
    Entonces obtengo el valor 2
    
  Escenario: Calcular valor medio de una observación

    Dada una observación de Chile con valor 3,2
    Cuando calculo la nota media
    Entonces obtengo el valor 3,2
    
    
