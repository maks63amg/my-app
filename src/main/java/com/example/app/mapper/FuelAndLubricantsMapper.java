package com.example.app.mapper;

import com.example.app.dto.FuelAndLubricantsDTO;
import com.example.app.entities.FuelAndLubricants;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface FuelAndLubricantsMapper {
    FuelAndLubricantsDTO toFuelAndLubricantsDTO(FuelAndLubricants fuelAndLubricants);

    List<FuelAndLubricantsDTO> toFuelAndLubricantsDTOs(List<FuelAndLubricants> fuelAndLubricants);

    FuelAndLubricants toFuelAndLubricants(FuelAndLubricantsDTO fuelAndLubricantsDTO);
}
