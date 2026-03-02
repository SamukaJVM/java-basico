package _10Switch_case_If_else_exercicios;

import java.util.Scanner;

public class Exercicio19 {
    /* Curso de Java - Correção Exercícios Aula 15 (if-else e switch-case) */
    /* Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual
    operação ele deseja realizar se é (soma, subtração, multiplicação, divisão).
    O resultado da operação deve ser acompanhado de uma frase que diga se o número é:
    a. par ou ímpar;
    b. positivo ou negativo */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o primeiro número: ");
        int numero1 = scan.nextInt();

        System.out.print("Entre com o segundo número: ");
        int numero2 = scan.nextInt();

        System.out.print("Entre com a operação (+ - / *): ");
        String operacao = scan.next();

        double resultado = 0;
        boolean valida = true;

        switch (operacao) {
            case "+":
                resultado = numero1 + numero2;
                break;
            case "-":
                resultado = numero1 - numero2;
                break;
            case "*":
                resultado = numero1 * numero2;
                break;
            case "/":
                resultado = (double) numero1 / numero2;
                break;
            default:
                System.out.println("Operação inválida");
                valida = false;
        }

        if (valida) {
            System.out.println("Resultado: " + resultado);

            if (resultado >= 0) {
                System.out.println("resultado positivo");
            } else {
                System.out.println("resultado negativo");
            }

            if (resultado % 2 == 0) {
                System.out.println("resultado par");
            } else {
                System.out.println("resultado ímpar");
            }
        }
    }
}
