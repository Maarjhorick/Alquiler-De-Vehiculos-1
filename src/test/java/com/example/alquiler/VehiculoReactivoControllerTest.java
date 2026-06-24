package com.alquiler.api;

import com.alquiler.api.controller.VehiculoReactivoController;
import com.alquiler.api.model.VehiculoReactivo;
import com.alquiler.api.repository.VehiculoReactivoRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Flux;

@WebFluxTest(VehiculoReactivoController.class)
class VehiculoReactivoControllerTest {

    @Autowired 
    private WebTestClient webClient;

    @MockBean 
    private VehiculoReactivoRepository repository;

    @Test
    void testGetAllVehiculos() {
        VehiculoReactivo mockVehiculo = new VehiculoReactivo(1, "Toyota", "Corolla", 150.0, true);
        Mockito.when(repository.findAll()).thenReturn(Flux.just(mockVehiculo));

        webClient.get().uri("/api/reactivo/vehiculos")
                .exchange()
                .expectStatus().isOk()
                .expectBodyList(VehiculoReactivo.class).hasSize(1);
    }
}