package com.example.alquiler.repository;

import com.example.alquiler.model.Combustible;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CombustibleRepository extends JpaRepository<Combustible, Integer> {
}
