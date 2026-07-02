package com.example.alquiler.dto;

import jakarta.validation.constraints.NotBlank;

public record RegistroRequest(
        @NotBlank String username,
        @NotBlank String password,
        String emailRecuperacion,
        Integer idCliente) {
}
