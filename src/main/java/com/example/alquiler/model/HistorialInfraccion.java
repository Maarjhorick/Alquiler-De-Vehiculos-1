package com.example.alquiler.model;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "historialinfraccion")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HistorialInfraccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_hist_infraccion")
    private Integer idHistInfraccion;

    @ManyToOne
    @JoinColumn(name = "id_vehiculo", nullable = false)
    private Vehiculo vehiculo;

    @ManyToOne
    @JoinColumn(name = "id_alquiler")
    private Alquiler alquiler;

    @Column(name = "fecha_infraccion")
    private LocalDate fechaInfraccion;

    @Column(name = "descripcion", columnDefinition = "TEXT")
    private String descripcion;

    @Column(name = "monto_multa", precision = 10, scale = 2)
    private BigDecimal montoMulta;

    @Column(name = "estado_pago", length = 30)
    private String estadoPago;
}
