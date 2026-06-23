package com.example.alquiler.repository;

import com.example.alquiler.model.EstadoAlquiler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface EstadoAlquilerRepository extends JpaRepository<EstadoAlquiler, Integer> {
    Optional<EstadoAlquiler> findByNombreEstadoIgnoreCase(String nombreEstado);
}
