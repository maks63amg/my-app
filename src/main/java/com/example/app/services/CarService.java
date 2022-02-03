package com.example.app.services;

import com.example.app.dto.CarDTO;
import com.example.app.entities.Car;
import com.example.app.mapper.CarMapperImpl;
import com.example.app.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;
    @Autowired
    private CarMapperImpl carMapper;

    public CarDTO add(CarDTO carDTO) {
        carRepository.save(carMapper.toCar(carDTO));

        return carDTO;
    }

    public List<CarDTO> findAll() {
        return carMapper.toCarDTOs(carRepository.findAll());
    }

    public CarDTO findCar(long id) {
        return carMapper.toCarDTO(carRepository.getById(id));
    }

    public void deleteById(Long id) {
        carRepository.deleteById(id);
    }

    public CarDTO update(CarDTO carDTO) {
        Car car = carMapper.toCar(carDTO);
        car.setId(carDTO.getId());

        carRepository.save(car);
        return carDTO;
    }
}
