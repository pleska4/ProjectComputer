package techStation.interfaces;

public interface IDefaultDAO <T>{
    T getEntityById(int id);
    void saveEntity(T entity);
    void updateEntity (T entity);
    void removeEntity (T entity);
}
