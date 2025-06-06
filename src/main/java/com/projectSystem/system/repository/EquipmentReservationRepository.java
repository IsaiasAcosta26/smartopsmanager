package com.projectSystem.system.repository;

import com.projectSystem.system.domain.model.EquipmentReservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipmentReservationRepository extends JpaRepository<EquipmentReservation, Integer> {
}
