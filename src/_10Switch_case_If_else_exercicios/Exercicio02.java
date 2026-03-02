package _10Switch_case_If_else_exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        /* Curso de Java - Correção Exercícios Aula 15 (if-else e switch-case) */
        /* Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo */
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com um número: ");
        int num = scan.nextInt();

        if (num >= 0) {
            System.out.println("O número informado é positivo");
        } else {
            System.out.println("O número informado é negativo");
        }
    }
}
