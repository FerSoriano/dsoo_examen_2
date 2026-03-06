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
    private List<Noticia> noticias;
    private List<Investigacion> investigaciones;

    public Departamento(int id, String nombre, String descripcion, Usuario coordinador) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.coordinador = coordinador;
        this.programas = new ArrayList<>();
        this.eventos = new ArrayList<>();
        this.noticias = new ArrayList<>();
        this.investigaciones = new ArrayList<>();
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

    public List<ProgramaAcademico> getProgramas() {
        return programas;
    }

    public void setProgramas(List<ProgramaAcademico> programas) {
        this.programas = programas;
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }

    public List<Noticia> getNoticias() {
        return noticias;
    }

    public void setNoticias(List<Noticia> noticias) {
        this.noticias = noticias;
    }

    public List<Investigacion> getInvestigaciones() {
        return investigaciones;
    }

    public void setInvestigaciones(List<Investigacion> investigaciones) {
        this.investigaciones = investigaciones;
    }

    public void agregarNoticia(Noticia noticia) {
        this.noticias.add(noticia);
    }

    public void agregarInvestigacion(Investigacion investigacion) {
        this.investigaciones.add(investigacion);
    }
}
