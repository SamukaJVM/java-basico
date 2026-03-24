package _32Encapsulamento_getters_setters;

public class TesteCarro {
    /* Curso de Java 32 - Orientação a Objetos: Encapsulamento: métodos getters e setters */
    public static void main(String[] args) {
        Carro van = new Carro();
        van.setMarca("Fiat");
        System.out.println(van.getMarca());
    }
}
