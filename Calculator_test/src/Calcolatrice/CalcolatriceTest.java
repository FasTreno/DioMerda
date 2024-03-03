package Calcolatrice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalcolatriceTest {

    private final Calcolatrice calculator = new Calcolatrice();

    @Test
    void testSomma() {
        assertEquals(5, calculator.somma(2, 3));
        assertEquals(0, calculator.somma(0, 0));
    }

    @Test
    void testSottrazione() {
        assertEquals(3, calculator.sottrazione(6, 3));
        assertEquals(0, calculator.sottrazione(0, 0));
    }

    @Test
    void testMoltiplicazione() {
        assertEquals(10, calculator.Moltiplicazione(5, 2));
        assertEquals(0, calculator.Moltiplicazione(0, 0));
    }

    @Test
    void testDivisione() {
        assertEquals(2, calculator.divisione(4, 2));
        assertEquals(Double.NaN, calculator.divisione(10.5, 0));
    }
}
