package com.projectSystem.system.service;

import com.projectSystem.system.domain.enums.ReservationStatus;
import com.projectSystem.system.domain.model.VehicleReservation;
import com.projectSystem.system.dto.VehicleReservationDto;
import com.projectSystem.system.mapper.VehicleReservationMapper;
import com.projectSystem.system.repository.VehicleReservationRepository;
import com.projectSystem.system.service.serviceInter.VehicleReservationInterf;
import com.projectSystem.system.service.template.AbstractReservationTemplate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class VehicleReservationService extends AbstractReservationTemplate<VehicleReservationDto> implements VehicleReservationInterf {

    private  final VehicleReservationRepository vehicleReservationRepository;
    private final VehicleReservationMapper vehicleReservationMapper;

    @Override
    public VehicleReservationDto create(VehicleReservationDto vehicleReservationDto) {
        VehicleReservation entity = vehicleReservationMapper.toEntity(vehicleReservationDto);
        entity.setStatus(ReservationStatus.PENDING);
        vehicleReservationRepository.save(entity);
        return vehicleReservationMapper.toDto(entity);
    }

    @Override
    protected void validateCustom(VehicleReservationDto dto) {
        if(dto.getVehicleType() == null || dto.getVehicleType().isBlank()) {
            throw new IllegalArgumentException("La placa del vehículo es obligatoria.");
        }
    }

    @Override
    protected LocalDateTime getStartDate(VehicleReservationDto dto) {
        return getStartDate(dto);
    }

    @Override
    protected LocalDateTime getEndDate(VehicleReservationDto dto) {
        return getEndDate(dto);
    }


}
