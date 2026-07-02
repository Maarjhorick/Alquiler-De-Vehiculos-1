package com.example.alquiler.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.alquiler.model.TipoVehiculo;
@Repository

public interface TipoVehiculoRepository extends JpaRepository<TipoVehiculo, Integer> {
}
