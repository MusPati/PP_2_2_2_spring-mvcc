package web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.DAO.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final CarDao carDao;

    @Override
    public List<Car> getCarList(int count) {
        return carDao.getCarList(count);
    }

    @Autowired
    protected CarServiceImpl (CarDao carDao) {
        this.carDao = carDao;
    }
}