package com.projectSystem.system.domain.model;

import com.projectSystem.system.domain.enums.ReservationStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@NoArgsConstructor
@Table(name = "Reservations")
@Inheritance(strategy = InheritanceType.JOINED)
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String requester;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    private String reason;

    @Enumerated(EnumType.STRING)
    private ReservationStatus status;
}
