package model;

import java.time.LocalDateTime;

public class Noticia {
    private int id;
    private LocalDateTime fecha_publicacion;
    private String descripcion;
    private String titular;

    public Noticia(int id, LocalDateTime fecha_publicacion, String descripcion, String titular) {
        this.id = id;
        this.fecha_publicacion = fecha_publicacion;
        this.descripcion = descripcion;
        this.titular = titular;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getFecha_publicacion() {
        return fecha_publicacion;
    }

    public void setFecha_publicacion(LocalDateTime fecha_publicacion) {
        this.fecha_publicacion = fecha_publicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}
