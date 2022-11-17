package hiber.service;

import hiber.model.Car;
import hiber.model.User;

import javax.transaction.Transactional;
import java.util.List;

public interface UserService {
    void add(User user);

    @Transactional
    void addCar(Car car);

    User getUserCar(String model, int series);
    List<User> listUsers();

    List<Car> listCars();

}
