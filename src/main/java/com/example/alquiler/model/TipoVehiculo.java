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
@Table(name = "tiposvehiculo")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

package com.example.alquiler.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tiposvehiculo")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
 main
public class TipoVehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTipo;

    @Column(name = "nombre_tipo", nullable = false, unique = true)

    @Column(name = "id_tipo")
    private Integer idTipo;

    @Column(name = "nombre_tipo", length = 50, nullable = false)
 main
    private String nombreTipo;
}
