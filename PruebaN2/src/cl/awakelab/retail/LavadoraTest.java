package cl.awakelab.retail;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LavadoraTest {

    Lavadora prueba;
    Lavadora prueba2;

    @BeforeEach
    void setUp() throws Exception {
        prueba = new Lavadora(200000, "azul", 'a', 68, 28);
        prueba2 = new Lavadora(200000, "negro", 'C', 70, 40);
    }

    @Test
    void testGetCarga() {
        assertEquals(28, prueba.getCarga());
    }

    @Test
    void testPrecioFinal() {
        assertEquals(200180, prueba.precioFinal(prueba));
    }

    @Test
    void testPrecioFinal2() {
        assertEquals(200190, prueba2.precioFinal(prueba2));
    }

}
