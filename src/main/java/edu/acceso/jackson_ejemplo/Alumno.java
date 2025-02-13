package edu.acceso.jackson_ejemplo;

import java.io.Serializable;

public class Alumno implements Serializable {

    private String nombre;
    private int edad;

    public Alumno() {};

    public Alumno(String nombre, int edad) {
        setNombre(nombre);
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return String.format("%s (%d)", nombre, edad);
    }

    @Override
    public boolean equals(Object obj) {
        Alumno otro = (Alumno) obj;
        return nombre.equals(otro.nombre) && edad == otro.edad;
    }
}
