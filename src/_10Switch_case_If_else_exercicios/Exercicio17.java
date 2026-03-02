package _10Switch_case_If_else_exercicios;

import java.util.Scanner;

public class Exercicio17 {
    /* Curso de Java - Correção Exercícios Aula 15 (if-else e switch-case) */
    /* Faça um Programa que peça um número correspondente a um determinado ano
    e em seguida informe se este ano é ou não bissexto */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o ano: ");

        int ano = scan.nextInt();

        if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
            System.out.println("é bissexto");
        } else {
            System.out.println("não é bissexto");
        }
    }
}
