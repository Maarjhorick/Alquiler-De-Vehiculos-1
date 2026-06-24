package com.example.alquiler_de_vehiculos.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.alquiler_de_vehiculos.model.EstadoAlquiler;

@Repository
public interface EstadoAlquilerRepository extends JpaRepository<EstadoAlquiler, Integer> {
    Optional<EstadoAlquiler> findByEstadoAlquilerIgnoreCase(String estadoAlquiler);

package com.example.alquiler.repository;

import com.example.alquiler.model.EstadoAlquiler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface EstadoAlquilerRepository extends JpaRepository<EstadoAlquiler, Integer> {
    Optional<EstadoAlquiler> findByNombreEstadoIgnoreCase(String nombreEstado);
 main
}
