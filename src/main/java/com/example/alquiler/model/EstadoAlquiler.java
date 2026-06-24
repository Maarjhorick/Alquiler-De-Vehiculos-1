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
@Table(name = "estadosalquiler")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

package com.example.alquiler.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "estadosalquiler")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
 main
public class EstadoAlquiler {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEstadoAlquiler;

    @Column(name = "nombre_estado")

    @Column(name = "id_estado_alquiler")
    private Integer idEstadoAlquiler;

    @Column(name = "nombre_estado", length = 30, nullable = false)
 main
    private String nombreEstado;
}
