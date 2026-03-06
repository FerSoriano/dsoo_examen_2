package persistence;

public interface IGenericDAO<T> {
    void insertar(T entidad);
    T buscarPorId(int id);
    void eliminar(int id);
}
