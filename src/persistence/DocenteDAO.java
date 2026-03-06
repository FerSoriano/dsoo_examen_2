package persistence;

import model.Docente;

public class DocenteDAO implements GenericDAO<Docente> {
    @Override
    public void insertar(Docente entidad) {
        System.out.println("Insertando " + entidad.getNombre());
    }

    @Override
    public Docente buscarPorId(int id) {
        return null;
    }

    @Override
    public void eliminar(int id) {
        System.out.println("Eliminando entidad");
    }
}
