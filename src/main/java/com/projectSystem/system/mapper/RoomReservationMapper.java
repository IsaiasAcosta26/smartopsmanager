package com.projectSystem.system.mapper;

import com.projectSystem.system.domain.model.RoomReservation;
import com.projectSystem.system.dto.RoomReservationDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RoomReservationMapper {
    RoomReservation toEntity(RoomReservationDto roomReservationDto);
    RoomReservationDto toDto(RoomReservation roomReservation);
}
