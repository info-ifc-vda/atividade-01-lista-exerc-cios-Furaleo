/*4. Faça um programa que receba
• O código do produto comprado;
• A quantidade comprada do produto
Calcule e mostre:
• O preço unitário do produto comprado, seguindo a Tabela I;
• O preço total da nota;
• O valor do desconto, seguindo a Tabela II e aplicado sobre o preço total da nota;
• O preço final da nota depois do desconto.
Tabela I
Código Preço
1 a 10 R$ 10,00
11 a 20 R$ 15,00
21 a 30 R$ 20,00
31 a 40 R$ 40,00 */

import java.util.Scanner;
public class Mercado4 {

    public static void main(String[] args) {
        int cod = 0;
        int qua = 0;
        int soma = 0;
        int desconto = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Codigo do Produto Comprado: \n");
        cod = teclado.nextInt();
        System.out.print("A quantidade comprada do produto: \n");
        qua = teclado.nextInt();

        if (cod > 11 ){
            System.out.print("Preco Unitario: 10\n");
            soma= qua*10;
            System.out.print("Preco Total: \n" + soma);
        }
        else if (cod > 21){
            System.out.print("Preco Unitario: 15\n");
            soma= qua*15;
            System.out.print("Preco Total: \n" + soma);
        }
        else if (cod > 31){
            System.out.print("Preco Unitario: 20\n");
            soma= qua*20;
            System.out.print("Preco Total: \n" + soma);
        }
        else if (cod > 41){
            System.out.print("Preco Unitario: 40\n");
            soma= qua*40;
            System.out.print("Preco Total: \n" + soma);
        }
        if (soma <= 250 ){
            System.out.print("Preco Total com Desconto: \n" + (soma*0.95));
        }
        else if (soma >= 250 && soma <= 500 ){
            System.out.print("Preco Total com Desconto: \n" + (soma*0.90));
        }
        else if (soma > 500 ){
            System.out.print("Preco Total com Desconto: \n" + (soma*0.85));

        teclado.close();
    }
    
}
}
