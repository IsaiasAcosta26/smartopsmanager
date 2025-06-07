package com.projectSystem.system.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class VehicleReservationDto {

    @NotBlank
    private String requester;

    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;

    @NotBlank
    private String reason;

    @NotBlank
    private String vehicleType;

    @NotBlank
    private String licensePlate;

    private boolean driverRequired;
}
