package com.example.app.services;

import com.example.app.dto.PersonDTO;
import com.example.app.entities.Person;
import com.example.app.mapper.PersonMapperImpl;
import com.example.app.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private PersonMapperImpl personMapper;

    public PersonDTO add(PersonDTO personDTO) {
        personRepository.save(personMapper.toPerson(personDTO));

        return personDTO;
    }

    public List<PersonDTO> findAll() {
        return personMapper.toProductDTOs(personRepository.findAll());
    }

    public PersonDTO findPerson(long id) {
        return personMapper.toPersonDTO(personRepository.getById(id));
    }

    public void deleteById(Long id) {
        personRepository.deleteById(id);
    }

    public PersonDTO update(PersonDTO personDTO) {
        Person person = personMapper.toPerson(personDTO);
        person.setId(personDTO.getId());

        personRepository.save(person);
        return personDTO;
    }
}
