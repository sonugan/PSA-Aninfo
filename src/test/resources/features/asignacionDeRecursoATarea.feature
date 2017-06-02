# language: es
Característica: Asignacion de un recurso a un tarea perteneciente a un proyecto

    Escenario: Asignacion de un recurso disponible a una tarea de un proyecto en progreso
        Dado el recurso "Pedro" disponible y una tarea "tareaUno" ambos asignados a un proyecto en progreso
        Cuando le asigno el recurso a la tarea
        Entonces el recurso efectivamente queda asignado a la tarea

    Escenario: Asignacion de un recurso de licencia a una tarea de un proyecto en progreso
        Dado el recurso "Pedro" de licencia y una tarea "tareaUno" ambos asignados a un proyecto en progreso
        Cuando le asigno el recurso a la tarea
        Entonces la asignacion no se efectua