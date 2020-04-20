package com.example.techconnect.pirateService.repositories;
import com.example.techconnect.pirateService.models.Pirate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PirateRepository extends JpaRepository<Pirate, Long>{
}
