package _27Classes_metodos_parametros_exercicios;

public class Exercicio01 {
    /* Curso de Java - Orientação a Objetos: Correção Exercícios Aula 27: Classes e métodos - Parte 1 */
    /* Escreva uma classe para representar uma lâmpada. Desenvolva métodos para ligar, desliga a lampada */
    public static void main(String[] args) {

        Lampada lampada = new Lampada();

        lampada.ligar();
        lampada.mostrarEstado();
        lampada.desligar();
        lampada.mostrarEstado();
        lampada.mudarEstado();
        lampada.mostrarEstado();
    }
}
