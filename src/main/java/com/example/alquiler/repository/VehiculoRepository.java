package com.example.alquiler_de_vehiculos.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.alquiler_de_vehiculos.model.Vehiculo;

@Repository
public interface VehiculoRepository extends JpaRepository<Vehiculo, Integer> {
 Optional<Vehiculo> findFirstByEstadoNombreEstado(String nombreEstado);
 boolean existsByPlacaIgnoreCase(String placa);
 boolean existsByPlacaIgnoreCaseAndIdVehiculoNot(String placa, Integer idVehiculo);

package com.example.alquiler.repository;

import com.example.alquiler.model.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface VehiculoRepository extends JpaRepository<Vehiculo, Integer> {
    Optional<Vehiculo> findByPlaca(String placa);
    List<Vehiculo> findByEstadoVehiculo_NombreEstadoIgnoreCase(String nombreEstado);
    boolean existsByPlaca(String placa);
 main
}
