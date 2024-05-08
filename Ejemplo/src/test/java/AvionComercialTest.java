import org.example.AvionComercial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AvionComercialTest {
    @Test
    public void testAvionComercialVolarReturn1000() {
        AvionComercial avionComercial = new AvionComercial(1000, 10);
        int result = avionComercial.volar(100);
        Assertions.assertEquals(result, 1000);
    }

    @Test
    public void testAvionComercialCapacidadCombustibleReturn1000() {
        AvionComercial avionComercial = new AvionComercial(1000, 10);
        int result = avionComercial.getCapacidadCombustible();
        Assertions.assertEquals(result, 1000);
    }

    @Test
    public void testAvionComercialConsumoCombustibleReturn10() {
        AvionComercial avionComercial = new AvionComercial(1000, 10);
        int result = avionComercial.getConsumoCombustible();
        Assertions.assertEquals(result, 10);
    }
}
