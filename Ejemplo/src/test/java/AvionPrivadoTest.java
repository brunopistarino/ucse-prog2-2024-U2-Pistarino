import org.example.AvionPrivado;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AvionPrivadoTest {

    private AvionPrivado avionPrivado;

    @BeforeEach
    public void setUp() {
        avionPrivado = new AvionPrivado(1000, 10);
    }

    @Test
    public void testAvionPrivadoVolarReturn1500() {
        int result = avionPrivado.volar(100);
        Assertions.assertEquals(1500, result);
    }

    @Test
    public void testAvionPrivadoCapacidadCombustibleReturn1000() {
        int result = avionPrivado.getCapacidadCombustible();
        Assertions.assertEquals(1000, result);
    }

    @Test
    public void testAvionPrivadoConsumoCombustibleReturn10() {
        int result = avionPrivado.getConsumoCombustible();
        Assertions.assertEquals(10, result);
    }
}
