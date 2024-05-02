package seguros.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import seguros.Vehicular;

public class VehicularTest {

    @Test
    public void testCalcularImpuesto_Costo20000() {
        Vehicular vehiculo = new Vehicular("123", "01-01-2024", "01-01-2025", 20000, "Modelo", "Marca");
        assertEquals(2000, vehiculo.calcularImpuesto(), 0.001);
    }

    @Test
    public void testConstructor_CostoNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Vehicular("456", "01-01-2024", "01-01-2025", -100, "Modelo", "Marca");
        });
    }
}