import org.example.AvionPrivado;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AvionPrivadoTest {
    @Test
    public void testAvionPrivadoVolarReturn1000() {
        AvionPrivado avionPrivado = new AvionPrivado(1000, 10);
        int result = avionPrivado.volar(100);
        Assertions.assertEquals(result, 1500);
    }

    @Test
    public void testAvionPrivadoCapacidadCombustibleReturn1000() {
        AvionPrivado avionPrivado = new AvionPrivado(1000, 10);
        int result = avionPrivado.getCapacidadCombustible();
        Assertions.assertEquals(result, 1000);
    }

    @Test
    public void testAvionPrivadoConsumoCombustibleReturn10() {
        AvionPrivado avionPrivado = new AvionPrivado(1000, 10);
        int result = avionPrivado.getConsumoCombustible();
        Assertions.assertEquals(result, 10);
    }
}
