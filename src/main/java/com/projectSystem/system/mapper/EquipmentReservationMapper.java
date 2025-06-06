package com.projectSystem.system.mapper;

import com.projectSystem.system.domain.model.EquipmentReservation;
import com.projectSystem.system.dto.EquipmentReservationDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EquipmentReservationMapper {
    EquipmentReservation toEntity (EquipmentReservationDto equipmentReservationDto);
    EquipmentReservationDto toDto (EquipmentReservation equipmentReservation);
}
