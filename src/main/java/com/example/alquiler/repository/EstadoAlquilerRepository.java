package com.example.alquiler.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.alquiler.model.EstadoAlquiler;
@Repository
public interface EstadoAlquilerRepository extends JpaRepository<EstadoAlquiler, Integer> {
    Optional<EstadoAlquiler> findByEstadoAlquilerIgnoreCase(String estadoAlquiler);
    Optional<EstadoAlquiler> findByNombreEstadoIgnoreCase(String nombreEstado);

}
