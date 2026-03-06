package persistence;

import model.Usuario;

public class UsuarioDAO implements IGenericDAO<Usuario> {
    @Override
    public void insertar(Usuario entidad) {
        System.out.println("Insertando " + entidad.getNombre());
    }

    @Override
    public Usuario buscarPorId(int id) {
        return null;
    }

    @Override
    public void eliminar(int id) {
        System.out.println("Eliminando Usuario");
    }
}
