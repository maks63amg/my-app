package com.example.app.services;

import com.example.app.dto.WeaponDTO;
import com.example.app.entities.Weapon;
import com.example.app.mapper.WeaponMapperImpl;
import com.example.app.repositories.WeaponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class WeaponService {
    @Autowired
    private WeaponRepository weaponRepository;
    @Autowired
    private WeaponMapperImpl weaponMapper;

    public WeaponDTO add(WeaponDTO weaponDTO) {
        weaponRepository.save(weaponMapper.toWeapon(weaponDTO));

        return weaponDTO;
    }

    public List<WeaponDTO> findAll() {
        return weaponMapper.toWeaponDTOs(weaponRepository.findAll());
    }

    public WeaponDTO findWeapon(long id) {
        return weaponMapper.toWeaponDTO(weaponRepository.getById(id));
    }

    public void deleteById(Long id) {
        weaponRepository.deleteById(id);
    }

    public WeaponDTO update(WeaponDTO weaponDTO) {
        Weapon weapon = weaponMapper.toWeapon(weaponDTO);
        weapon.setId(weaponDTO.getId());

        weaponRepository.save(weapon);
        return weaponDTO;
    }
}
