package com.projectSystem.system.service;

import com.projectSystem.system.domain.enums.ReservationStatus;
import com.projectSystem.system.domain.model.RoomReservation;
import com.projectSystem.system.dto.RoomReservationDto;
import com.projectSystem.system.mapper.RoomReservationMapper;
import com.projectSystem.system.repository.RoomReservationRepository;
import com.projectSystem.system.service.serviceInter.RoomReservationInter;
import com.projectSystem.system.service.template.AbstractReservationTemplate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class RoomReservationService extends AbstractReservationTemplate<RoomReservationDto> implements RoomReservationInter {

    private final RoomReservationRepository roomReservationRepository;
    private final RoomReservationMapper roomReservationMapper;

    @Override
    public RoomReservationDto create(RoomReservationDto roomReservationDto) {
        RoomReservation entity = roomReservationMapper.toEntity(roomReservationDto);
        entity.setStatus(ReservationStatus.PENDING);
        roomReservationRepository.save(entity);
        return roomReservationMapper.toDto(entity);
    }

    @Override
    protected void validateCustom(RoomReservationDto dto) {
        if (dto.getCapacity() <= 0) {
            throw new IllegalArgumentException("La capacidad debe ser mayor que 0.");
        }
    }

    @Override
    protected LocalDateTime getStartDate(RoomReservationDto dto) {
        return getEndDate(dto);
    }

    @Override
    protected LocalDateTime getEndDate(RoomReservationDto dto) {
        return getStartDate(dto);
    }

    public RoomReservationDto validateAndCreateRoom(RoomReservationDto dto) {
        return this.validateAndCreate(dto);
    }
}
