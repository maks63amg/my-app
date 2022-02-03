package com.example.app.repositories;

import com.example.app.entities.FuelAndLubricants;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuelAndLubricantsRepository extends JpaRepository<FuelAndLubricants,Long> {
}
