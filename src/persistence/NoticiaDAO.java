package persistence;

import model.Noticia;

public class NoticiaDAO implements IGenericDAO<Noticia> {
    @Override
    public void insertar(Noticia entidad) {
        System.out.println("Insertando " + entidad.getTitular());
    }

    @Override
    public Noticia buscarPorId(int id) {
        return null;
    }

    @Override
    public void eliminar(int id) {
        System.out.println("Eliminando departamento");
    }
}
