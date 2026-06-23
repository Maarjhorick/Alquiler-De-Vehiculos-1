package com.example.alquiler.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "combustibles")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Combustible {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_combustible")
    private Integer idCombustible;

    @Column(name = "nombre_combustible", length = 30, nullable = false)
    private String nombreCombustible;
}
