package persistence;

import model.Alumno;

public class AlumnoDAO implements GenericDAO<Alumno> {
    @Override
    public void insertar(Alumno entidad) {
        System.out.println("Insertando " + entidad.getNombre());
    }

    @Override
    public Alumno buscarPorId(int id) {
        return null;
    }

    @Override
    public void eliminar(int id) {
        System.out.println("Eliminando entidad");
    }
}
