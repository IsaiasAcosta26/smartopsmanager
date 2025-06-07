package com.projectSystem.system.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter@Setter
@NoArgsConstructor
@Table(name = "equipment_reservations")
public class EquipmentReservation extends Reservation {

    @Column(name = "equipment_type")
    private String equipmentType;

    @Column(name = "serial_number")
    private String serialNumber;

    @Column(name = "requires_operator")
    private boolean requiresOperator;
}
