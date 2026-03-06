package model;

import java.time.LocalDateTime;

public class Evento {
    private int id;
    private LocalDateTime fecha_inicio;
    private LocalDateTime fecha_fin;
    private String descripcion;
    private String nombre;

    public Evento(int id, LocalDateTime fecha_inicio, LocalDateTime fecha_fin, String descripcion, String nombre) {
        this.id = id;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.descripcion = descripcion;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(LocalDateTime fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public LocalDateTime getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(LocalDateTime fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean estaVigente() {
        LocalDateTime hoy = LocalDateTime.now();
        return hoy.isAfter(getFecha_inicio()) && hoy.isBefore(getFecha_fin());
    }
}
