package edu.acceso.jackson_ejemplo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Grupo implements Serializable {

    private short nivel;
    private String etapa;
    private char grupo; 
    private Tutor tutor;
    private ArrayList<Alumno> miembros;

    public Grupo() {};

    public Grupo(short nivel, String etapa, char grupo, Tutor tutor, List<Alumno> miembros) {
        setNivel(nivel);
        setEtapa(etapa);
        setGrupo(grupo);
        setTutor(tutor);
        setMiembros(miembros);
    }

    public short getNivel() {
        return nivel;
    }

    public void setNivel(short nivel) {
        this.nivel = nivel;
    }

    public String getEtapa() {
        return etapa;
    }

    public void setEtapa(String etapa) {
        this.etapa = etapa;
    }

    public char getGrupo() {
        return grupo;
    }

    public void setGrupo(char grupo) {
        this.grupo = grupo;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public ArrayList<Alumno> getMiembros() {
        return miembros;
    }

    public void setMiembros(List<Alumno> miembros) {
        this.miembros = new ArrayList<>(miembros);
    }

    @Override
    public String toString() {
        return String.format("%dº%s-%c -- %s", nivel, etapa, grupo, tutor.getNombre());
    }

    @Override
    public boolean equals(Object obj) {
        Grupo otro = (Grupo) obj;
        return nivel == otro.nivel && etapa.equals(otro.etapa) && grupo == otro.grupo;
    }
}
