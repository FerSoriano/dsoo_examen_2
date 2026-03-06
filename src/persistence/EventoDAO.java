package persistence;

import model.Evento;

public class EventoDAO implements GenericDAO<Evento> {
    @Override
    public void insertar(Evento entidad) {
        System.out.println("Insertando " + entidad.getNombre());
    }

    @Override
    public Evento buscarPorId(int id) {
        return null;
    }

    @Override
    public void eliminar(int id) {
        System.out.println("Eliminando departamento");
    }
}
