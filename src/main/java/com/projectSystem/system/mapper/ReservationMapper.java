package com.projectSystem.system.mapper;

import com.projectSystem.system.domain.model.Reservation;
import com.projectSystem.system.dto.ReservationDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ReservationMapper {
    Reservation toEntity(ReservationDto reservationDto);
    ReservationDto toDto(Reservation reservation);
}
