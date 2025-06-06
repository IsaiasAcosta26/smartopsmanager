package com.projectSystem.system.service;

import com.projectSystem.system.domain.model.EquipmentReservation;
import com.projectSystem.system.dto.EquipmentReservationDto;
import com.projectSystem.system.mapper.EquipmentReservationMapper;
import com.projectSystem.system.repository.EquipmentReservationRepository;
import com.projectSystem.system.service.serviceInter.EquipmentReservationInterf;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EquipmentReservationService implements EquipmentReservationInterf {

    private final EquipmentReservationRepository equipmentReservationRepository;
    private final EquipmentReservationMapper equipmentReservationMapper;

    @Override
    public EquipmentReservationDto create(EquipmentReservationDto equipmentReservationDto) {
        EquipmentReservation entity = equipmentReservationMapper.toEntity(equipmentReservationDto);
        equipmentReservationRepository.save(entity);
        return equipmentReservationMapper.toDto(entity);
    }

}
