package model;

import java.util.List;

public class Asignatura {
    private int id;
    private String nombre;
    private int creditos;
    private Docente docente;
    private List<Alumno> alumnos;

    public Asignatura(int id, String nombre, int creditos, Docente docente, List<Alumno> alumnos) {
        this.id = id;
        this.nombre = nombre;
        this.creditos = creditos;
        this.docente = docente;
        this.alumnos = alumnos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
}
