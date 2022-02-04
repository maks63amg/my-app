package com.example.app.controllers;

import com.example.app.dto.RoundDTO;
import com.example.app.services.RoundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/round")
public class RoundController {
    @Autowired
    private RoundService roundService;

    @PostMapping("")
    private ResponseEntity<RoundDTO> add(@RequestBody RoundDTO roundDTO){
        return ResponseEntity.status(HttpStatus.CREATED).body(roundService.add(roundDTO));
    }

    @GetMapping("")
    private ResponseEntity<List<RoundDTO>> findAll(){
        return ResponseEntity.ok(roundService.findAll());
    }

    @GetMapping("/{id}")
    private ResponseEntity<RoundDTO> findRound(@PathVariable Long id){
        return ResponseEntity.ok(roundService.findRound(id));
    }

    @PutMapping("/{id}")
    private ResponseEntity<RoundDTO> updateRound(@PathVariable Long id, @RequestBody RoundDTO roundDTO){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(roundService.update(roundDTO));
    }

    @DeleteMapping("/{id}")
    private ResponseEntity deleteRound(@PathVariable Long id) {
        roundService.deleteById(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }
}
