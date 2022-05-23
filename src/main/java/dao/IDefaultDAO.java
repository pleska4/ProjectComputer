package dao;

import java.util.List;

public interface IDefaultDao<K, E> {

    List<E> getAll();
    E getById(K id);
    void deleteById(K id);
    void createNewEntity(E entity);
    void removeEntity(int id);

}
