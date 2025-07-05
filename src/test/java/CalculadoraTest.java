import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    private Calculadora calculadora;

    // Instanciando a calculadora antes de cada teste
    @BeforeEach
    public void setUp() {
        calculadora = new Calculadora();
    }

    // Teste para o método somar
    @Test
    public void testSomar() {
        int resultado = calculadora.somar(2, 3);
        assertEquals(5, resultado);
    }

    // Teste para o método subtrair
    @Test
    public void testSubtrair() {
        int resultado = calculadora.subtrair(5, 3);
        assertEquals(2, resultado);
    }

    // Teste para o método multiplicar
    @Test
    public void testMultiplicar() {
        int resultado = calculadora.multiplicar(2, 3);
        assertEquals(6, resultado);
    }

    // Teste para o método dividir (esperando uma exceção)
    @Test
    public void testDividirPorZero() {
        // Usando assertThrows para verificar a exceção
        assertThrows(ArithmeticException.class,() -> {
            calculadora.dividir(5, 0); // Espera uma exceção de divisão por zero
        });
    }

    // Teste para o método dividir
    @Test
    public void testDividir() {
        int resultado = calculadora.dividir(6, 3);
        assertEquals(2, resultado);
    }
}
