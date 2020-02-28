package cl.awakelab.retail;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ElectrodomesticoTest {

    Electrodomestico prueba;
    Electrodomestico prueba2;

    @BeforeEach
    void setUp() throws Exception {
        prueba = new Electrodomestico(150000, "Amarillo", 'a', 7);
        prueba2 = new Electrodomestico(150000, "azul", 'z', 20);
    }

    @Test
    void testGetPrecioBase() {
        assertEquals(150000, prueba.getPrecioBase());
    }

    @Test
    // Con esta prueba tambien se esta validando el metodo privado comprobarColor.
    // Se verifica que si asgina un valor de atributo no integrado en biblioteca,
    // realmente
    // se termina asginando el atributo por defecto
    void testGetColor1() {
        assertEquals("BLANCO", prueba.getColor());
    }

    @Test
    // Con esta prueba tambien se esta validando el metodo privado comprobarColor.
    // Se verifica que si asgina un valor de atributo integrado en biblioteca pero
    // en minusc.,
    // realmente se termina asginando dicho atributo pero en MAYUSC.
    void testGetColor2() {
        assertEquals("AZUL", prueba2.getColor());
    }

    @Test
    // Con esta prueba tambien se esta validando el metodo privado
    // comprobarConsumoEnergetico
    // Se verifica que si asgina un valor de atributo integrado en biblioteca pero
    // en minusc.,
    // realmente se termina asginando dicho atributo pero en MAYUSC.
    void testGetConsumoEnergetico() {
        assertEquals('A', prueba.getConsumoEnergetico());
    }

    @Test
    // Con esta prueba tambien se esta validando el metodo privado
    // comprobarConsumoEnergetico.
    // Se verifica que si asgina un valor de atributo no integrado en biblioteca,
    // realmente
    // se termina asginando el atributo por defecto
    void testGetConsumoEnergetico2() {
        assertEquals('F', prueba2.getConsumoEnergetico());
    }

    @Test
    void testGetPeso() {
        assertEquals(7, prueba.getPeso());
    }

    @Test
    void testPrecioFinal() {
        assertEquals(150110, prueba.precioFinal(prueba));
    }

    @Test
    void testPrecioFinal2() {
        assertEquals(150060, prueba2.precioFinal(prueba2));
    }

}
