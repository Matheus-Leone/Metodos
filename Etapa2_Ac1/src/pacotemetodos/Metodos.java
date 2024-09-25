package pacotemetodos;

public class Metodos {
    
    // Método que verifica se um número é positivo ou negativo (considerando o zero positivo)
    public static String verificaNumero(int num) {
        if (num >= 0) {
            return "Positivo";
        } else {
            return "Negativo";
        }
    }

    // Método que recebe 3 números e retorna a média aritmética (soma os 3 valores e divide pelo número de variavéis)
    public static double mediaAritmetica(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    // Método que recebe três números e retorna o maior (Math.max faz exatamente isso)
    public static double maiorNumero(double a, double b, double c) {
        return Math.max(a, Math.max(b, c));
    }

    // Método que recebe dois números a e b e retorna a^b (Math.pow faz exatamente isso)
    public static double potencia(double a, double b) {
        return Math.pow(a, b);
    }

    // Método que recebe uma quantidade de minutos e retorna o equivalente em horas e minutos
    public static String converteMinutos(int minutos) {
        int horas = minutos / 60;
        int minutosRestantes = minutos % 60;
        return horas + " horas e " + minutosRestantes + " minutos";
    }

    // Método que retorna o fatorial de um número informado por parâmetro
    public static int fatorial(int n) {
        int resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    // Método principal para testar as funções matemáticas
    public static void main(String[] args) {
        // Testando verificaNumero
        System.out.println("Verifica número 5: " + verificaNumero(5)); // Positivo
        System.out.println("Verifica número -3: " + verificaNumero(-3)); // Negativo

        // Testando mediaAritmetica
        System.out.println("Média aritmética de 3, 6, 9: " + mediaAritmetica(3, 6, 9)); // 6.0

        // Testando maiorNumero
        System.out.println("Maior número entre 7, 2, 10: " + maiorNumero(7, 2, 10)); // 10.0

        // Testando potencia
        System.out.println("Potência de 2^3: " + potencia(2, 3)); // 8.0

        // Testando converteMinutos
        System.out.println("90 minutos é equivalente a: " + converteMinutos(90)); // 1 horas e 30 minutos

        // Testando fatorial
        System.out.println("Fatorial de 5: " + fatorial(5)); // 120
    }
}
