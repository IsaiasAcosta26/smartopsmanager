package com.projectSystem.system.mapper;

import com.projectSystem.system.domain.model.VehicleReservation;
import com.projectSystem.system.dto.VehicleReservationDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VehicleReservationMapper {
    VehicleReservation toEntity(VehicleReservationDto vehicleReservationDto);
    VehicleReservationDto toDto(VehicleReservation vehicleReservation);
}
