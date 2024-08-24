/*3. Leia os 03 ângulos e os 03 lados de um triângulo, e classifique-o como: retângulo,
obtusângulo ou acutângulo; e equilátero, escaleno ou isósceles.*/

import java.util.Scanner;
public class Triangulo3 {
    
    public static void main(String[] args) {
        int a1 = 0;
        int a2 = 0;
        int a3 = 0;
        int l1 = 0;
        int l2 = 0;
        int l3 = 0;

        Scanner teclado = new Scanner(System.in);

    
       
        System.out.print("Fale os 3 angulos: \n");
        a1 = teclado.nextInt();
        a2 = teclado.nextInt();
        a3 = teclado.nextInt();
        System.out.print("Fale os 3 lados do triangulo: \n");
        l1 = teclado.nextInt();
        l2 = teclado.nextInt();
        l3 = teclado.nextInt();

        if (a1 < 90 && a2 < 90 && a3 < 90 ){
            System.out.print("Triângulo Acutângulo \n");
        }
        else if (a1 > 90 || a2 > 90 || a3 > 90 ){
            System.out.print("Triângulo Obtusângulo \n");
        }
        else if (a1 == 90 || a2 == 90 || a3 == 90 ){
            System.out.print("Triângulo Retângulo \n");
        }
        if (l1 == l2 && l2 == l3) {
            System.out.println("Triângulo Equilátero \n");
        } else if (l1 == l2 || l2 == l3 || l1 == l3) {
            System.out.println("Triângulo Isósceles \n");
        } else {
            System.out.println("Triângulo Escaleno \n");
        }  

        teclado.close();
    }
}
