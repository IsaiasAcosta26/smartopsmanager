package com.projectSystem.system.controller;

import com.projectSystem.system.domain.model.RoomReservation;
import com.projectSystem.system.dto.RoomReservationDto;
import com.projectSystem.system.service.RoomReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/room")
public class RoomReservationController {

    private final RoomReservationService roomReservationService;

    @PostMapping("/save")
    public ResponseEntity<RoomReservationDto> create(@RequestBody RoomReservationDto roomReservationDto) {
        roomReservationService.create(roomReservationDto);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(roomReservationService.validateAndCreateRoom(roomReservationDto));
    }
}
