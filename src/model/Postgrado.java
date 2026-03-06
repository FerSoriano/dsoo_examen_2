package model;

public class Postgrado extends ProgramaAcademico {
    private String area;
    private String requisitos;

    public Postgrado(int id, String nombre, String descripcion, String tipo, String area, String requisitos) {
        super(id, nombre, descripcion, tipo);
        this.area = area;
        this.requisitos = requisitos;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }
}
