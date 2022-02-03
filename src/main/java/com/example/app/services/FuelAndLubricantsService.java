package com.example.app.services;

import com.example.app.dto.FuelAndLubricantsDTO;
import com.example.app.entities.FuelAndLubricants;
import com.example.app.mapper.FuelAndLubricantsMapper;
import com.example.app.repositories.FuelAndLubricantsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuelAndLubricantsService {
    @Autowired
    private FuelAndLubricantsRepository fuelAndLubricantsRepository;
    @Autowired
    private FuelAndLubricantsMapper fuelAndLubricantsMapper;

    public FuelAndLubricantsDTO add(FuelAndLubricantsDTO fuelAndLubricantsDTO) {
        fuelAndLubricantsRepository.save(fuelAndLubricantsMapper.toFuelAndLubricants(fuelAndLubricantsDTO));

        return fuelAndLubricantsDTO;
    }

    public List<FuelAndLubricantsDTO> findAll() {
        return fuelAndLubricantsMapper.toFuelAndLubricantsDTOs(fuelAndLubricantsRepository.findAll());
    }

    public FuelAndLubricantsDTO findFuelAndLubricants(long id) {
        return fuelAndLubricantsMapper.toFuelAndLubricantsDTO(fuelAndLubricantsRepository.getById(id));
    }

    public void deleteById(Long id) {
        fuelAndLubricantsRepository.deleteById(id);
    }

    public FuelAndLubricantsDTO update(FuelAndLubricantsDTO fuelAndLubricantsDTO) {
        FuelAndLubricants fuelAndLubricants = fuelAndLubricantsMapper.toFuelAndLubricants(fuelAndLubricantsDTO);
        fuelAndLubricants.setId(fuelAndLubricantsDTO.getId());

        fuelAndLubricantsRepository.save(fuelAndLubricants);
        return fuelAndLubricantsDTO;
    }
}
