package com.example.app.controllers;

import com.example.app.dto.WeaponDTO;
import com.example.app.services.WeaponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/weapon")
public class WeaponController {
    @Autowired
    private WeaponService weaponService;

    @PostMapping("")
    private ResponseEntity<WeaponDTO> add(@RequestBody WeaponDTO weaponDTO){
        return ResponseEntity.status(HttpStatus.CREATED).body(weaponService.add(weaponDTO));
    }

    @GetMapping("")
    private ResponseEntity<List<WeaponDTO>> findAll(){
        return ResponseEntity.ok(weaponService.findAll());
    }

    @GetMapping("/{id}")
    private ResponseEntity<WeaponDTO> findWeapon(@PathVariable Long id){
        return ResponseEntity.ok(weaponService.findWeapon(id));
    }

    @PutMapping("/{id}")
    private ResponseEntity<WeaponDTO> updateWeapon(@PathVariable Long id, @RequestBody WeaponDTO weaponDTO){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(weaponService.update(weaponDTO));
    }

    @DeleteMapping("/{id}")
    private ResponseEntity deleteWeapon(@PathVariable Long id) {
        weaponService.deleteById(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }
}
