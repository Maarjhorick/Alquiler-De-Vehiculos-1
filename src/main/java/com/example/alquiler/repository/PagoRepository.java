package com.example.alquiler_de_vehiculos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.alquiler_de_vehiculos.model.Pago;

@Repository
public interface PagoRepository extends JpaRepository<Pago, Integer> {

    List<Pago> findByAlquiler_IdAlquiler(Integer idAlquiler);

package com.example.alquiler.repository;

import com.example.alquiler.model.Pago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface PagoRepository extends JpaRepository<Pago, Integer> {
    Optional<Pago> findByAlquiler_IdAlquiler(Integer idAlquiler);
    List<Pago> findByEstadoPagoIgnoreCase(String estadoPago);
 main
}
