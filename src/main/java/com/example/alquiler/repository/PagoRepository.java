package com.example.alquiler.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.alquiler.model.Pago;

@Repository

public interface PagoRepository extends JpaRepository<Pago, Integer> {
    List<Pago> findByAlquiler_IdAlquiler(Integer idAlquiler);
    List<Pago> findByEstadoPagoIgnoreCase(String estadoPago);

}
