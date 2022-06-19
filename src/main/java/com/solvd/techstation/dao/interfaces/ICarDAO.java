package techstation.interfaces;

import techstation.model.Car;

import java.util.List;

public interface ICarDAO extends techstation.interfaces.IDefaultDAO<Car> {
    void viewAll();

    List<Car> getCars();
}