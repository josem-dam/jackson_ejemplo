package edu.acceso.jackson_ejemplo;

import java.io.Serializable;

public class Tutor implements Serializable {

    private String nombre;
    private String especialidad;

    public Tutor() {}

    public Tutor(String nombre, String especialidad) {
        setNombre(nombre);
        setEspecialidad(especialidad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return String.format("%s (%s)", nombre, especialidad);
    }

    @Override
    public boolean equals(Object obj) {
        Tutor otro = (Tutor) obj;
        return nombre.equals(otro.nombre)
            && especialidad.equals(otro.especialidad);
    }
}
