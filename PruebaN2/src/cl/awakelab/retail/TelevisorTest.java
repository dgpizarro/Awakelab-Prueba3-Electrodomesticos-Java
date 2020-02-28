package cl.awakelab.retail;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TelevisorTest {

    Televisor prueba;
    Televisor prueba2;

    @BeforeEach
    void setUp() throws Exception {
        prueba = new Televisor(300000, "negro", 'b', 6, 32, true);
        prueba2= new Televisor(300000, "AZUL", 'A', 10, 60, false);
    }

    @Test
    void testGetResolucion() {
        assertEquals(32, prueba.getResolucion());
    }
    
    @Test
    void testGetIsSintonizadorTDT() {
        assertTrue(prueba.isSintonizadorTDT());
    }
    
    @Test
    void testPrecioFinal() {
        assertEquals(300140, prueba.precioFinal(prueba));
    }

    @Test
    void testPrecioFinal2() {
        assertEquals(390143, prueba2.precioFinal(prueba2));
    }

}
