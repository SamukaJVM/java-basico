package _10Switch_case_If_else_exercicios;

import java.util.Scanner;

public class Exercicio18 {
    /* Curso de Java - Correção Exercícios Aula 15 (if-else e switch-case) */
    /* Faça um Programa que peça um número inteiro e determine se ele é par ou impar */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com um número: ");
        int num = scan.nextInt();

        if (num % 2 == 0) {
            System.out.println("par");
        } else {
            System.out.println("ímpar");
        }

    }
}
