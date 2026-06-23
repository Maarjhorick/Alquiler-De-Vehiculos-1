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
public class Vehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vehiculo")
    private Integer idVehiculo;

    @Column(name = "placa", length = 15, nullable = false, unique = true)
    private String placa;

    @Column(name = "color", length = 30)
    private String color;

    @Column(name = "anio")
    private Integer anio;

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
    private Modelo modelo;

    @ManyToOne
    @JoinColumn(name = "id_tipo", nullable = false)
    private TipoVehiculo tipoVehiculo;

    @ManyToOne
    @JoinColumn(name = "id_combustible", nullable = false)
    private Combustible combustible;

    @ManyToOne
    @JoinColumn(name = "id_estado", nullable = false)
    private EstadoVehiculo estadoVehiculo;
}
