package com.alquiler.api.repository;

import com.alquiler.api.model.VehiculoReactivo;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface VehiculoReactivoRepository extends ReactiveCrudRepository<VehiculoReactivo, Integer> {}