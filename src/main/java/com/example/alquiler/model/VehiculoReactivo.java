package com.alquiler.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("vehiculos")
public record VehiculoReactivo (@Id Integer id, String marca, String modelo, double precioDia, boolean disponible) {}