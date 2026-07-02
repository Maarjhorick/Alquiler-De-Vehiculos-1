package com.example.alquiler.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.alquiler.model.Vehiculo;

@Repository

public interface VehiculoRepository extends JpaRepository<Vehiculo, Integer> {
 Optional<Vehiculo> findFirstByEstadoNombreEstado(String nombreEstado);
 Optional<Vehiculo> findByPlaca(String placa);
 boolean existsByPlacaIgnoreCase(String placa);
 boolean existsByPlacaIgnoreCaseAndIdVehiculoNot(String placa, Integer idVehiculo);

}
