package dao;

import java.util.List;

public interface IDefaultDAO<T> {

    public void insert(T entity);
    public void update(T entity);
    public void delete(int id);
    public T get(int id);
    public List<T> get();

}
