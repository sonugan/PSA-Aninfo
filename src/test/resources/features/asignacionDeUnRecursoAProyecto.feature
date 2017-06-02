# language: es
Característica: Asignacion de un recurso a un proyecto

	Escenario: Asignacion de un recurso disponible a un proyecto en progreso
		Dado el recurso "Pedro" disponible y un proyecto en progreso
		Cuando lo asigno al proyecto
		Entonces el recurso queda ligado al proyecto

	Escenario: Asignacion de un recurso disponible a otro proyecto en progreso
		Dado el recurso "Pedro" disponible y ligado a un proyecto en progreso
		Cuando lo asigno a un nuevo proyecto en progreso
		Entonces el recurso queda ligado tambien al nuevo proyecto

	Escenario: Asignar un recurso no disponible a un proyecto en progreso
		Dado el recurso "Gaston" que esta de licencia
		Cuando lo asigno al proyecto
		Entonces el recurso no queda ligado al proyecto

	Escenario: Asignacion de un recurso disponible a un proyecto no iniciado.
		Dado el recurso "Pedro" disponible y un proyecto no iniciado
		Cuando lo asigno al proyecto
		Entonces el recurso no queda ligado al proyecto
