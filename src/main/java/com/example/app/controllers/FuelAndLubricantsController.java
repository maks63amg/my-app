package com.example.app.controllers;

import com.example.app.dto.FuelAndLubricantsDTO;
import com.example.app.dto.PersonDTO;
import com.example.app.services.FuelAndLubricantsService;
import com.example.app.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fuelAndLubricants")
public class FuelAndLubricantsController {
    @Autowired
    private FuelAndLubricantsService fuelAndLubricantsService;

    @PostMapping("")
    private ResponseEntity<FuelAndLubricantsDTO> add(@RequestBody FuelAndLubricantsDTO fuelAndLubricantsDTO){
        return ResponseEntity.status(HttpStatus.CREATED).body(fuelAndLubricantsService.add(fuelAndLubricantsDTO));
    }

    @GetMapping("")
    private ResponseEntity<List<FuelAndLubricantsDTO>> findAll(){
        return ResponseEntity.ok(fuelAndLubricantsService.findAll());
    }

    @GetMapping("/{id}")
    private ResponseEntity<FuelAndLubricantsDTO> findFuelAndLubricants(@PathVariable Long id){
        return ResponseEntity.ok(fuelAndLubricantsService.findFuelAndLubricants(id));
    }

    @PutMapping("/{id}")
    private ResponseEntity<FuelAndLubricantsDTO> updateFuelAndLubricants(@PathVariable Long id,
                                                              @RequestBody FuelAndLubricantsDTO fuelAndLubricantsDTO){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(fuelAndLubricantsService.update(fuelAndLubricantsDTO));
    }

    @DeleteMapping("/{id}")
    private ResponseEntity deleteFuelAndLubricants(@PathVariable Long id) {
        fuelAndLubricantsService.deleteById(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }

}
