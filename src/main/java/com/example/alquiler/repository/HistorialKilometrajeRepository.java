package com.example.alquiler.repository;

import com.example.alquiler.model.HistorialKilometraje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface HistorialKilometrajeRepository extends JpaRepository<HistorialKilometraje, Integer> {
    List<HistorialKilometraje> findByVehiculo_IdVehiculoOrderByFechaRegistroDesc(Integer idVehiculo);
}
