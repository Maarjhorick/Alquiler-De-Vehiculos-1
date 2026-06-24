package com.example.alquiler_de_vehiculos.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "combustibles")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
package com.example.alquiler.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "combustibles")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
 main
public class Combustible {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idCombustible;

    @Column(name = "nombre_combustible", nullable = false, length = 30)
    @Column(name = "id_combustible")
    private Integer idCombustible;

    @Column(name = "nombre_combustible", length = 30, nullable = false)
 main
    private String nombreCombustible;
}
