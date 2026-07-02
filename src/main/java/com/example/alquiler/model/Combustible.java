package com.example.alquiler.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "combustibles")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class Combustible {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_combustible")
    private Integer idCombustible;

    @Column(name = "nombre_combustible", nullable = false, length = 30)  
    private String nombreCombustible;
}
