/*1. Faça um programa que recebe o número de horas trabalhadas, e o valor da hora trabalhada. Calcule e mostre o salário a receber seguindo estas regras:
• o salário bruto equivale ao número de horas trabalhadas multiplicado pelo valor da
hora trabalhada;
• o imposto equivale a 30% do salário bruto;
• o salário a receber equivale ao salário bruto menos o imposto. */

import java.util.Scanner;
public class Trabalho1 {
    public static void main(String[] args) {
        int horast = 0;
        int valorh = 0;


        Scanner teclado = new Scanner(System.in);

    for (int i = 0; i < 3; i++){
       
        System.out.print("Horas Trabalhadas: ");
        horast = teclado.nextInt();
        System.out.print("Valor das Horas: ");
        valorh = teclado.nextInt();

        double sb = horast*valorh;
        double sl = sb-(sb*0.3);

        System.out.println("Salario bruto: " + sb);
        System.out.println("Salario liquido: " + sl);
        teclado.close();
    }
    
    
    
//JOptionPane.showMessageDialog(null, "A media da turma é: " + media); mostra a nota por janela
// /n quebra linha na caixa   
    }
}
