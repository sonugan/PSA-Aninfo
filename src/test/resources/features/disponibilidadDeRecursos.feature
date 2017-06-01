# language: es
Característica: Verificar disponibilidad de recursos.

  Escenario: validar si un recurso está disponible
    Dado el recurso "Juan" esta disponible
    Cuando lo inspecciono
    Entonces se me informa que esta disponible

  Escenario: validar si un recurso está disponible
    Dado el recurso "Predo" esta licencia
    Cuando lo inspecciono
    Entonces se me informa que no esta disponible