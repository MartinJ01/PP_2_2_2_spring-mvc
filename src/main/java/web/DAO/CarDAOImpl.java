package web.DAO;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDAOImpl implements CarDAO {
    private final List<Car> cars;

    public CarDAOImpl(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public List<Car> getCars(int count) {
        return cars;
    }
}
