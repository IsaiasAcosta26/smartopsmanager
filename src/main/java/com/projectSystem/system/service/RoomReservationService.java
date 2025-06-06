package com.projectSystem.system.service;

import com.projectSystem.system.domain.enums.ReservationStatus;
import com.projectSystem.system.domain.model.RoomReservation;
import com.projectSystem.system.dto.ReservationDto;
import com.projectSystem.system.dto.RoomReservationDto;
import com.projectSystem.system.mapper.RoomReservationMapper;
import com.projectSystem.system.repository.RoomReservationRepository;
import com.projectSystem.system.service.serviceInter.RoomReservationInter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoomReservationService implements RoomReservationInter {

    private final RoomReservationRepository roomReservationRepository;
    private final RoomReservationMapper roomReservationMapper;


    @Override
    public RoomReservationDto create(RoomReservationDto roomReservationDto) {
        RoomReservation entity = roomReservationMapper.toEntity(roomReservationDto);
        entity.setStatus(ReservationStatus.PENDING);
        roomReservationRepository.save(entity);
        return roomReservationMapper.toDto(entity);
    }
}
