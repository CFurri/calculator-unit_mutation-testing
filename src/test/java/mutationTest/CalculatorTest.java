package mutationTest;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import com.seidoropentrends.classes.Calculator;

public class CalculatorTest {

    private Calculator calc;

    @Before
    public void setUp() {
        calc = new Calculator();
    }

    @Test
    public void testSuma() {
        assertEquals(5, calc.suma(2, 3));
        assertEquals(0, calc.suma(-2, 2));
        assertEquals(10, calc.suma(5,5));
    }

    @Test
    public void testResta(){
        assertEquals(10,calc.resta(20,10));
        assertEquals(-5, calc.resta(20, 25));
    }

    @Test
    public void testMultiplica() {
        assertEquals(6, calc.multiplica(2, 3));
        assertEquals(-4, calc.multiplica(-2, 2));
        assertEquals(0, calc.multiplica(5, 0));
    }

    @Test
    public void testDivideix() {
        assertEquals(2, calc.divideix(6, 3));
        assertEquals(-1, calc.divideix(-2, 2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideixPerZero() {
        calc.divideix(5, 0);
    }

    @Test
    public void testMaxim() {
        assertEquals(5, calc.maxim(5, 3));
        assertEquals(5, calc.maxim(3, 5));
        assertEquals(-2, calc.maxim(-2, -5));
        assertEquals(5, calc.maxim(5, 5));
    }

    @Test
    public void testArrelQuadrada() {
        assertEquals(2.0, calc.arrelQuadrada(4.0), 0.001);
        assertEquals(0.0, calc.arrelQuadrada(0.0), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArrelQuadradaNegatiu() {
        calc.arrelQuadrada(-4.0);
    }

    @Test
    public void testEsPositiu() {
        assertTrue(calc.esPositiu(5));
        assertFalse(calc.esPositiu(-5));
        assertFalse(calc.esPositiu(0));
    }

    @Test
    public void testPotencia() {
        assertEquals(8, calc.potencia(2, 3));
        assertEquals(1, calc.potencia(5, 0));
        assertEquals(16, calc.potencia(-4, 2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPotenciaExponentNegatiu() {
        calc.potencia(2, -1);
    }
}
