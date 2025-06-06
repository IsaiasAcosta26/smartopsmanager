package com.projectSystem.system.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter@Getter
@NoArgsConstructor
@Table(name = "room_reservations")
public class RoomReservation extends Reservation {

    @Column(name = "capacity")
    private int capacity;

    @Column(name = "floor")
    private String floor;
}
