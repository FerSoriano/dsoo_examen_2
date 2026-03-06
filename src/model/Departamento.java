package model;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private int id;
    private String nombre;
    private String descripcion;
    private Usuario coordinador;
    private List<ProgramaAcademico> programas;
    private List<Evento> eventos;

    public Departamento(int id, String nombre, String descripcion, Usuario coordinador) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.coordinador = coordinador;
        this.programas = new ArrayList<>();
        this.eventos = new ArrayList<>();
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Usuario getCoordinador() {
        return coordinador;
    }

    public void setCoordinador(Usuario coordinador) {
        this.coordinador = coordinador;
    }

    public void agregarPrograma(ProgramaAcademico programa) {
        this.programas.add(programa);
    }

    public List<ProgramaAcademico> obtenerOfertaAcademica() {
        return this.programas;
    }

    public void agregarEvento(Evento evento) {
        this.eventos.add(evento);
    }

    public List<Evento> obtenerEventosProximos() {
        return this.eventos;
    }
}
