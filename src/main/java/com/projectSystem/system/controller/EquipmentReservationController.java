package com.projectSystem.system.controller;

import com.projectSystem.system.dto.EquipmentReservationDto;
import com.projectSystem.system.service.EquipmentReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/equipment")
public class EquipmentReservationController {

    private final EquipmentReservationService equipmentReservationService;

    @PostMapping("/save")
    public ResponseEntity<EquipmentReservationDto> create(@RequestBody EquipmentReservationDto EquipmentReservationDto) {
        equipmentReservationService.create(EquipmentReservationDto);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(equipmentReservationService.validateAndCreate(EquipmentReservationDto));
    }
}
