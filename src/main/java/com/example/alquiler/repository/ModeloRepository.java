package com.example.alquiler.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.alquiler.model.Modelo;
@Repository

public interface ModeloRepository extends JpaRepository<Modelo, Integer> {
    List<Modelo> findByMarca_IdMarca(Integer idMarca);

}
