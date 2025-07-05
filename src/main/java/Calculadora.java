public class Calculadora {

    /**
     * Método mantido como estava — já estava limpo e direto.
     */
    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * Método mantido como estava.
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Método mantido.
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Refatorado: extraída a validação da divisão por zero para um método separado.
     * Isso melhora a legibilidade e centraliza a lógica de validação, facilitando manutenção.
     */
    public int dividir(int a, int b) {
        validarDivisor(b); // Validação extraída para um método próprio
        return a / b;
    }

    /**
     * Novo método criado no Refactor para isolar a verificação de divisão por zero.
     * Separar essa lógica reduz duplicações futuras e deixa o método 'dividir' mais claro.
     */
    private void validarDivisor(int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
    }
}


