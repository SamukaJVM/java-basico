package _10Switch_case_If_else_exercicios;

import java.util.Scanner;

public class Exercicio03 {
    /* Curso de Java - Correção Exercícios Aula 15 (if-else e switch-case) */
    /* Faça um Programa que verifique se uma letra digitada é "F" ou "M"
    Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com uma letra (F ou M): ");
        String input = scan.next();

        if (input.equalsIgnoreCase("f")) {
            System.out.println("F - feminino");
        } else if (input.equalsIgnoreCase("m")) {
            System.out.println("M - masculino");
        } else {
            System.out.println("Sexo inválido");
        }
    }
}
