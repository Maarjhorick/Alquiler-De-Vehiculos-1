package com.example.alquiler.repository;

import com.example.alquiler.model.Marca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarcaRepository extends JpaRepository<Marca, Integer> {
    boolean existsByNombreMarcaIgnoreCase(String nombreMarca);
}
