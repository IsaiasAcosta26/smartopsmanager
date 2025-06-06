package com.projectSystem.system.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public class EquipmentReservationDto {

    @NotBlank(message = "Requester is required")
    private String requester;

    @NotNull(message = "Start date/time is required")
    private LocalDateTime startDateTime;

    @NotNull(message = "End date/time is required")
    private LocalDateTime endDateTime;

    @NotBlank(message = "Reason is required")
    private String reason;
}
