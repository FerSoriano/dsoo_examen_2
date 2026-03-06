package persistence;

import model.Departamento;

public class DepartamentoDAO implements GenericDAO<Departamento> {

    @Override
    public void insertar(Departamento entidad) {
        System.out.println("Insertando " + entidad.getNombre());
    }

    @Override
    public Departamento buscarPorId(int id) {
        return null;
    }

    @Override
    public void eliminar(int id) {
        System.out.println("Eliminando departamento");
    }
}
