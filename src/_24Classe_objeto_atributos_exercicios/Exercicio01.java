package _24Classe_objeto_atributos_exercicios;

public class Exercicio01 {
    /* Curso de Java - Orientação a Objetos: Correção Exercícios Aula 24: Classes e atributos */
    /* Escreva uma classe pararepresentar uma lâmpada que está à venda em um supermercado */
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.modelo = "A50";
        lampada.tensao = "Bivolt";
        lampada.garantiaMeses = 24;
        lampada.potencia = 7;
        lampada.cor = "Amarela";
        lampada.tipoLuz = "Amarela";
        lampada.tipoAbajur = true;
        lampada.tipos = new String[5]; // tipo definido como vetor é necessário instanciar para poder inserir valores
        lampada.tipos[0] = "Abajur";
        lampada.tipos[1] = "Lampeões";
        lampada.tipos[2] = "Lanparina";
        lampada.tipos[3] = "tocha";

        System.out.println(lampada.modelo);
        System.out.println(lampada.tensao);
        System.out.println(lampada.garantiaMeses);
        System.out.println(lampada.potencia);
        System.out.println(lampada.cor);
        System.out.println(lampada.tipoLuz);
        System.out.println(lampada.tipoAbajur);
        System.out.println(lampada.tipos[0]);
        System.out.println(lampada.tipos[1]);
        System.out.println(lampada.tipos[2]);
        System.out.println(lampada.tipos[3]);
    }
}

