package com.projectSystem.system.repository;

import com.projectSystem.system.domain.model.VehicleReservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleReservationRepository extends JpaRepository<VehicleReservation, Long> {
}
