package persistence;

import model.Investigacion;

public class InvestigacionDAO implements GenericDAO<Investigacion>{

    @Override
    public void insertar(Investigacion entidad) {
        System.out.println("Insertando " + entidad.getNombre());
    }

    @Override
    public Investigacion buscarPorId(int id) {
        return null;
    }

    @Override
    public void eliminar(int id) {
        System.out.println("Eliminando departamento");
    }
}
