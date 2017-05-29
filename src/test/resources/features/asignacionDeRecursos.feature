# language: es
Característica: Asignacion de un recurso a la fase de un proyecto

	Escenario: Validar disponibilidad
		Dado un recurso
		Cuando lo inspecciono
		Entonces se me informa si esta disponible

	Escenario: Validar asignacion a un proyecto
		Dado un recurso
		Cuando lo asigno a un proyecto
		Entonces el recurso queda ligado al proyecto

	Escenario: Validar asignacion a otros proyectos
		Dado un recurso ligado a un proyecto
		Cuando lo asigno a un nuevo proyecto
		Entonces el recurso queda ligado tambien al nuevo proyecto
