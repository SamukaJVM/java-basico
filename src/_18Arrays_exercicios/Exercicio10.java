package _18Arrays_exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio10 {
    /* Curso de Java - Correção Exercícios Aula 19 Vetores (Arrays) - Parte 1 */
    /* Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho,
    sendo que cada elemento do vetor B deverá ser o resto da divisão do respectivo elemento
    de A por 2 (dois), ou seja: B[i] := A[i] % 2 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        float[] vetorB = new float[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor da posição VetorA: " + i);
            vetorA[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = vetorA[i] % 2;
        }

        DecimalFormat df = new DecimalFormat("###,###.##");

        System.out.println();
        System.out.println("Vetor de A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(" " + df.format(vetorA[i]));
        }

        System.out.println();
        System.out.println("Vetor de B = ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(" " + df.format(vetorB[i]));
        }
    }
}
