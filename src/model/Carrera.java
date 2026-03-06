package model;

public class Carrera extends ProgramaAcademico {
    private String pensum;

    public Carrera(int id, String nombre, String descripcion, String tipo, String pensum) {
        super(id, nombre, descripcion, tipo);
        this.pensum = pensum;
    }

    public String getPensum() {
        return pensum;
    }

    public void setPensum(String pensum) {
        this.pensum = pensum;
    }
}
