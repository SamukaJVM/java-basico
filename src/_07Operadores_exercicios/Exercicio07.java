package _07Operadores_exercicios;

import java.util.Scanner;

public class Exercicio07 {
    /* Curso de Java - Correção Exercícios Aula 13 */
    /* Faça um Programa que peça a temperatura em graus Farenheit, transforme e mostre a temperatura em graus Celsius.
    O C = (5 * (F-32) / 9) */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com a temperatura em Farenheit: ");
        double farenheit = scan.nextDouble();

        double celsius = (5 * (farenheit - 32) / 9);

        System.out.println("A temperatura " + farenheit + "F é igual a " + celsius + "C");
    }
}
