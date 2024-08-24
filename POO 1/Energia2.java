/*2. Sabe-se que o quilowatt de energia custa 1% do salário mínimo. Faça um programa
que recebe o valor do salário mínimo e a quantidade de quilowatts consumida por uma
residência, calcule e mostre:
• o valor de cada quilowatt;
• o valor a ser pago por essa residência; */

import java.util.Scanner;
public class Energia2 {
    public static void main(String[] args) {
        int salM = 0;
        int quaQui = 0;


        Scanner teclado = new Scanner(System.in);

    for (int i = 0; i < 3; i++){
       
        System.out.print("Valor do salario minimo: ");
        salM = teclado.nextInt();
        System.out.print("Quantidade de quilowatts consumida: ");
        quaQui = teclado.nextInt();

        double vaQui = salM*0.01;
        double vaPa = vaQui*quaQui;

        System.out.println("O valor de cada quilowatt: " + vaQui);
        System.out.println("o valor a ser pago por essa residencia: " + vaPa);
        teclado.close();
    }
    
    
    
//JOptionPane.showMessageDialog(null, "A media da turma é: " + media); mostra a nota por janela
// /n quebra linha na caixa   
    
}

}
