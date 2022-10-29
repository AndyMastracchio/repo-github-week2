package com.digitalhouse.integradora.nueve.ejercicio1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlyweightTest {

    FlyweightFactory flyweightFactory;

    // Instanciamos en el setUp para la instancia que usaríamos en varios tests
    @BeforeEach
    void setUp() {
        flyweightFactory = new FlyweightFactory();
    }

    @DisplayName("Test que verifica triangulos con tamaño 2")
    @Test
    void getTrianguloConTamano2() {
        Triangulo triangulo = flyweightFactory.obtenerTriangulo("rojo");
        triangulo.setTamanio(2);
        Triangulo triangulo1 = flyweightFactory.obtenerTriangulo("rojo");
        triangulo1.setTamanio(4);

        assertEquals(triangulo.getColor(), "rojo");
        assertEquals(triangulo1.getTamanio(), 4);
        assertEquals(FlyweightFactory.trianguloMap.size() == 1, true);

    }

    @Test
    @Disabled("Pendiente de implementación")
    void testDeAlgoDiferente() {
    }

}
