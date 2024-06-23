import org.example.AvionComercial;
import org.example.AvionPrivado;
import org.example.CalculadorCombustible;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadorCombustibleTest {
    private CalculadorCombustible calculadorCombustible;

    @BeforeEach
    public void setUp() {
        calculadorCombustible = CalculadorCombustible.getInstance();
    }

    @Test
    public void testCalculadorCombustibleAvionComercialReturn1000() {
        AvionComercial avionComercial = new AvionComercial(1000, 10);
        int result = calculadorCombustible.calcularCombustible(avionComercial, 100);
        assertEquals(1000, result);
    }

    @Test
    public void testCalculadorCombustibleAvionPrivadoReturn1500() {
        AvionPrivado avionPrivado = new AvionPrivado(1000, 10);
        int result = calculadorCombustible.calcularCombustible(avionPrivado, 100);
        assertEquals(1500, result);
    }

    @Test
    public void testGetInstanceReturnMismaInstance() {
        CalculadorCombustible instance2 = CalculadorCombustible.getInstance();
        assertEquals(calculadorCombustible, instance2);
    }
}
