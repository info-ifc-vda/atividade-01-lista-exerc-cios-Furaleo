/*Em um campeonato de futebol existem cinco times e cada um possui 11 jogadores.
Faça um programa que receba a idade, o peso e a altura de cada um dos jogadores,
calcule e mostre: 
• a quantidade de jogadores com idade inferior a 18 anos;
• a média das idades dos jogadores de cada time;
• a média das alturas de todos os jogadores do campeonato;
• a porcentagem de jogadores com mais de 80kg entre todos os jogadores do campeonato. */

import java.util.Scanner;

public class Futebol5 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final int NUM_TIMES = 5;
        final int NUM_JOGADORES = 11;

        int totalJogadores = NUM_TIMES * NUM_JOGADORES;
        int jogadoresMenores18 = 0;
        int jogadoresMais80kg = 0;
        int somaIdades = 0;
        double somaAlturas = 0;
        
        // Armazena a soma das idades de cada time
        int[] somaIdadesPorTime = new int[NUM_TIMES];

        for (int i = 0; i < NUM_TIMES; i++) {
            System.out.println("Time " + (i + 1) + ":");
            for (int j = 0; j < NUM_JOGADORES; j++) {
                System.out.println("Jogador " + (j + 1) + ":");
                
                System.out.print("Idade: ");
                int idade = scanner.nextInt();
                somaIdades += idade;
                somaIdadesPorTime[i] += idade;
                if (idade < 18) {
                    jogadoresMenores18++;
                }

                System.out.print("Peso (kg): ");
                double peso = scanner.nextDouble();
                if (peso > 80) {
                    jogadoresMais80kg++;
                }

                System.out.print("Altura (m): ");
                double altura = scanner.nextDouble();
                somaAlturas += altura;
            }
        }

        // Calcula e exibe a média das idades de cada time
        for (int i = 0; i < NUM_TIMES; i++) {
            double mediaIdadesTime = (double) somaIdadesPorTime[i] / NUM_JOGADORES;
            System.out.println("Média das idades do Time " + (i + 1) + ": " + mediaIdadesTime);
        }

        // Calcula e exibe a média das alturas de todos os jogadores do campeonato
        double mediaAlturaGeral = somaAlturas / totalJogadores;
        System.out.println("Média das alturas de todos os jogadores: " + mediaAlturaGeral);

        // Calcula e exibe a porcentagem de jogadores com mais de 80kg
        double porcentagemMais80kg = (double) jogadoresMais80kg / totalJogadores * 100;
        System.out.println("Porcentagem de jogadores com mais de 80kg: " + porcentagemMais80kg + "%");

        // Exibe a quantidade de jogadores com idade inferior a 18 anos
        System.out.println("Quantidade de jogadores com menos de 18 anos: " + jogadoresMenores18);

        scanner.close();
    }

}
