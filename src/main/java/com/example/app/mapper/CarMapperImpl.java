package com.example.app.mapper;

import com.example.app.dto.CarDTO;
import com.example.app.entities.Car;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarMapperImpl implements CarMapper {

    @Override
    public CarDTO toCarDTO(Car car) {
        if (car == null)
            return null;

        CarDTO carDTO = new CarDTO();
        carDTO.setId(car.getId());
        carDTO.setName(car.getName());
        carDTO.setFuelConsumption(car.getFuelConsumption());
        carDTO.setWorking(car.isWorking());

        return carDTO;
    }

    @Override
    public List<CarDTO> toCarDTOs(List<Car> cars) {
        if (cars == null)
            return null;

        List<CarDTO> carDTOs = cars.stream().map(this::toCarDTO).collect(Collectors.toList());
        return carDTOs;
    }

    @Override
    public Car toCar(CarDTO carDTO) {
        if (carDTO == null)
            return null;
        Car car = new Car();
        car.setName(carDTO.getName());
        car.setFuelConsumption(carDTO.getFuelConsumption());
        car.setWorking(carDTO.isWorking());

        return car;
    }
}
