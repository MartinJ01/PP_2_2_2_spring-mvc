package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.DAO.CarDAO;
import web.DAO.CarDAOImpl;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> cars = new ArrayList<Car>();

    {
        cars.add(new Car("Model1", "Red", 2001));
        cars.add(new Car("Model2", "Green", 2002));
        cars.add(new Car("Model3", "Blue", 2003));
        cars.add(new Car("Model4", "White", 2004));
        cars.add(new Car("Model5", "Black", 2005));
    }


    @Override
    public List<Car> getCars(int count) {
        return count == 0 ? cars : cars.stream()
                .limit(count >= 5 ? cars.size() : count)
                .toList();
    }
}
