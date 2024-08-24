package Aprendizado;
public class Texto {
    
    public static void main(String[] args) {
        String s = new String ("IFC videira"); //forma tradicional de criar objetos
        String s2; //declaração
        s2 = "IFC videira"; //inicialização
        String s3 = "IFC videira"; //declaração com inicialização

        //012345678910
        //IFC VIDEIRA
        String sub1 = s.substring(4);
        System.out.println("Substring 1: " + sub1);

        String sub2 = s.substring(0, 3); //IFC
        System.out.println("Substring 2: " + sub2);

        System.out.println(s.indexOf("videira"));
        System.out.println(sub2.indexOf("videira"));
        System.out.println(sub1.indexOf("videira"));

        System.out.println("Tamanho da string S: " + s.length());
        System.out.println("Caracter na posição x da string S: " + s.charAt(4));


        String cursosIFC = " Computação: Engenharia Elétrica: Pedagogia: Agronomia";
        String[] vetCursos = cursosIFC.split(":");

        for (int i = 0; i < vetCursos.length; i++){ //for padrão
            System.out.println(vetCursos[i]);
        }

        int i = 0;
        while(i<vetCursos.length){ //while padrão
            System.out.println(vetCursos[i]);
            i++;
        }

        for (String curso : vetCursos){ //percorre o vetor armazenando na variavel esquerda "curso", nome tecnico foreach
            System.out.println(curso);
        }


        if (s.equals(s2)){ //função equals para comparar
            System.out.println("são iguais");
        }else{
            System.out.println("são diferentes");
        }


    }
}
