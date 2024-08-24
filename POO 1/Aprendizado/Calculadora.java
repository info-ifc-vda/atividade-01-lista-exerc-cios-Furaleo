package Aprendizado;
import java.util.Scanner;

public class Calculadora {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        float resultado = 0;
        char operacao;
        boolean valida;

        System.out.println("Digite o 1° numero inteiro: ");
        x = sc.nextInt();

        System.out.println("Digite o 2° numero inteiro: ");
        y = sc.nextInt();

        do{
        System.out.println("Qual operacao matematica deseja realizar? (+, -, *, /)");
        operacao = sc.next().charAt(0);
        valida = true;

        switch (operacao) {
            case '+':
                resultado = x + y;
                
                break;
            case '-':
                resultado = x - y;
                
                break;
            case '*':
                resultado = x * y;
                
    
                break;
            case '/':
                resultado = (float)x / y;
                
                break;
                default:
                System.out.println("error");
                valida = false;
        }
        }while (valida == false);
        System.out.println("O resultado da operação é: " + resultado);

        sc.close();

    }
}
