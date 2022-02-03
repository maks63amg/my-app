package com.example.app.mapper;

import com.example.app.dto.PersonDTO;
import com.example.app.entities.Person;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PersonMapperImpl implements PersonMapper {
    @Override
    public PersonDTO toPersonDTO(Person person) {
        if (person == null)
            return null;

        PersonDTO personDTO = new PersonDTO();
        personDTO.setId(person.getId());
        personDTO.setName(person.getName());
        personDTO.setLastName(person.getLastName());
        personDTO.setSecondName(person.getSecondName());
        personDTO.setMilitaryRank(person.getMilitaryRank());
        personDTO.setPosition(person.getPosition());

        return personDTO;
    }

    @Override
    public List<PersonDTO> toProductDTOs(List<Person> persons) {
        if (persons == null)
            return null;
        List<PersonDTO> personsDTO = persons.stream().map(this::toPersonDTO).collect(Collectors.toList());

        return personsDTO;
    }

    @Override
    public Person toPerson(PersonDTO personDTO) {
        if (personDTO == null)
            return null;

        Person person = new Person();
        person.setName(personDTO.getName());
        person.setLastName(personDTO.getLastName());
        person.setSecondName(personDTO.getSecondName());
        person.setMilitaryRank(personDTO.getMilitaryRank());
        person.setPosition(personDTO.getPosition());

        return person;
    }
}
