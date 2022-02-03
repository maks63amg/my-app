package com.example.app.mapper;

import com.example.app.dto.FuelAndLubricantsDTO;
import com.example.app.entities.FuelAndLubricants;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class FuelAndLubricantsMapperImpl implements FuelAndLubricantsMapper {
    @Override
    public FuelAndLubricantsDTO toFuelAndLubricantsDTO(FuelAndLubricants fuelAndLubricants) {
        if (fuelAndLubricants == null)
            return null;

        FuelAndLubricantsDTO fuelAndLubricantsDTO = new FuelAndLubricantsDTO();
        fuelAndLubricantsDTO.setId(fuelAndLubricants.getId());
        fuelAndLubricantsDTO.setName(fuelAndLubricants.getName());
        fuelAndLubricantsDTO.setVolume(fuelAndLubricants.getVolume());

        return fuelAndLubricantsDTO;
    }

    @Override
    public List<FuelAndLubricantsDTO> toFuelAndLubricantsDTOs(List<FuelAndLubricants> fuelAndLubricants) {
        if (fuelAndLubricants == null)
            return null;

        List<FuelAndLubricantsDTO> fuelAndLubricantsDTOs = fuelAndLubricants.stream().map(this::toFuelAndLubricantsDTO)
                .collect(Collectors.toList());
        return fuelAndLubricantsDTOs;
    }

    @Override
    public FuelAndLubricants toFuelAndLubricants(FuelAndLubricantsDTO fuelAndLubricantsDTO) {
        if (fuelAndLubricantsDTO == null)
            return null;

        FuelAndLubricants fuelAndLubricants = new FuelAndLubricants();
        fuelAndLubricants.setName(fuelAndLubricantsDTO.getName());
        fuelAndLubricants.setVolume(fuelAndLubricantsDTO.getVolume());

        return fuelAndLubricants;
    }
}
