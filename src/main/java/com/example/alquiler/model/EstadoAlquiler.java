package com.example.alquiler.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "estadosalquiler")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class EstadoAlquiler {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estado_alquiler")
    private Integer idEstadoAlquiler;

    @Column(name = "nombre_estado", length = 30, nullable = false)
    private String nombreEstado;
}
