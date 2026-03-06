package model;

import java.util.ArrayList;
import java.util.List;

public class InformacionGeneral {
    private int id;
    private int categoria;
    private String nombre;
    private String descripcion;
    private String mision;
    private String estructura;
    private String funciones;
    private List<Departamento> departamentos;

    public InformacionGeneral(int id, int categoria, String nombre, String descripcion, String mision, String estructura, String funciones) {
        this.id = id;
        this.categoria = categoria;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.mision = mision;
        this.estructura = estructura;
        this.funciones = funciones;
        this.departamentos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
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

    public String getMision() {
        return mision;
    }

    public void setMision(String mision) {
        this.mision = mision;
    }

    public String getEstructura() {
        return estructura;
    }

    public void setEstructura(String estructura) {
        this.estructura = estructura;
    }

    public String getFunciones() {
        return funciones;
    }

    public void setFunciones(String funciones) {
        this.funciones = funciones;
    }

    public void agregarDepartamento(Departamento depto) {
        this.departamentos.add(depto);
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }
}
