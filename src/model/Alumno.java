package model;

public class Alumno extends Usuario {
    private String matricula;
    private double promedio;

    public Alumno(int id, String categoria, String nombre, String email, String password, String matricula) {
        super(id, TIPO_USUARIO.ALUMNO, categoria, nombre, email, password);
        this.matricula = matricula;
        this.promedio = 0.0;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
}