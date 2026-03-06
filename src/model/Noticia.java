package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Noticia {
    private int id;
    private LocalDateTime fecha_publicacion;
    private String descripcion;
    private String titular;
    private List<Imagen> imagenes;

    public Noticia(int id, LocalDateTime fecha_publicacion, String descripcion, String titular) {
        this.id = id;
        this.fecha_publicacion = fecha_publicacion;
        this.descripcion = descripcion;
        this.titular = titular;
        this.imagenes = new ArrayList<>();
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

    public void agregarImagen(Imagen imagen) {
        this.imagenes.add(imagen);
    }

    public List<Imagen> getImagenes() {
        return imagenes;
    }

    public void setImagenes(List<Imagen> imagenes) {
        this.imagenes = imagenes;
    }
}
