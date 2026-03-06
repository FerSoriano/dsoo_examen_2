package persistence;

import model.Postgrado;

public class PostgradoDAO implements IGenericDAO<Postgrado> {
    @Override
    public void insertar(Postgrado entidad) {
        System.out.println("Insertando " + entidad.getNombre());
    }

    @Override
    public Postgrado buscarPorId(int id) {
        return null;
    }

    @Override
    public void eliminar(int id) {
        System.out.println("Eliminando departamento");
    }
}
