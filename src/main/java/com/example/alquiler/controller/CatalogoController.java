package com.example.alquiler.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.alquiler.model.Combustible;
import com.example.alquiler.model.Marca;
import com.example.alquiler.model.MetodoPago;
import com.example.alquiler.model.Modelo;
import com.example.alquiler.model.TipoVehiculo;
import com.example.alquiler.repository.CombustibleRepository;
import com.example.alquiler.repository.EstadoAlquilerRepository;
import com.example.alquiler.repository.EstadoVehiculoRepository;
import com.example.alquiler.repository.MarcaRepository;
import com.example.alquiler.repository.MetodoPagoRepository;
import com.example.alquiler.repository.ModeloRepository;
import com.example.alquiler.repository.RolRepository;
import com.example.alquiler.repository.TipoVehiculoRepository;
import com.example.alquiler.service.CatalogoService;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.List;

@RestController
@RequestMapping("/api/catalogos")
@RequiredArgsConstructor

public class CatalogoController {

    private final MarcaRepository marcaRepository;
    private final ModeloRepository modeloRepository;
    private final TipoVehiculoRepository tipoVehiculoRepository;
    private final CombustibleRepository combustibleRepository;
    private final EstadoVehiculoRepository estadoVehiculoRepository;
    private final EstadoAlquilerRepository estadoAlquilerRepository;
    private final MetodoPagoRepository metodoPagoRepository;
    private final RolRepository rolRepository;
    private final CatalogoService catalogoService;

    @GetMapping
    public Map<String, Object> listar() {
        Map<String, Object> catalogos = new LinkedHashMap<>();
        catalogos.put("marcas", marcaRepository.findAll());
        catalogos.put("modelos", modeloRepository.findAll());
        catalogos.put("tiposVehiculo", tipoVehiculoRepository.findAll());
        catalogos.put("combustibles", combustibleRepository.findAll());
        catalogos.put("estadosVehiculo", estadoVehiculoRepository.findAll());
        catalogos.put("estadosAlquiler", estadoAlquilerRepository.findAll());
        catalogos.put("metodosPago", metodoPagoRepository.findAll());
        catalogos.put("roles", rolRepository.findAll());
        return catalogos;
    }

    @GetMapping("/marcas")
    public List<Marca> listarMarcas() {
        return catalogoService.listarMarcas();
    }

    @PostMapping("/marcas")
    public ResponseEntity<Marca> crearMarca(@RequestBody Marca marca) {
        return ResponseEntity.status(HttpStatus.CREATED).body(catalogoService.crearMarca(marca));
    }

    @PutMapping("/marcas/{id}")
    public Marca actualizarMarca(@PathVariable Integer id, @RequestBody Marca marca) {
        return catalogoService.actualizarMarca(id, marca);
    }

    @GetMapping("/modelos")
    public List<Modelo> listarModelos() {
        return catalogoService.listarModelos();
    }

    @PostMapping("/modelos")
    public ResponseEntity<Modelo> crearModelo(@RequestBody Modelo modelo) {
        return ResponseEntity.status(HttpStatus.CREATED).body(catalogoService.crearModelo(modelo));
    }

    @PutMapping("/modelos/{id}")
    public Modelo actualizarModelo(@PathVariable Integer id, @RequestBody Modelo modelo) {
        return catalogoService.actualizarModelo(id, modelo);
    }

    @GetMapping("/tipos-vehiculo")
    public List<TipoVehiculo> listarTiposVehiculo() {
        return catalogoService.listarTiposVehiculo();
    }

    @PostMapping("/tipos-vehiculo")
    public ResponseEntity<TipoVehiculo> crearTipoVehiculo(@RequestBody TipoVehiculo tipo) {
        return ResponseEntity.status(HttpStatus.CREATED).body(catalogoService.crearTipoVehiculo(tipo));
    }

    @PutMapping("/tipos-vehiculo/{id}")
    public TipoVehiculo actualizarTipoVehiculo(@PathVariable Integer id, @RequestBody TipoVehiculo tipo) {
        return catalogoService.actualizarTipoVehiculo(id, tipo);
    }

    @GetMapping("/combustibles")
    public List<Combustible> listarCombustibles() {
        return catalogoService.listarCombustibles();
    }

    @PostMapping("/combustibles")
    public ResponseEntity<Combustible> crearCombustible(@RequestBody Combustible combustible) {
        return ResponseEntity.status(HttpStatus.CREATED).body(catalogoService.crearCombustible(combustible));
    }

    @PutMapping("/combustibles/{id}")
    public Combustible actualizarCombustible(@PathVariable Integer id, @RequestBody Combustible combustible) {
        return catalogoService.actualizarCombustible(id, combustible);
    }

    @GetMapping("/metodos-pago")
    public List<MetodoPago> listarMetodosPago() {
        return catalogoService.listarMetodosPago();
    }

    @PostMapping("/metodos-pago")
    public ResponseEntity<MetodoPago> crearMetodoPago(@RequestBody MetodoPago metodoPago) {
        return ResponseEntity.status(HttpStatus.CREATED).body(catalogoService.crearMetodoPago(metodoPago));
    }

    @PutMapping("/metodos-pago/{id}")
    public MetodoPago actualizarMetodoPago(@PathVariable Integer id, @RequestBody MetodoPago metodoPago) {
        return catalogoService.actualizarMetodoPago(id, metodoPago);
    }
}
