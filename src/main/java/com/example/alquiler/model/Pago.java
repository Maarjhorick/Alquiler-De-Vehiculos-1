package com.example.alquiler.model;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "pagos")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pago")
    private Integer idPago;

    @OneToOne
    @JoinColumn(name = "id_alquiler", nullable = false, unique = true)
    private Alquiler alquiler;

    @Column(name = "fecha_pago")
    private LocalDate fechaPago;

    @Column(name = "monto_total", precision = 10, scale = 2, nullable = false)
    private BigDecimal montoTotal;

    @ManyToOne
    @JoinColumn(name = "id_metodo_pago")
    private MetodoPago metodoPago;

    @Column(name = "estado_pago", length = 30)
    private String estadoPago;

    @Column(name = "comentarios", columnDefinition = "TEXT")
    private String comentarios;
}
