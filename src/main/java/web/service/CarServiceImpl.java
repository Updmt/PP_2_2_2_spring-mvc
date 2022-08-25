package web.service;


import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
@Component
public class CarServiceImpl implements CarService {
    private List<Car> cars;
    private static int carCount;

    {
        cars = new ArrayList<>();

        cars.add(new Car(++carCount, "Tesla1", "model A"));
        cars.add(new Car(++carCount, "Tesla2", "model B"));
        cars.add(new Car(++carCount, "Tesla3", "model D"));
        cars.add(new Car(++carCount, "Tesla4", "model G"));
        cars.add(new Car(++carCount, "Tesla5", "model K"));
    }


    public List<Car> show(int id) {
        if (id <= 0) {
            return cars;
        }
        return cars.stream().limit(id).toList();
    }
}

