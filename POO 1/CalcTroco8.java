import java.util.Scanner;
public class CalcTroco8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do valor total da compra
        System.out.print("Digite o valor total da compra: R$ ");
        double valorCompra = scanner.nextDouble();

        // Leitura do valor pago
        System.out.print("Digite o valor pago: R$ ");
        double valorPago = scanner.nextDouble();

        // Calcular o troco
        double troco = valorPago - valorCompra;

        if (troco < 0) {
            System.out.println("Valor pago é insuficiente.");
        } else if (troco == 0) {
            System.out.println("Não há troco a ser dado.");
        } else {
            System.out.printf("Troco: R$ %.2f\n", troco);
            calcularCedulasEMoedas(troco);
        }

        scanner.close();
    }

    // Método para calcular e exibir as cédulas e moedas necessárias para o troco
    public static void calcularCedulasEMoedas(double troco) {
        // Valores das cédulas e moedas disponíveis
        double[] valores = {100, 50, 20, 10, 5, 2, 1, 0.50, 0.25, 0.10, 0.05, 0.01};
        int[] quantidade = new int[valores.length];

        // Convertendo troco para centavos para evitar problemas de precisão
        int valorEmCentavos = (int) Math.round(troco * 100);

        for (int i = 0; i < valores.length; i++) {
            int valor = (int) Math.round(valores[i] * 100);
            quantidade[i] = valorEmCentavos / valor;
            valorEmCentavos %= valor; // Atualizar o valor do troco restante
        }

        // Exibir o resultado
        for (int i = 0; i < valores.length; i++) {
            if (quantidade[i] > 0) {
                if (valores[i] >= 1) {
                    System.out.println("Cédulas de R$ " + (int)valores[i] + ": " + quantidade[i]);
                } else {
                    System.out.printf("Moedas de R$ %.2f: %d\n", valores[i], quantidade[i]);
                }
            }
        }
    }
}

