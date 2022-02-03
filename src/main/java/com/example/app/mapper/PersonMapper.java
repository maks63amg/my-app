package com.example.app.mapper;

import com.example.app.dto.PersonDTO;
import com.example.app.entities.Person;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface PersonMapper  {
    PersonDTO toPersonDTO(Person person);

    List<PersonDTO> toProductDTOs(List<Person> products);

    Person toPerson(PersonDTO personDTO);
}
