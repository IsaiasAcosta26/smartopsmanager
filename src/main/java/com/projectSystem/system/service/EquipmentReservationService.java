package com.projectSystem.system.service;

import com.projectSystem.system.domain.model.EquipmentReservation;
import com.projectSystem.system.dto.EquipmentReservationDto;
import com.projectSystem.system.mapper.EquipmentReservationMapper;
import com.projectSystem.system.repository.EquipmentReservationRepository;
import com.projectSystem.system.service.serviceInter.EquipmentReservationInterf;
import com.projectSystem.system.service.template.AbstractReservationTemplate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class EquipmentReservationService extends AbstractReservationTemplate<EquipmentReservationDto> implements EquipmentReservationInterf {

    private final EquipmentReservationRepository equipmentReservationRepository;
    private final EquipmentReservationMapper equipmentReservationMapper;

    @Override
    public EquipmentReservationDto create(EquipmentReservationDto equipmentReservationDto) {
        EquipmentReservation entity = equipmentReservationMapper.toEntity(equipmentReservationDto);
        equipmentReservationRepository.save(entity);
        return equipmentReservationMapper.toDto(entity);
    }

    @Override
    protected void validateCustom(EquipmentReservationDto dto) {
        if(dto.getEquipmentType() == null || dto.getEquipmentType().isBlank()){
            throw new IllegalArgumentException("El tipo de equipo es obligatorio.");
        }
    }

    @Override
    protected LocalDateTime getStartDate(EquipmentReservationDto dto) {
        return getStartDate(dto);
    }

    @Override
    protected LocalDateTime getEndDate(EquipmentReservationDto dto) {
        return getEndDate(dto);
    }

}
