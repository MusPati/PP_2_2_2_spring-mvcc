package web.DAO;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao {

    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("Lada", "black", 2018));

        cars.add(new Car("Volvo", "white", 2015));

        cars.add(new Car("BMW", "red", 2010));

        cars.add(new Car("Ferrari", "red", 2006));

        cars.add(new Car("Bugatti", "blue", 2020));
    }

    @Override
    public List<Car> getCarList(int count) {
        return (count >= 0) ? cars.subList(0, Math.min(count, cars.size())) : cars;
    }
}
