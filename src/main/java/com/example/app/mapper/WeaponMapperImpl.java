package com.example.app.mapper;

import com.example.app.dto.WeaponDTO;
import com.example.app.entities.Weapon;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class WeaponMapperImpl implements WeaponMapper {
    @Override
    public WeaponDTO toWeaponDTO(Weapon weapon) {
        if (weapon == null)
            return null;

        WeaponDTO weaponDTO = new WeaponDTO();
        weaponDTO.setId(weapon.getId());
        weaponDTO.setName(weapon.getName());
        weaponDTO.setCalibre(weapon.getCalibre());
        weaponDTO.setCountRound(weapon.getCountRound());

        return weaponDTO;
    }

    @Override
    public List<WeaponDTO> toWeaponDTOs(List<Weapon> weapons) {
        if (weapons == null)
            return null;

        List<WeaponDTO> weaponDTOs = weapons.stream().map(this::toWeaponDTO).collect(Collectors.toList());
        return null;
    }

    @Override
    public Weapon toWeapon(WeaponDTO weaponDTO) {
        if (weaponDTO == null)
            return null;

        Weapon weapon = new Weapon();
        weapon.setName(weaponDTO.getName());
        weapon.setCalibre(weaponDTO.getCalibre());
        weapon.setCountRound(weaponDTO.getCountRound());

        return weapon;
    }
}
