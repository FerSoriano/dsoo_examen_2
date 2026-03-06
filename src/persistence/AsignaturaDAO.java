package persistence;

import model.Asignatura;

public class AsignaturaDAO implements GenericDAO<Asignatura> {
    @Override
    public void insertar(Asignatura entidad) {
        System.out.println("Insertando " + entidad.getNombre());
    }

    @Override
    public Asignatura buscarPorId(int id) {
        return null;
    }

    @Override
    public void eliminar(int id) {
        System.out.println("Eliminando entidad");
    }
}
