package com.projectSystem.system.service;

import com.projectSystem.system.domain.enums.ReservationStatus;
import com.projectSystem.system.domain.model.VehicleReservation;
import com.projectSystem.system.dto.VehicleReservationDto;
import com.projectSystem.system.mapper.VehicleReservationMapper;
import com.projectSystem.system.repository.VehicleReservationRepository;
import com.projectSystem.system.service.serviceInter.VehicleReservationInterf;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VehicleReservationService implements VehicleReservationInterf {

    private  final VehicleReservationRepository vehicleReservationRepository;
    private final VehicleReservationMapper vehicleReservationMapper;

    @Override
    public VehicleReservationDto create(VehicleReservationDto vehicleReservationDto) {
        VehicleReservation entity = vehicleReservationMapper.toEntity(vehicleReservationDto);
        entity.setStatus(ReservationStatus.PENDING);
        vehicleReservationRepository.save(entity);
        return vehicleReservationMapper.toDto(entity);
    }

}
