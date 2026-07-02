package com.example.alquiler.dto;

public record AuthResponse(String token, String tipo, String username, String rol) {
}

