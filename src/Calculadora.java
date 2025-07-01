public class Calculadora {

    // Método para somar dois números
    double somar(double a, double b) {
        return a + b;
    }

    // Método para subtrair dois números
    double subtrair(double a, double b) {
        return a - b;
    }

    // Método para multiplicar dois números
    double multiplicar(double a, double b) {
        return a * b;
    }

    /**
     * Método para dividir dois números
     * @return Resultado da divisão ou Double.NaN em caso de divisão por zero
     */
    double dividir(double a, double b) {
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
        double resultadoSoma = calc.somar(5, 3);
        System.out.println("Soma: 5 + 3 = " + resultadoSoma);

        double resultadoSubtracao = calc.subtrair(10, 4);
        System.out.println("Subtração: 10 - 4 = " + resultadoSubtracao);

        double resultadoMultiplicacao = calc.multiplicar(6, 7);
        System.out.println("Multiplicação: 6 * 7 = " + resultadoMultiplicacao);

        double resultadoDivisao = 0;
        // Teste de divisão normal
        resultadoDivisao = calc.dividir(20, 5);
        System.out.println("Divisão: 20 / 5 = " + resultadoDivisao);

        // Teste de divisão por zero
        resultadoDivisao = calc.dividir(15, 0);
        System.out.println("Divisão por zero: 15 / 0 = " + resultadoDivisao);
    }
}