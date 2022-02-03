package com.example.app.controllers;

import com.example.app.dto.PersonDTO;
import com.example.app.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {
    @Autowired
    private PersonService personService;

    @PostMapping("")
    private ResponseEntity<PersonDTO> add(@RequestBody PersonDTO personDTO){
        return ResponseEntity.status(HttpStatus.CREATED).body(personService.add(personDTO));
    }

    @GetMapping("")
    private ResponseEntity<List<PersonDTO>> findAll(){
        return ResponseEntity.ok(personService.findAll());
    }

    @GetMapping("/{id}")
    private ResponseEntity<PersonDTO> findPerson(@PathVariable Long id){
        return ResponseEntity.ok(personService.findPerson(id));
    }

    @PutMapping("/{id}")
    private ResponseEntity<PersonDTO> updatePerson(@PathVariable Long id, @RequestBody PersonDTO personDTO){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(personService.update(personDTO));
    }

    @DeleteMapping("/{id}")
    private ResponseEntity deletePerson(@PathVariable Long id) {
        personService.deleteById(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }
}
