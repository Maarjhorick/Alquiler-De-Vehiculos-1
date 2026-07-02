package com.example.alquiler.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.alquiler.model.EstadoAlquiler;
import com.example.alquiler.model.EstadoVehiculo;
@Repository
public interface EstadoVehiculoRepository extends JpaRepository<EstadoVehiculo, Integer> {
    Optional<EstadoVehiculo> findByNombreEstado(String nombreEstado);
    Optional<EstadoAlquiler> findByEstadoAlquilerIgnoreCase(String estadoAlquiler);

}
