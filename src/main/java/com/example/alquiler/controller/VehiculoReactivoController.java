package com.alquiler.api.controller;

import com.alquiler.api.model.VehiculoReactivo;
import com.alquiler.api.repository.VehiculoReactivoRepository;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/reactivo/vehiculos")
public class VehiculoReactivoController {

    private final VehiculoReactivoRepository repository;

    public VehiculoReactivoController(VehiculoReactivoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Flux<VehiculoReactivo> getAllVehiculos() {
        return repository.findAll(); // Retorna un flujo asíncrono no bloqueante
    }
}