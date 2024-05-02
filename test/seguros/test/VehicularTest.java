package seguros.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import seguros.Vehicular;

public class VehicularTest {

	//Expected to be false
    @Test
    public void testCalcularImpuesto_Costo20000() {
        Vehicular vehiculo = new Vehicular("123", "01-01-2024", "01-01-2025", 20000, "Modelo", "Marca");
        assertEquals(2000, vehiculo.calcularImpuesto(), 0.001);
    }

    //Expected to be success
    @Test
    public void testCalcularImpuesto_Costo20000T() {
        Vehicular vehiculo = new Vehicular("123", "01-01-2024", "01-01-2025", 20000, "Modelo", "Marca");
        assertEquals(3200, vehiculo.calcularImpuesto(), 0.001);
    }
}