package com.example.alquiler.repository;

import com.example.alquiler.model.EstadoVehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface EstadoVehiculoRepository extends JpaRepository<EstadoVehiculo, Integer> {
    Optional<EstadoVehiculo> findByNombreEstadoIgnoreCase(String nombreEstado);
}
