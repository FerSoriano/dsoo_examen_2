package persistence;

public interface GenericDAO<T> {
    void insertar(T entidad);
    T buscarPorId(int id);
    void eliminar(int id);
}
