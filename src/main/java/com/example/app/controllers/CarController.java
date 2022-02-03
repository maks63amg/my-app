package com.example.app.controllers;

import com.example.app.dto.CarDTO;
import com.example.app.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {
    @Autowired
    private CarService carService;

    @PostMapping("")
    private ResponseEntity<CarDTO> add(@RequestBody CarDTO carDTO){
        return ResponseEntity.status(HttpStatus.CREATED).body(carService.add(carDTO));
    }

    @GetMapping("")
    private ResponseEntity<List<CarDTO>> findAll(){
        return ResponseEntity.ok(carService.findAll());
    }

    @GetMapping("/{id}")
    private ResponseEntity<CarDTO> findCar(@PathVariable Long id){
        return ResponseEntity.ok(carService.findCar(id));
    }

    @PutMapping("/{id}")
    private ResponseEntity<CarDTO> updateCar(@PathVariable Long id, @RequestBody CarDTO carDTO){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(carService.update(carDTO));
    }

    @DeleteMapping("/{id}")
    private ResponseEntity deleteCar(@PathVariable Long id) {
        carService.deleteById(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }
}
