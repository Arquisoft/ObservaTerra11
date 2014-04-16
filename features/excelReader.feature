# language: es
Característica: Analizar hojas excel

Escenario: Contar campos de hoja excel

    Dado que obtengo el fichero excel test.xlsx
    Cuando leo las observaciones
    Entonces el número de observaciones es 4

Escenario: Leer campos de hoja excel

    Dado que obtengo el fichero excel test.xlsx
    Cuando leo las observaciones
    Entonces el valor medio es 3,325 
