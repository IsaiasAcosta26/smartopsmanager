package com.projectSystem.system.repository;

import com.projectSystem.system.domain.model.RoomReservation;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;

@Registered
public interface RoomReservationRepository extends JpaRepository<RoomReservation, Integer> {
}
