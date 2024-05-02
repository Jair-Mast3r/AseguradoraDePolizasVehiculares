package seguros.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import seguros.SeguroVida;

public class SeguroVidaTest {

    @Test
    public void testCalcularCostoSeguro_NoFumadorMenor18() {
        SeguroVida seguro = new SeguroVida("123", "01-01-2024", "01-01-2025", 0, 15, false);
        assertEquals(160, seguro.calcularCostoSeguro(), 0.001);
    }

    @Test
    public void testCalcularCostoSeguro_FumadorMayor65() {
        SeguroVida seguro = new SeguroVida("456", "01-01-2024", "01-01-2025", 0, 70, true);
        assertEquals(240, seguro.calcularCostoSeguro(), 0.001);
    }
}