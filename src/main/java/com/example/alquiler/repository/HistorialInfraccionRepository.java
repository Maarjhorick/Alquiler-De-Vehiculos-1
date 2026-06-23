package com.example.alquiler.repository;

import com.example.alquiler.model.HistorialInfraccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface HistorialInfraccionRepository extends JpaRepository<HistorialInfraccion, Integer> {
    List<HistorialInfraccion> findByVehiculo_IdVehiculo(Integer idVehiculo);
    List<HistorialInfraccion> findByAlquiler_IdAlquiler(Integer idAlquiler);
    List<HistorialInfraccion> findByEstadoPagoIgnoreCase(String estadoPago);
}
