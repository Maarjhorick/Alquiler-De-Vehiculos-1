package com.example.alquiler.service;

import java.util.List;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import com.example.alquiler.model.Pago;
import com.example.alquiler.repository.AlquilerRepository;
import com.example.alquiler.repository.MetodoPagoRepository;
import com.example.alquiler.repository.PagoRepository;
import com.example.alquiler.model.Alquiler;
import com.example.alquiler.model.MetodoPago;

@Service
@RequiredArgsConstructor
@Getter

public class PagoService {

    private final PagoRepository pagoRepository;
    private final AlquilerRepository alquilerRepository;


    private final MetodoPagoRepository metodoPagoRepository;


    @Transactional
    public Pago registrarPago(Integer idAlquiler, Integer idMetodoPago, java.math.BigDecimal monto) {
        if (monto == null || monto.signum() <= 0) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "El monto debe ser mayor que cero");
        }
        Alquiler alquiler = alquilerRepository.findById(idAlquiler)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Alquiler no encontrado"));
        MetodoPago metodoPago = metodoPagoRepository.findById(idMetodoPago)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Metodo de pago no encontrado"));

        Pago pago = new Pago();
        pago.setAlquiler(alquiler);
        pago.setMetodoPago(metodoPago);
        pago.setMontoTotal(monto);
        pago.setFechaPago(java.time.LocalDate.now());
        pago.setEstadoPago("Pagado");

        return pagoRepository.save(pago);
    }

    public List<Pago> obtenerPagosPorAlquiler(Integer idAlquiler) {
        return pagoRepository.findByAlquiler_IdAlquiler(idAlquiler);
    }
}
