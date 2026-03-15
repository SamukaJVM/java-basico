package _25Classes_metodos_simples;

public class Carro {
    /* chamada de métodos com retorno double */
    String marca;
    String modelo;
    int numeroPassageiros;
    double capacidCombustivel;
    double consuCombustivel;

    void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + capacidCombustivel * consuCombustivel + " km");
    }
}
