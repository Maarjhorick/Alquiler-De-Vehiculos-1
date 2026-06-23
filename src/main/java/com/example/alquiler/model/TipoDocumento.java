package com.example.alquiler.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tiposdocumento")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TipoDocumento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_doc")
    private Integer idTipoDoc;

    @Column(name = "nombre_tipo_doc", length = 50, nullable = false)
    private String nombreTipoDoc;
}
