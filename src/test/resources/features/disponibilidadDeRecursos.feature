# language: es
Característica: Verificar disponibilidad de recursos.

  Escenario: validar que un recurso activo este disponible
    Dado el recurso "Juan" esta disponible
    Cuando lo inspecciono
    Entonces se me informa que esta disponible

  Escenario: validar que un recurso que esta de licencia no este disponible
    Dado el recurso "Predo" esta licencia
    Cuando lo inspecciono
    Entonces se me informa que no esta disponible