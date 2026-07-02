package com.example.alquiler.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.alquiler.model.Rol;

@Repository

public interface RolRepository extends JpaRepository<Rol, Integer> {

    Optional<Rol> findByNombreRol(String nombreRol);
    Optional<Rol> findByNombreRolIgnoreCase(String nombreRol);
}
