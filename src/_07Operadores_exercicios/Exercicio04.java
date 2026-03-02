package _07Operadores_exercicios;

import java.util.Scanner;

public class Exercicio04 {
    /* Curso de Java - Correção Exercícios Aula 13 */
    /* Faça um Programa que peça o raio de um círculo, calcule e mostre sua área. */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o raio do Círculo: ");
        double raio = scan.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("A área do Círculo é: " + area);
    }
}
