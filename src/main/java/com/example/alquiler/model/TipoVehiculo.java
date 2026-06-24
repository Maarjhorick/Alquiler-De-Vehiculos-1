package com.example.alquiler.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tiposvehiculo")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TipoVehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo")
    private Integer idTipo;

    @Column(name = "nombre_tipo", length = 50, nullable = false)
    private String nombreTipo;
}
