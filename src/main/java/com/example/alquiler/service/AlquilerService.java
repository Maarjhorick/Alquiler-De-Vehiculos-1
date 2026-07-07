package com.example.alquiler.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import com.example.alquiler.model.Alquiler;
import com.example.alquiler.model.Cliente;
import com.example.alquiler.model.EstadoAlquiler;
import com.example.alquiler.model.EstadoVehiculo;
import com.example.alquiler.model.Vehiculo;
import com.example.alquiler.repository.AlquilerRepository;
import com.example.alquiler.repository.ClienteRepository;
import com.example.alquiler.repository.EstadoAlquilerRepository;
import com.example.alquiler.repository.EstadoVehiculoRepository;
import com.example.alquiler.repository.VehiculoRepository;

@Service
@RequiredArgsConstructor

public class AlquilerService {

    private final AlquilerRepository alquilerRepository;
    private final ClienteRepository clienteRepository;
    private final VehiculoRepository vehiculoRepository;
    private final EstadoVehiculoRepository estadoVehiculoRepository;
    private final EstadoAlquilerRepository estadoAlquilerRepository;

    @Transactional
    public Alquiler crearAlquiler(Integer idCliente, Integer idVehiculo, LocalDate fechaInicio, LocalDate fechaFin) {
        if (fechaInicio == null || fechaFin == null || fechaFin.isBefore(fechaInicio)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,
                    "La fecha de fin debe ser igual o posterior a la fecha de inicio");
        }
        Cliente cliente = clienteRepository.findById(idCliente)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Cliente no encontrado"));

        Vehiculo vehiculo = vehiculoRepository.findById(idVehiculo)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Vehiculo no encontrado"));

        if (alquilerRepository.existeCruceActivo(idVehiculo, fechaInicio, fechaFin)) {
            throw new ResponseStatusException(HttpStatus.CONFLICT,
                    "El vehiculo ya tiene un alquiler activo en ese rango de fechas");
        }
        if (vehiculo.getEstado() == null
                || !vehiculo.getEstado().getNombreEstado().equalsIgnoreCase("DISPONIBLE")) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, "Vehiculo no disponible");
        }

        EstadoVehiculo estadoNoDisponible = estadoVehiculoRepository.findByNombreEstado("NO DISPONIBLE")
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.CONFLICT,
                        "Estado de vehiculo NO DISPONIBLE no configurado"));
        EstadoAlquiler estadoActivo = estadoAlquilerRepository.findByNombreEstadoIgnoreCase("ACTIVO")
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.CONFLICT,
                        "Estado de alquiler ACTIVO no configurado"));

        vehiculo.setEstado(estadoNoDisponible);
        vehiculoRepository.save(vehiculo);

        Alquiler alquiler = new Alquiler();
        alquiler.setCliente(cliente);
        alquiler.setVehiculo(vehiculo);
        alquiler.setFechaReserva(LocalDate.now());
        alquiler.setFechaInicio(fechaInicio);
        alquiler.setFechaFinEstimada(fechaFin);
        alquiler.setEstado(estadoActivo);

        return alquilerRepository.save(alquiler);
    }

    @Transactional
    public Alquiler finalizarAlquiler(Integer idAlquiler, LocalDate fechaFinReal) {
        Alquiler alquiler = alquilerRepository.findById(idAlquiler)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Alquiler no encontrado"));
        if (alquiler.getFechaFinReal() != null) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, "El alquiler ya fue finalizado");
        }
        if (fechaFinReal == null || fechaFinReal.isBefore(alquiler.getFechaInicio())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,
                    "La fecha de fin real no puede ser anterior a la fecha de inicio");
        }

        alquiler.setFechaFinReal(fechaFinReal);

        EstadoVehiculo estadoDisponible = estadoVehiculoRepository.findByNombreEstado("DISPONIBLE")
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.CONFLICT,
                        "Estado de vehiculo DISPONIBLE no configurado"));
        EstadoAlquiler estadoFinalizado = estadoAlquilerRepository.findByNombreEstadoIgnoreCase("FINALIZADO")
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.CONFLICT,
                        "Estado de alquiler FINALIZADO no configurado"));
        alquiler.setEstado(estadoFinalizado);

        Vehiculo vehiculo = alquiler.getVehiculo();
        vehiculo.setEstado(estadoDisponible);
        vehiculoRepository.save(vehiculo);

        return alquilerRepository.save(alquiler);
    }

    public List<Alquiler> obtenerAlquileresPorCliente(Integer idCliente) {
        return alquilerRepository.findByCliente_IdCliente(idCliente);
    }

    public List<Alquiler> obtenerAlquileresPorVehiculo(Integer idVehiculo) {
        return alquilerRepository.findByVehiculo_IdVehiculo(idVehiculo);
    }
}
