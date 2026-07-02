package com.example.alquiler.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.alquiler.model.Marca;

@Repository
public interface MarcaRepository extends JpaRepository<Marca, Integer> {
    boolean existsByNombreMarcaIgnoreCase(String nombreMarca);
}
