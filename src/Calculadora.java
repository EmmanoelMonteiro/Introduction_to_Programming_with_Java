public class Calculadora {

    // Método para somar dois números
    public double somar(double a, double b) {
        return a + b;
    }

    // Método para subtrair dois números
    public double subtrair(double a, double b) {
        return a - b;
    }

    // Método para multiplicar dois números
    public double multiplicar(double a, double b) {
        return a * b;
    }

    /**
     * Método para dividir dois números
     * @return Resultado da divisão ou Double.NaN em caso de divisão por zero
     */
    public double dividir(double a, double b) {
        if(b == 0) {
            System.out.println("Erro: Divisão por zero!");
            return Double.NaN; // Retorna "Not a Number"
        }
        return (a / b);
    }

    // Método main para testar a calculadora
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        // Testes das operações
        double ResultadoSoma = calc.somar(5, 3);
        System.out.println("Soma: 5 + 3 = " + ResultadoSoma);

        double ResultadoSubtracao = calc.subtrair(10, 4);
        System.out.println("Subtração: 10 - 4 = " + ResultadoSubtracao);

        double ResultadoMultiplicacao = calc.multiplicar(6, 7);
        System.out.println("Multiplicação: 6 * 7 = " + ResultadoMultiplicacao);

        double ResultadoDivisao = 0;
        // Teste de divisão normal
        ResultadoDivisao = calc.dividir(20, 5);
        System.out.println("Divisão: 20 / 5 = " + ResultadoDivisao);

        // Teste de divisão por zero
        ResultadoDivisao = calc.dividir(15, 0);
        System.out.println("Divisão por zero: 15 / 0 = " + ResultadoDivisao);
    }
}