package com.example.alquiler_de_vehiculos.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

@Entity
@Table(name = "vehiculos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

package com.example.alquiler.model;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;

@Entity
@Table(name = "vehiculos")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
 main
public class Vehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vehiculo")
    private Integer idVehiculo;

    @NotBlank
    @Column(nullable = false, unique = true, length = 20)
    private String placa;

    @Column(length = 50)
    @NotBlank

    @Column(name = "placa", length = 15, nullable = false, unique = true)
    private String placa;

    @Column(name = "color", length = 30)
 main
    private String color;

    @Column(name = "anio")
    private Integer anio;

    @NotBlank
    @Column(name = "numero_motor", unique = true, nullable = false, length = 20)
    private String numeroMotor;

    @NotBlank
    @Column(name = "numero_vin", unique = true, nullable = false, length = 17)
    private String numeroVin;

    @NotNull
    @PositiveOrZero
    @Column(name = "precio_dia", precision = 10, scale = 2, nullable = false)
    private BigDecimal precioDia;

    @NotNull
    @PositiveOrZero
    @Column(name = "precio_hora", precision = 10, scale = 2, nullable = false)
    private BigDecimal precioHora;

    // Relaciones con otras tablas
    @ManyToOne
    @JoinColumn(name = "id_modelo", nullable = false)
    @NotNull
    @Valid

    @Column(name = "numero_motor", length = 30)
    private String numeroMotor;

    @Column(name = "numero_vin", length = 17)
    private String numeroVin;

    @Column(name = "precio_dia", precision = 10, scale = 2)
    private BigDecimal precioDia;

    @Column(name = "precio_hora", precision = 10, scale = 2)
    private BigDecimal precioHora;

    @ManyToOne
    @JoinColumn(name = "id_modelo", nullable = false)
 main
    private Modelo modelo;

    @ManyToOne
    @JoinColumn(name = "id_tipo", nullable = false)
    @NotNull
    @Valid
    private TipoVehiculo tipo;

    @ManyToOne
    @JoinColumn(name = "id_combustible", nullable = false)
    @NotNull
    @Valid

    private TipoVehiculo tipoVehiculo;

    @ManyToOne
    @JoinColumn(name = "id_combustible", nullable = false)
 main
    private Combustible combustible;

    @ManyToOne
    @JoinColumn(name = "id_estado", nullable = false)
    @NotNull
    @Valid
    private EstadoVehiculo estado;


    private EstadoVehiculo estadoVehiculo;
 main
}
