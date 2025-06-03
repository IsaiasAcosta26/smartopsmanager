package com.projectSystem.system.controller;

import com.projectSystem.system.dto.ReservationDto;
import com.projectSystem.system.service.serviceInter.ReservacionInter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/reservations")
public class ReservationController {

    @Autowired
    private final ReservacionInter reservationInter;

    @PostMapping("/save")
    public ResponseEntity<ReservationDto> save(@RequestBody ReservationDto reservationDto) {
        reservationInter.seve(reservationDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(reservationDto);
    }
}
