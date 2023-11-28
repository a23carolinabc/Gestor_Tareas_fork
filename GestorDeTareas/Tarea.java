package Gestor_Tareas;

import Gestor_Tareas.Tarea;

public class Tarea {
 
    private String nombre;
    private Prioridad prioridad;

    // Constructor sin inicialización de prioridad
    public Tarea(String nombre) {
        this.nombre = nombre;
    }

    // Constructor con inicialización de prioridad
    public Tarea(String nombre, Prioridad prioridad) {
        this.nombre = nombre;
        this.prioridad = prioridad;
    }

    public String getNombre() {
        return nombre;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }
}


enum Prioridad {
    BAJA,
    MEDIA,
    ALTA
}
