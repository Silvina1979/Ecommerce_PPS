package com.ecommerce;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoTest {

    @Test
    void applicationContextLoads() {
        // Un test simple que verifica si el contenedor de Spring Boot se inicializa sin errores.
        assertTrue(true); 
    }
}