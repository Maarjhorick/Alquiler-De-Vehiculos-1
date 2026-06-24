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
@Table(name = "metodospago")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
package com.example.alquiler.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "metodospago")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
 main
public class MetodoPago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMetodoPago;

    @Column(name = "nombre_metodo", nullable = false, unique = true)
    @Column(name = "id_metodo_pago")
    private Integer idMetodoPago;

    @Column(name = "nombre_metodo", length = 30, nullable = false)
 main
    private String nombreMetodo;
}
