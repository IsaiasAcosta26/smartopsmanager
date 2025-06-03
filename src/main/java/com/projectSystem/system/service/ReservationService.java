package com.projectSystem.system.service;

import com.projectSystem.system.domain.enums.ReservationStatus;
import com.projectSystem.system.domain.model.Reservation;
import com.projectSystem.system.dto.ReservationDto;
import com.projectSystem.system.mapper.ReservationMapper;
import com.projectSystem.system.repository.ReservationRepository;
import com.projectSystem.system.service.serviceInter.ReservacionInter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReservationService implements ReservacionInter {

    private final ReservationRepository reservationRepository;

    private final ReservationMapper reservationMapper;


    @Override
    public ReservationDto seve(ReservationDto reservationDto) {
        Reservation entity = reservationMapper.toEntity(reservationDto);
        entity.setStatus(ReservationStatus.PENDING);
        entity = reservationRepository.save(entity);
        return reservationMapper.toDto(entity);
    }
}
