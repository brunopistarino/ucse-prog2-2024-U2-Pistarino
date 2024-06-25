package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AvionComercialTest {

    private AvionComercial avionComercial;

    @BeforeEach
    public void setUp() {
        avionComercial = new AvionComercial(1000, 10);
    }

    @Test
    public void testAvionComercialVolarReturn1000() {
        int result = avionComercial.volar(100);
        Assertions.assertEquals(1000, result);
    }

    @Test
    public void testAvionComercialCapacidadCombustibleReturn1000() {
        int result = avionComercial.getCapacidadCombustible();
        Assertions.assertEquals(1000, result);
    }

    @Test
    public void testAvionComercialConsumoCombustibleReturn10() {
        int result = avionComercial.getConsumoCombustible();
        Assertions.assertEquals(10, result);
    }
}
