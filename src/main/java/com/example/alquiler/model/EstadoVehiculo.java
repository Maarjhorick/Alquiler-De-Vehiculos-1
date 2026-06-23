package com.example.alquiler.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "estadosvehiculo")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EstadoVehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estado")
    private Integer idEstado;

    @Column(name = "nombre_estado", length = 30, nullable = false)
    private String nombreEstado;
}
