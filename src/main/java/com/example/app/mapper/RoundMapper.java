package com.example.app.mapper;

import com.example.app.dto.RoundDTO;
import com.example.app.dto.WeaponDTO;
import com.example.app.entities.Round;
import com.example.app.entities.Weapon;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface RoundMapper {
    RoundDTO toRoundDTO(Round round);

    List<RoundDTO> toRoundDTOs(List<Round> rounds);

    Round toRound(RoundDTO roundDTO);
}
