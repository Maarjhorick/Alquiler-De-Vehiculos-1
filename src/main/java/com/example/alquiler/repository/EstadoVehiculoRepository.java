package com.example.alquiler_de_vehiculos.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.alquiler_de_vehiculos.model.EstadoVehiculo;

@Repository
public interface EstadoVehiculoRepository extends JpaRepository<EstadoVehiculo, Integer> {
    Optional<EstadoVehiculo> findByNombreEstado(String nombreEstado);

package com.example.alquiler.repository;

import com.example.alquiler.model.EstadoVehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface EstadoVehiculoRepository extends JpaRepository<EstadoVehiculo, Integer> {
 main
    Optional<EstadoVehiculo> findByNombreEstadoIgnoreCase(String nombreEstado);
}
