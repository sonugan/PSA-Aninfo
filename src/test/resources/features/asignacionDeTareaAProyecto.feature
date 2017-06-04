# language: es
Característica: Asignacion de una tarea a un proyecto

#	EstadosDeProyeto: No iniciado, En progreso, suspendido, finalizado.

	Escenario: Crear una tarea y asignarla a un proyecto con estado EnProgreso
		Dado una tarea "tareaUno" y un proyecto con estado EnProgreso.
		Cuando asigno la tarea "tareaUno" al proyecto
		Entonces la tarea queda ligado al proyecto

	Escenario: Crear una tarea y asignarla a un proyecto con estado Suspendido
		Dado una tarea "tareaDos" y un proyecto con estado Suspendido
		Cuando asigno la tarea "tareaDos" al proyecto
		Entonces la tarea no queda ligada al proyecto

	Escenario: Crear una tarea y asignarla a un proyecto con estado NoIniciado
		Dado una tarea "tareaTres" y un proyecto con estado NoIniciado
		Cuando asigno la tarea "tareaTres" al proyecto
		Entonces la tarea no queda ligada al proyecto

	Escenario: Crear una tarea y asignarla a un proyecto con estado Finalizado
		Dado una tarea "tareaCuatro" y un proyecto con estado Finalizado
		Cuando asigno la "tareaCuatro" al proyecto
		Entonces la tarea no queda ligada al proyecto
		