package persistence;

import model.Carrera;

public class CarreraDAO implements IGenericDAO<Carrera> {

    @Override
    public void insertar(Carrera entidad) {
        System.out.println("Insertando " + entidad.getNombre());
    }

    @Override
    public Carrera buscarPorId(int id) {
        return null;
    }

    @Override
    public void eliminar(int id) {
        System.out.println("Eliminando entidad");
    }
}
