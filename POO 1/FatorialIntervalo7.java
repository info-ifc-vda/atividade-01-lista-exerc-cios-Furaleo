import java.util.Scanner;
public class FatorialIntervalo7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos números
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        // Determinar o intervalo correto
        int inicio = Math.min(num1, num2);
        int fim = Math.max(num1, num2);

        // Calcular e exibir o fatorial de todos os números no intervalo
        for (int i = inicio; i <= fim; i++) {
            long fatorial = calcularFatorial(i);
            System.out.println("O fatorial de " + i + " é: " + fatorial);
        }

        scanner.close();
    }

    // Método para calcular o fatorial de um número
    public static long calcularFatorial(int numero) {
        long fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}  

