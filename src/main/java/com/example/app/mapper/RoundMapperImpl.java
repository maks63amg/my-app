package com.example.app.mapper;

import com.example.app.dto.RoundDTO;
import com.example.app.entities.Round;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class RoundMapperImpl implements RoundMapper {
    @Override
    public RoundDTO toRoundDTO(Round round) {
        if (round == null)
            return null;

        RoundDTO roundDTO = new RoundDTO();
        roundDTO.setId(round.getId());
        roundDTO.setCalibre(round.getCalibre());
        roundDTO.setCount(round.getCount());

        return roundDTO;
    }

    @Override
    public List<RoundDTO> toRoundDTOs(List<Round> rounds) {
        if (rounds == null)
            return null;

        List<RoundDTO> roundDTOs = rounds.stream().map(this::toRoundDTO).collect(Collectors.toList());
        return roundDTOs;
    }

    @Override
    public Round toRound(RoundDTO roundDTO) {
        if (roundDTO == null)
            return null;

        Round round = new Round();
        round.setCount(roundDTO.getCount());
        round.setCalibre(roundDTO.getCalibre());
        return round;
    }
}
