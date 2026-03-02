package _10Switch_case_If_else_exercicios;

import java.util.Scanner;

public class Exercicio01 {
    /* Curso de Java - Correção Exercícios Aula 15 (if-else e switch-case) */
    /* Faça um Programa que peça dois números e imprima o maior deles */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o primeiro número: ");
        int numero1 = scan.nextInt();

        System.out.print("Entre com o segundo número: ");
        int num2 = scan.nextInt();

        if (numero1 > num2) {
            System.out.println("O número 1 é maior: " + numero1);
        } else {
            System.out.println("O número 1 é maior: " + num2);
        }
    }
}
