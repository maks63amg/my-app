package com.example.app.services;

import com.example.app.dto.PersonDTO;
import com.example.app.dto.RoundDTO;
import com.example.app.entities.Person;
import com.example.app.entities.Round;
import com.example.app.mapper.RoundMapperImpl;
import com.example.app.repositories.RoundRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoundService {
    @Autowired
    private RoundRepository roundRepository;
    @Autowired
    private RoundMapperImpl roundMapper;

    public RoundDTO add(RoundDTO roundDTO) {
        roundRepository.save(roundMapper.toRound(roundDTO));

        return roundDTO;
    }

    public List<RoundDTO> findAll() {
        return roundMapper.toRoundDTOs(roundRepository.findAll());
    }

    public RoundDTO findRound(long id) {
        return roundMapper.toRoundDTO(roundRepository.getById(id));
    }

    public void deleteById(Long id) {
        roundRepository.deleteById(id);
    }

    public RoundDTO update(RoundDTO roundDTO) {
        Round round = roundMapper.toRound(roundDTO);
        round.setId(roundDTO.getId());

        roundRepository.save(round);
        return roundDTO;
    }
}
