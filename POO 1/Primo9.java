import java.util.Scanner;
public class Primo9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do número
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Verificação se o número é primo
        boolean ehPrimo = verificaPrimo(numero);

        // Exibição do resultado
        if (ehPrimo) {
            System.out.println("O número " + numero + " é primo.");
        } else {
            System.out.println("O número " + numero + " não é primo.");
        }

        scanner.close();
    }

    // Método que verifica se um número é primo
    public static boolean verificaPrimo(int numero) {
        if (numero <= 1) {
            return false; // Números menores ou iguais a 1 não são primos
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; // Se o número for divisível por qualquer outro número além de 1 e ele mesmo, não é primo
            }
        }

        return true; // Se passou por todas as verificações, é primo
    }
}

