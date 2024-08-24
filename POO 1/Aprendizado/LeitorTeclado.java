package Aprendizado;
import java.util.Scanner;
public class LeitorTeclado{

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

    System.out.print("Um numero inteiro: ");
    int n1 = teclado.nextInt(); // lendo numero

    System.out.print("Um numero inteiro: ");
    int n2 = teclado.nextInt(); // lendo inteiro

    System.out.print("Informe um operador: ");
    teclado.nextLine();
    String n3 = teclado.nextLine();
    
    int resu = 0;

    if (n3.equals("+")){ //função equals para comparar
        System.out.println(resu = n1 + n2);
    }
    else if (n3.equals("-")){
        System.out.println(resu = n1 - n2);
    }
    else if (n3.equals("/")){
        System.out.println(resu = n1 / n2);
    }
    else if (n3.equals("*")){
        System.out.println(resu = n1 * n2);
    }

    System.out.println("n1" + n1 + n3 + ",n2: " + n2 + resu );

    teclado.close();
    }
}