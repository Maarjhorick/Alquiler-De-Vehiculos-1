package com.example.alquiler_de_vehiculos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.alquiler_de_vehiculos.model.TipoVehiculo;


package com.example.alquiler.repository;

import com.example.alquiler.model.TipoVehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

 main
@Repository
public interface TipoVehiculoRepository extends JpaRepository<TipoVehiculo, Integer> {
}
