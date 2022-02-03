package com.example.app.mapper;

import com.example.app.dto.WeaponDTO;
import com.example.app.entities.Weapon;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper
public interface WeaponMapper {
    WeaponDTO toWeaponDTO(Weapon weapon);

    List<WeaponDTO> toWeaponDTOs(List<Weapon> weapons);

    Weapon toWeapon(WeaponDTO weaponDTO);
}
