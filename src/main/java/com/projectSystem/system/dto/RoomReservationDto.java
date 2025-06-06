package com.projectSystem.system.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

 @Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RoomReservationDto {

    @NotBlank(message = "Requester is required")
    private String requester;

    @NotNull(message = "Start date/time is required")
    private LocalDateTime startDateTime;

    @NotNull(message = "End date/time is required")
    private LocalDateTime endDateTime;

    @NotBlank(message = "Reason is required")
    private String reason;

     @NotBlank(message = "Floor is required")
     private String floor;

     @NotBlank(message = "Capacity is required")
     private int capacity;

 }