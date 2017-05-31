# language: es
Característica: Asignacion de una tarea a un proyecto

#	Estados: No iniciado, En progreso, suspendido, finalizado.

	Escenario: Crear una tarea y asignarla a un proyecto con estado EnProgreso
		Dado una tarea y un proyecto
		Cuando asigno la tarea "tareaUno" a un proyecto con estado EnProgreso
		Entonces la tarea queda ligado al proyecto EnProgreso

	Escenario: Crear una tarea y asignarla a un proyecto con estado Suspendido
		Dado una tarea y un proyecto
		Cuando asigno la tarea "tareaDos" a un proyecto con estado Suspendido
		Entonces la tarea no queda ligada al proyecto Supendido

	Escenario: Crear una tarea y asignarla a un proyecto con estado NoIniciado
		Dado una tarea y un proyecto
		Cuando asigno la tarea "tareaTres" a un proyecto con estado NoIniciado
		Entonces la tarea no queda ligada al proyecto Noiniciado

	Escenario: Crear una tarea y asignarla a un proyecto con estado Finalizado
		Dado una tarea y un proyecto
		Cuando asigno la "tareaCuatro" a un proyecto con estado Finalizado
		Entonces la tarea no queda ligada al proyecto Finalizado

