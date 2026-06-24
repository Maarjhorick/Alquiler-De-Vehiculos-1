package com.example.alquiler_de_vehiculos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.alquiler_de_vehiculos.model.Marca;

public interface MarcaRepository extends JpaRepository<Marca, Integer> {
}

package com.example.alquiler.repository;

import com.example.alquiler.model.Marca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarcaRepository extends JpaRepository<Marca, Integer> {
    boolean existsByNombreMarcaIgnoreCase(String nombreMarca);
}
 main
