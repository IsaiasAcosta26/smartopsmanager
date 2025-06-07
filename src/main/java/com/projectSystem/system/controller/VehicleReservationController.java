package com.projectSystem.system.controller;

import com.projectSystem.system.dto.VehicleReservationDto;
import com.projectSystem.system.service.VehicleReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/vehicle")
public class VehicleReservationController {

    private final VehicleReservationService vehicleReservationService;

    @PostMapping("/save")
    public ResponseEntity<VehicleReservationDto> create(@RequestBody VehicleReservationDto VehicleReservationDto) {
        vehicleReservationService.create(VehicleReservationDto);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(vehicleReservationService.validateAndCreate(VehicleReservationDto));
    }

}
