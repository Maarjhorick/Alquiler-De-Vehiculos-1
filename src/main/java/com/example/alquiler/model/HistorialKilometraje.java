package com.example.alquiler.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "historialkilometr")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HistorialKilometraje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_hist_km")
    private Integer idHistKm;

    @ManyToOne
    @JoinColumn(name = "id_vehiculo", nullable = false)
    private Vehiculo vehiculo;

    @Column(name = "kilometraje", nullable = false)
    private Integer kilometraje;

    @Column(name = "fecha_registro")
    private LocalDate fechaRegistro;
}
