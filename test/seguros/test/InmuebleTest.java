package seguros.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import seguros.Inmueble;

public class InmuebleTest {

    @Test
    public void testSuperaUmbral_ValorMayorQueUmbral() {
        Inmueble inmueble = new Inmueble("123", "01-01-2024", "01-01-2025", 0, 60000);
        assertTrue(inmueble.superaUmbral(50000));
    }

    @Test
    public void testCalcularCostoRenovacion_Valor150000() {
        Inmueble inmueble = new Inmueble("456", "01-01-2024", "01-01-2025", 0, 150000);
        assertEquals(7500, inmueble.calcularCostoRenovacion(), 0.001);
    }
}