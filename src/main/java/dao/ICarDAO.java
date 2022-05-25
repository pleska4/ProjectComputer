package dao;

import model.Car;

public interface ICarDAO extends IDefaultDAO<Car> {
    void viewAll();
}