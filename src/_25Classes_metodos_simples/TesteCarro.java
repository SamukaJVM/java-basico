package _25Classes_metodos_simples;

public class TesteCarro {
    /* Curso de Java 25 - Orientação a Objetos: Classes e métodos simples */
    /* chamada de métodos com retorno double */
    public static void main(String[] args) {
        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numeroPassageiros = 10;
        van.capacidCombustivel = 100;
        van.consuCombustivel = 0.2;

        /* System.out.println(van); // referência pro endereço de memória */
        System.out.println(van.modelo);
        System.out.println(van.numeroPassageiros);
        System.out.println(van.capacidCombustivel);
        System.out.println(van.consuCombustivel);

        van.exibirAutonomia();
    }
}
