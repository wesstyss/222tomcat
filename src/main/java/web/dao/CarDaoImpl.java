package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private static final List<Car> carsList = new ArrayList<>();

    static{
        carsList.add(new Car("Bmw x6","2022","Black"));
        carsList.add(new Car("Vaz 2107","2016","Red"));
        carsList.add(new Car("Mercedez Benz","2015","White"));
        carsList.add(new Car("Lada Granta","2011","Grey"));
        carsList.add(new Car("Chevrolet Comaro","2025","Yellow"));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count == 0){
            return carsList;
        }
        return carsList.stream().limit(count).collect(Collectors.toList());
    }
}
