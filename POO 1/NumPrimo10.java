import java.util.Scanner;
public class NumPrimo10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadePrimos = 0;

        // Leitura de 10 números inteiros
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número inteiro: ");
            int numero = scanner.nextInt();

            // Verificar se o número é primo
            if (verificaPrimo(numero)) {
                quantidadePrimos++;
            }
        }

        // Exibição da quantidade de números primos
        System.out.println("A quantidade de números primos digitados foi: " + quantidadePrimos);

        scanner.close();
    }

    // Método que verifica se um número é primo
    public static boolean verificaPrimo(int numero) {
        if (numero <= 1) {
            return false; // Números menores ou iguais a 1 não são primos
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; // Se o número for divisível por outro número além de 1 e ele mesmo, não é primo
            }
        }

        return true; // Se passou por todas as verificações, é primo
    }
}

