package fiuba;

/**
 * Created by nicolas on 31/05/17.
 */
public class Tarea {

    private String nombre;

    Tarea(String nombreTarea){
        this.nombre = nombreTarea;
    }

    @Override
    public boolean equals(Object otra) {
        Tarea otraTarea = (Tarea) otra;
        return this.nombre.equals(otraTarea.nombre);
    }
}
