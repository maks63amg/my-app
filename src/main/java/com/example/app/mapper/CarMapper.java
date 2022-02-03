package com.example.app.mapper;

import com.example.app.dto.CarDTO;
import com.example.app.dto.PersonDTO;
import com.example.app.entities.Car;
import com.example.app.entities.Person;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface CarMapper {
    CarDTO toCarDTO(Car car);

    List<CarDTO> toCarDTOs(List<Car> cars);

    Car toCar(CarDTO carDTO);
}
