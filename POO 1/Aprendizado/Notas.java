package Aprendizado;
import java.util.Scanner;
public class Notas {
    public static void main(String[] args) {
        int[] vet = new int[10];
        int maior = 0;
        int menor = 11;
        int media = 0;

        Scanner teclado = new Scanner(System.in);

    for (int i = 0; i < vet.length; i++){
       
        System.out.print("A nota do aluno: ");
        vet[i] = teclado.nextInt();
        media += vet[i];
    
    if (vet[i] > maior){ 
        maior = vet[i];
    }
    if (vet[i] < menor){ 
        menor = vet[i];
    }
    }

    System.out.println(maior);
    System.out.println(menor);
    System.out.println((float)media/vet.length);
//JOptionPane.showMessageDialog(null, "A media da turma é: " + media); mostra a nota por janela
// /n quebra linha na caixa   
    }
}
