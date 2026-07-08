package com.example.alquiler.model;

import java.time.LocalDate;
import java.util.List;

import lombok.*;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name = "alquileres")
@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Alquiler {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_alquiler")
    private Integer idAlquiler;

    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_vehiculo", nullable = false)
    private Vehiculo vehiculo;
    @Column(name = "licencia_conducir", length = 20)
    private String licenciaConducir;

    @Column(name = "fecha_reserva", nullable = false)
    private LocalDate fechaReserva;

    @Column(name = "fecha_inicio", nullable = false)
    private LocalDate fechaInicio;

    @Column(name = "fecha_fin_estimada", nullable = false)
    private LocalDate fechaFinEstimada;

    @Column(name = "fecha_fin_real")
    private LocalDate fechaFinReal;

    @ManyToOne
    @JoinColumn(name = "id_estado_alquiler", nullable = false)
    private EstadoAlquiler estado;

    @OneToMany(mappedBy = "alquiler", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Pago> pagos;

}
