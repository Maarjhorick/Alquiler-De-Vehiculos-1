package com.example.alquiler.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.alquiler.model.Alquiler;

import java.time.LocalDate;
@Repository

public interface AlquilerRepository extends JpaRepository<Alquiler, Integer> {

  List<Alquiler> findByCliente_IdCliente(Integer idCliente);
  List<Alquiler> findByVehiculo_IdVehiculo(Integer idVehiculo);
  List<Alquiler> findByEstadoAlquiler_NombreEstadoIgnoreCase(String nombreEstado);

  @Query("SELECT a FROM Alquiler a " +
          "WHERE a.vehiculo.idVehiculo = :idVehiculo " +
           "AND a.estadoAlquiler.nombreEstado IN ('ACTIVO', 'RESERVADO') " +
           "AND (a.fechaInicio <= :fechaFin AND a.fechaFinEstimada >= :fechaInicio)")
  boolean existeCruceActivo(@Param("idVehiculo") Integer idVehiculo,
                            @Param("fechaInicio") LocalDate fechaInicio,
                            @Param("fechaFin") LocalDate fechaFin);

}
