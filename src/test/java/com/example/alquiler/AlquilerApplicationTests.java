package com.example.alquiler;

import com.example.alquiler.service.AlquilerService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.Collections;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AlquilerApplicationTests {

    @Test
    void servicioNoEsNulo() {
        AlquilerService service = Mockito.mock(AlquilerService.class);
        assertNotNull(service);
    }

    @Test
    void obtenerAlquileresPorClienteRetornaLista() {
        AlquilerService service = Mockito.mock(AlquilerService.class);
        Mockito.when(service.obtenerAlquileresPorCliente(1))
               .thenReturn(Collections.emptyList());
        assertEquals(0, service.obtenerAlquileresPorCliente(1).size());
    }
}