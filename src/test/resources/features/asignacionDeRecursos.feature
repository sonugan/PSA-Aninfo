# language: es
Característica: Asignacion de un recurso a un proyecto

	Escenario: Validar disponibilidad
		Dado el recurso "Juan"
		Cuando lo inspecciono
		Entonces se me informa si esta disponible

	Escenario: Validar asignacion a un proyecto
		Dado el recurso "Pedro" y un proyecto
		Cuando lo asigno al proyecto
		Entonces el recurso queda ligado al proyecto

	Escenario: Validar asignacion a otros proyectos
		Dado el recurso "Pedro" ligado a un proyecto
		Cuando lo asigno a un nuevo proyecto
		Entonces el recurso queda ligado tambien al nuevo proyecto

	Escenario: Asignar un recurso no disponible a un proyecto
		Dado el recurso "Gaston" que esta de licencia
		Cuando lo asigno al proyecto
		Entonces el recurso no queda ligado al proyecto