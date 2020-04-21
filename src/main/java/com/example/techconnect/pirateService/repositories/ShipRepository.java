package com.example.techconnect.pirateService.repositories;

import com.example.techconnect.pirateService.models.Ship;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipRepository extends JpaRepository<Ship, Long> {
}
