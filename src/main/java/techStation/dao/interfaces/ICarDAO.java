package techStation.interfaces;

import techStation.model.Car;

import java.util.List;

public interface ICarDAO extends techStation.interfaces.IDefaultDAO<Car> {
    void viewAll();

    List<Car> getCars();
}