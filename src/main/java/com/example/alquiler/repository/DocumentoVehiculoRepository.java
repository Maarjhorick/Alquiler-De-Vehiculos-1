package com.example.alquiler.repository;

import com.example.alquiler.model.DocumentoVehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface DocumentoVehiculoRepository extends JpaRepository<DocumentoVehiculo, Integer> {
    List<DocumentoVehiculo> findByVehiculo_IdVehiculo(Integer idVehiculo);
    List<DocumentoVehiculo> findByFechaVencimientoBefore(LocalDate fecha);
}
