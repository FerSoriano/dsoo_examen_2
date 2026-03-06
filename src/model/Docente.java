package model;

import java.util.ArrayList;
import java.util.List;

public class Docente extends Usuario {
    private String especialidad;
    private String cedulaProfesional;
    private List<Asignatura> materiasAsignadas;

    public Docente(int id, String categoria, String nombre, String email, String password, String especialidad, String cedulaProfesional) {
        super(id, TIPO_USUARIO.DOCENTE, categoria, nombre, email, password);
        this.especialidad = especialidad;
        this.cedulaProfesional = cedulaProfesional;
        this.materiasAsignadas = new ArrayList<>();
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getCedulaProfesional() {
        return cedulaProfesional;
    }

    public void setCedulaProfesional(String cedulaProfesional) {
        this.cedulaProfesional = cedulaProfesional;
    }

    public List<Asignatura> getMateriasAsignadas() {
        return materiasAsignadas;
    }

    public void setMateriasAsignadas(List<Asignatura> materiasAsignadas) {
        this.materiasAsignadas = materiasAsignadas;
    }

    public void asignarMateria(Asignatura materia) {
        this.materiasAsignadas.add(materia);
    }
}